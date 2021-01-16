package com.demo.gitpoll.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author tom9b
 * @version 1.0.0
 * @Date 1/16/2021 Date file was Created
 * @package com.demo.gitpoll.domain
 * @project gitpoll
 * <p>
 * Repo details
 */
@Entity
@Table(name = "git_repos")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Repo implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "node_id", nullable = false)
    private String nodeId;
    @Column(name = "html_url", nullable = false)
    private String htmlUrl;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "clone_url", nullable = false)
    private String cloneUrl;
    @Column(name = "open_issues", nullable = false)
    private Long openIssues;
    @Column(name = "stargazers_count", nullable = false)
    private Long stargazersCount;
    @Column(name = "watchers_count", nullable = false)
    private Long watchersCount;
    @Column(name = "full_name", nullable = false)
    private String fullName;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "bookmarked", nullable = false)
    private boolean bookmarked;
    @Column(name = "owner", nullable = false)
    private String owner;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCloneUrl() {
        return cloneUrl;
    }

    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    public Long getOpenIssues() {
        return openIssues;
    }

    public void setOpenIssues(Long openIssues) {
        this.openIssues = openIssues;
    }

    public Long getStartGazersCount() {
        return stargazersCount;
    }

    public void setStartGazersCount(Long stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    public Long getWatchersCount() {
        return watchersCount;
    }

    public void setWatchersCount(Long watchersCount) {
        this.watchersCount = watchersCount;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBookmarked() {
        return bookmarked;
    }

    public void setBookmarked(boolean bookmarked) {
        this.bookmarked = bookmarked;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
