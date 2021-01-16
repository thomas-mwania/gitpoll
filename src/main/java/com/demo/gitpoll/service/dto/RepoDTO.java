package com.demo.gitpoll.service.dto;

import com.demo.gitpoll.domain.Repo;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author tom9b
 * @version 1.0.0
 * @Date 1/16/2021 Date file was Created
 * @package com.demo.gitpoll.service.dto
 * @project gitpoll
 * <p>
 * A DTO representing info we are Longerested in from the git repositories.
 */
public class RepoDTO {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("nodeId")
    private String nodeId;
    @JsonProperty("htmlUrl")
    private String htmlUrl;
    @JsonProperty("description")
    private String description;
    @JsonProperty("cloneUrl")
    private String cloneUrl;
    @JsonProperty("openIssues")
    private Long openIssues;
    @JsonProperty("stargazersCount")
    private Long stargazersCount;
    @JsonProperty("watchersCount")
    private Long watchersCount;
    @JsonProperty("fullName")
    private String fullName;
    @JsonProperty("name")
    private String name;
    @JsonProperty("bookmarked")
    private boolean bookmarked;
    @JsonProperty("owner")
    private String owner;

    public RepoDTO(Long id, String nodeId, String htmlUrl, String description, String cloneUrl, Long openIssues, Long stargazersCount, Long watchersCount, String fullName, String name, boolean bookmarked) {
        this.id = id;
        this.nodeId = nodeId;
        this.htmlUrl = htmlUrl;
        this.description = description;
        this.cloneUrl = cloneUrl;
        this.openIssues = openIssues;
        this.stargazersCount = stargazersCount;
        this.watchersCount = watchersCount;
        this.fullName = fullName;
        this.name = name;
        this.bookmarked = bookmarked;
    }

    public RepoDTO() {

    }

    public RepoDTO(Repo repo) {
    }

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

    @Override
    public String toString() {
        return "RepoDTO{" + "id=" + id + ", nodeId='" + nodeId + '\'' + ", htmlUrl='" + htmlUrl + '\'' + ", description='" + description + '\'' + ", cloneUrl='" + cloneUrl + '\'' + ", openIssues=" + openIssues + ", stargazersCount=" + stargazersCount + ", watchersCount=" + watchersCount + ", fullName='" + fullName + '\'' + ", name='" + name + '\'' + ", bookmarked=" + bookmarked + ", owner='" + owner + '\'' + '}';
    }
}
