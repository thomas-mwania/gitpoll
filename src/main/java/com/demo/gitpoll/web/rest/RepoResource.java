package com.demo.gitpoll.web.rest;

import com.demo.gitpoll.domain.Repo;
import com.demo.gitpoll.repository.ReposRepository;
import com.demo.gitpoll.service.RepoService;
import com.demo.gitpoll.service.dto.RepoDTO;
import com.demo.gitpoll.service.dto.serialization.Item;
import com.demo.gitpoll.service.dto.serialization.RepoResponseDTO;
import com.demo.gitpoll.utils.HttpUtils;
import com.demo.gitpoll.utils.ResponseModel;
import com.demo.gitpoll.web.rest.errors.EmailAlreadyUsedException;
import com.demo.gitpoll.web.rest.errors.LoginAlreadyUsedException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.jhipster.web.util.HeaderUtil;
import io.github.jhipster.web.util.PaginationUtil;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author tom9b
 * @version 1.0.0
 * @Date 1/16/2021 Date file was Created
 * @package com.demo.gitpoll.web.rest
 * @project gitpoll
 * <p>
 * REST controller for managing users.
 * * <p>
 * * This class accesses the {@link com.demo.gitpoll.domain.Repo} entity.
 * * <p>
 */
@RestController
@RequestMapping("/api")
public class RepoResource {
    private static final List<String> ALLOWED_ORDERED_PROPERTIES = Collections.unmodifiableList(Arrays.asList("id", "login", "firstName", "lastName", "email", "activated", "langKey"));
    private final Logger log = LoggerFactory.getLogger(UserResource.class);
    private final HttpUtils httpUtils;
    @Value("${jhipster.clientApp.name}")
    private String applicationName;
    private final RepoService repoService;
    private final ReposRepository reposRepository;
    private String pageFilter = "&per_page=10"; // May be parameterized later
    private String gitApiUrl = "https://api.github.com/search/repositories?q=all&sort=stars&order=desc";

    public RepoResource(HttpUtils httpUtils, RepoService repoService, ReposRepository reposRepository) {
        this.httpUtils = httpUtils;
        this.repoService = repoService;
        this.reposRepository = reposRepository;
    }

    /**
     * {@code GET //polls/bookmarks} : get all users.
     *
     * @param pageable the pagination information.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body all users.
     */
    @GetMapping("/polls/bookmarks")
    public ResponseEntity<List<Repo>> getAllUsers(Pageable pageable) {
        if (!onlyContainsAllowedProperties(pageable)) {
            return ResponseEntity.badRequest().build();
        }
        final Page<Repo> page = repoService.getRepoList(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(ServletUriComponentsBuilder.fromCurrentRequest(), page);
        return new ResponseEntity<>(page.getContent(), headers, HttpStatus.OK);
    }

    /**
     * {@code GET /users} : get all users.
     *
     * @param pageable the pagination information.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body all users.
     */
    @GetMapping("/polls/refresh")
    public ResponseEntity<?> refreshAll() {
        try {
            String response = httpUtils.sendHttpRawGet(gitApiUrl + pageFilter);
            log.debug("Response from GIT : [{{}}]", response);
            RepoResponseDTO responseDTO = new ObjectMapper().readerFor(RepoResponseDTO.class).readValue(response);
            List<Item> items = responseDTO.getItems();
            log.debug("Refreshing Database with {} items", items.size());
            repoService.refreshRepoList(items);
            return new ResponseEntity<>(new ResponseModel("ok", "Refresh Successful").toString(), HttpHeaders.EMPTY, HttpStatus.ACCEPTED);
        } catch (IOException e) {
            log.error(new Object() {
            }.getClass().getEnclosingMethod().getName(), e);
            return new ResponseEntity<>(new ResponseModel("exception", "An exception occurred").toString(), HttpHeaders.EMPTY, HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

    /**
     * {@code PUT /users} : Updates an existing User.
     *
     * @param repoDTO the user to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated user.
     * @throws EmailAlreadyUsedException {@code 400 (Bad Request)} if the email is already in use.
     * @throws LoginAlreadyUsedException {@code 400 (Bad Request)} if the login is already in use.
     */
    @PutMapping("/polls/bookmark")
    @PreAuthorize("isAuthenticated()")
    public ResponseEntity<RepoDTO> updateBookmark(@Valid @RequestBody RepoDTO repoDTO) {
        log.debug("REST request to update User : {}", repoDTO);
        Optional<Repo> existingRepo = reposRepository.findById(repoDTO.getId());
        existingRepo.ifPresent(r -> repoService.updateBookmark(r.getId()));
        //      existingRepo.ifPresentOrElse(r->repoService.updateBookmark((long) r.getId())).;
        Optional<RepoDTO> dto = reposRepository.findById(repoDTO.getId()).map(RepoDTO::new);
        return ResponseUtil.wrapOrNotFound(dto, HeaderUtil.createAlert(applicationName, "Record Updated", ""));
    }

    private boolean onlyContainsAllowedProperties(Pageable pageable) {
        return pageable.getSort().stream().map(Sort.Order::getProperty).allMatch(ALLOWED_ORDERED_PROPERTIES::contains);
    }

}
