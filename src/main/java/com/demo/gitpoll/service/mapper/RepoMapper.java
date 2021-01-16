package com.demo.gitpoll.service.mapper;

import com.demo.gitpoll.domain.Repo;
import com.demo.gitpoll.service.dto.RepoDTO;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author tom9b
 * @version 1.0.0
 * @Date 1/16/2021 Date file was Created
 * @package com.demo.gitpoll.service.mapper
 * @project gitpoll
 */
public class RepoMapper {
    public List<RepoDTO> ReposToRepoDTOs(List<Repo> Repos) {
        return Repos.stream().filter(Objects::nonNull).map(this::RepoToRepoDTO).collect(Collectors.toList());
    }

    public RepoDTO RepoToRepoDTO(Repo repo) {
        return new RepoDTO(repo);
    }

    public List<Repo> RepoDTOsToRepos(List<RepoDTO> repoDTOS) {

        return repoDTOS.stream().filter(Objects::nonNull).map(this::RepoDTOToRepo).collect(Collectors.toList());
    }

    public Repo RepoDTOToRepo(RepoDTO repoDTO) {
        if (repoDTO == null) {
            return null;
        } else {
            Repo repo = new Repo();
            repo.setId(repoDTO.getId());
            repo.setOwner(repoDTO.getOwner());
            repo.setBookmarked(repoDTO.isBookmarked());
            repo.setCloneUrl(repoDTO.getCloneUrl());
            repo.setDescription(repoDTO.getDescription());
            repo.setFullName(repoDTO.getFullName());
            repo.setHtmlUrl(repoDTO.getHtmlUrl());
            repo.setWatchersCount(repoDTO.getWatchersCount());
            repo.setName(repoDTO.getName());
            repo.setNodeId(repoDTO.getNodeId());
            repo.setOpenIssues(repoDTO.getOpenIssues());
            repo.setStartGazersCount(repoDTO.getStartGazersCount());
            return repo;
        }
    }

    public Repo RepoFromId(Long id) {
        if (id == null) {
            return null;
        }
        Repo Repo = new Repo();
        Repo.setId(id);
        return Repo;
    }
}
