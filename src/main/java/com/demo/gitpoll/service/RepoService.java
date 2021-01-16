package com.demo.gitpoll.service;

import com.demo.gitpoll.domain.Repo;
import com.demo.gitpoll.repository.ReposRepository;
import com.demo.gitpoll.security.SecurityUtils;
import com.demo.gitpoll.service.dto.RepoDTO;
import com.demo.gitpoll.service.dto.serialization.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author tom9b
 * @version 1.0.0
 * @Date 1/16/2021 Date file was Created
 * @package com.demo.gitpoll.service
 * @project gitpoll
 */
@Service
@Transactional
public class RepoService {
    private final Logger log = LoggerFactory.getLogger(RepoService.class);
    private final ReposRepository reposRepository;
    private String pageFilter = "&per_page=10"; // May be parameterized later
    private String gitApiUrl = "https://api.github.com/search/repositories?q=all&sort=stars&order=desc";

    public RepoService(ReposRepository reposRepository) {
        this.reposRepository = reposRepository;
    }

    /**
     * @param items
     */
    public void refreshRepoList(List<Item> items) {
        String userLogin = SecurityUtils.getCurrentUserLogin().orElse("");
        List<Repo> repoList = new ArrayList<>();
        items.forEach(t -> {
            Repo repo = new Repo();
            BeanUtils.copyProperties(t, repo);
            repo.setOwner(userLogin);
            repo.setStartGazersCount(t.getStargazersCount());
            repoList.add(repo);
        });
        log.debug("Refreshing {} records for repo list", repoList.size());
        reposRepository.saveAll(repoList);
    }

    /**
     * @return
     */
    public Page<Repo> getRepoList(Pageable pageable) {
        String userLogin = SecurityUtils.getCurrentUserLogin().orElse("");

        //        return reposRepository.findByOwner(PageRequest.of(0, 10), userLogin).map(RepoDTO::new);
        Page<Repo> byOwner = reposRepository.findByOwner(pageable, userLogin);
        byOwner.map(RepoDTO::new);
        return reposRepository.findByOwner(pageable, userLogin);
    }

    /**
     * @param id
     */
    public void updateBookmark(Long id) {
        Optional<Repo> repo = reposRepository.findById(id);
        repo.ifPresent(r -> {
            boolean bookmarked = r.isBookmarked();
            r.setBookmarked(!bookmarked);
            reposRepository.save(r);
            log.debug("Updated bookmarked for {} to {}", r.getFullName(), bookmarked);
        });
    }

}
