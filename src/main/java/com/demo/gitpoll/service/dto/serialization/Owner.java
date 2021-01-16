package com.demo.gitpoll.service.dto.serialization;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"login", "id", "node_id", "avatar_url", "gravatar_id", "url", "html_url", "followers_url", "following_url", "gists_url", "starred_url", "subscriptions_url", "organizations_url", "repos_url", "events_url", "received_events_url", "type", "site_admin"})
public class Owner implements Serializable {
    @JsonProperty("login")
    private String login;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("node_id")
    private String nodeId;
    @JsonProperty("avatar_url")
    private String avatarUrl;
    @JsonProperty("gravatar_id")
    private String gravatarId;
    @JsonProperty("url")
    private String url;
    @JsonProperty("html_url")
    private String htmlUrl;
    @JsonProperty("followers_url")
    private String followersUrl;
    @JsonProperty("following_url")
    private String followingUrl;
    @JsonProperty("gists_url")
    private String gistsUrl;
    @JsonProperty("starred_url")
    private String starredUrl;
    @JsonProperty("subscriptions_url")
    private String subscriptionsUrl;
    @JsonProperty("organizations_url")
    private String organizationsUrl;
    @JsonProperty("repos_url")
    private String reposUrl;
    @JsonProperty("events_url")
    private String eventsUrl;
    @JsonProperty("received_events_url")
    private String receivedEventsUrl;
    @JsonProperty("type")
    private String type;
    @JsonProperty("site_admin")
    private boolean siteAdmin;
    private final static long serialVersionUID = 291538595352066161L;

    @JsonProperty("login")
    public String getLogin() {
        return login;
    }

    @JsonProperty("login")
    public void setLogin(String login) {
        this.login = login;
    }

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    @JsonProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonProperty("avatar_url")
    public String getAvatarUrl() {
        return avatarUrl;
    }

    @JsonProperty("avatar_url")
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    @JsonProperty("gravatar_id")
    public String getGravatarId() {
        return gravatarId;
    }

    @JsonProperty("gravatar_id")
    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    @JsonProperty("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonProperty("followers_url")
    public String getFollowersUrl() {
        return followersUrl;
    }

    @JsonProperty("followers_url")
    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }

    @JsonProperty("following_url")
    public String getFollowingUrl() {
        return followingUrl;
    }

    @JsonProperty("following_url")
    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }

    @JsonProperty("gists_url")
    public String getGistsUrl() {
        return gistsUrl;
    }

    @JsonProperty("gists_url")
    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    @JsonProperty("starred_url")
    public String getStarredUrl() {
        return starredUrl;
    }

    @JsonProperty("starred_url")
    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    @JsonProperty("subscriptions_url")
    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    @JsonProperty("subscriptions_url")
    public void setSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }

    @JsonProperty("organizations_url")
    public String getOrganizationsUrl() {
        return organizationsUrl;
    }

    @JsonProperty("organizations_url")
    public void setOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    @JsonProperty("repos_url")
    public String getReposUrl() {
        return reposUrl;
    }

    @JsonProperty("repos_url")
    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
    }

    @JsonProperty("events_url")
    public String getEventsUrl() {
        return eventsUrl;
    }

    @JsonProperty("events_url")
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    @JsonProperty("received_events_url")
    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    @JsonProperty("received_events_url")
    public void setReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("site_admin")
    public boolean isSiteAdmin() {
        return siteAdmin;
    }

    @JsonProperty("site_admin")
    public void setSiteAdmin(boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
        "id",
        "node_id",
        "name",
        "full_name",
        "private",
        "owner",
        "html_url",
        "description",
        "fork",
        "url",
        "forks_url",
        "keys_url",
        "collaborators_url",
        "teams_url",
        "hooks_url",
        "issue_events_url",
        "events_url",
        "assignees_url",
        "branches_url",
        "tags_url",
        "blobs_url",
        "git_tags_url",
        "git_refs_url",
        "trees_url",
        "statuses_url",
        "languages_url",
        "contributors_url",
        "subscribers_url",
        "subscription_url",
        "commits_url",
        "git_commits_url",
        "comments_url",
        "issue_comment_url",
        "contents_url",
        "compare_url",
        "merges_url",
        "archive_url",
        "downloads_url",
        "issues_url",
        "pulls_url",
        "milestones_url",
        "notifications_url",
        "labels_url",
        "releases_url",
        "deployments_url",
        "created_at",
        "updated_at",
        "pushed_at",
        "git_url",
        "ssh_url",
        "clone_url",
        "svn_url",
        "homepage",
        "size",
        "stargazers_count",
        "watchers_count",
        "language",
        "has_issues",
        "has_projects",
        "has_downloads",
        "has_wiki",
        "has_pages",
        "forks_count",
        "mirror_url",
        "archived",
        "disabled",
        "open_issues_count",
        "license",
        "forks",
        "open_issues",
        "watchers",
        "default_branch",
        "score"
    })
    public class Item implements Serializable
    {

        @JsonProperty("id")
        private Long id;
        @JsonProperty("node_id")
        private String nodeId;
        @JsonProperty("name")
        private String name;
        @JsonProperty("full_name")
        private String fullName;
        @JsonProperty("private")
        private boolean _private;
        @JsonProperty("owner")
        private Owner owner;
        @JsonProperty("html_url")
        private String htmlUrl;
        @JsonProperty("description")
        private String description;
        @JsonProperty("fork")
        private boolean fork;
        @JsonProperty("url")
        private String url;
        @JsonProperty("forks_url")
        private String forksUrl;
        @JsonProperty("keys_url")
        private String keysUrl;
        @JsonProperty("collaborators_url")
        private String collaboratorsUrl;
        @JsonProperty("teams_url")
        private String teamsUrl;
        @JsonProperty("hooks_url")
        private String hooksUrl;
        @JsonProperty("issue_events_url")
        private String issueEventsUrl;
        @JsonProperty("events_url")
        private String eventsUrl;
        @JsonProperty("assignees_url")
        private String assigneesUrl;
        @JsonProperty("branches_url")
        private String branchesUrl;
        @JsonProperty("tags_url")
        private String tagsUrl;
        @JsonProperty("blobs_url")
        private String blobsUrl;
        @JsonProperty("git_tags_url")
        private String gitTagsUrl;
        @JsonProperty("git_refs_url")
        private String gitRefsUrl;
        @JsonProperty("trees_url")
        private String treesUrl;
        @JsonProperty("statuses_url")
        private String statusesUrl;
        @JsonProperty("languages_url")
        private String languagesUrl;

        @JsonProperty("contributors_url")
        private String contributorsUrl;
        @JsonProperty("subscribers_url")
        private String subscribersUrl;
        @JsonProperty("subscription_url")
        private String subscriptionUrl;
        @JsonProperty("commits_url")
        private String commitsUrl;
        @JsonProperty("git_commits_url")
        private String gitCommitsUrl;
        @JsonProperty("comments_url")
        private String commentsUrl;
        @JsonProperty("issue_comment_url")
        private String issueCommentUrl;
        @JsonProperty("contents_url")
        private String contentsUrl;
        @JsonProperty("compare_url")
        private String compareUrl;
        @JsonProperty("merges_url")
        private String mergesUrl;
        @JsonProperty("archive_url")
        private String archiveUrl;
        @JsonProperty("downloads_url")
        private String downloadsUrl;
        @JsonProperty("issues_url")
        private String issuesUrl;
        @JsonProperty("pulls_url")
        private String pullsUrl;
        @JsonProperty("milestones_url")
        private String milestonesUrl;
        @JsonProperty("notifications_url")
        private String notificationsUrl;
        @JsonProperty("labels_url")
        private String labelsUrl;
        @JsonProperty("releases_url")
        private String releasesUrl;
        @JsonProperty("deployments_url")
        private String deploymentsUrl;
        @JsonProperty("created_at")
        private String createdAt;
        @JsonProperty("updated_at")
        private String updatedAt;
        @JsonProperty("pushed_at")
        private String pushedAt;
        @JsonProperty("git_url")
        private String gitUrl;
        @JsonProperty("ssh_url")
        private String sshUrl;
        @JsonProperty("clone_url")
        private String cloneUrl;
        @JsonProperty("svn_url")
        private String svnUrl;
        @JsonProperty("homepage")
        private String homepage;
        @JsonProperty("size")
        private Long size;
        @JsonProperty("stargazers_count")
        private Long stargazersCount;
        @JsonProperty("watchers_count")
        private Long watchersCount;
        @JsonProperty("language")
        private String language;
        @JsonProperty("has_issues")
        private boolean hasIssues;
        @JsonProperty("has_projects")
        private boolean hasProjects;
        @JsonProperty("has_downloads")
        private boolean hasDownloads;
        @JsonProperty("has_wiki")
        private boolean hasWiki;
        @JsonProperty("has_pages")
        private boolean hasPages;
        @JsonProperty("forks_count")
        private Long forksCount;
        @JsonProperty("mirror_url")
        private Object mirrorUrl;
        @JsonProperty("archived")
        private boolean archived;
        @JsonProperty("disabled")
        private boolean disabled;
        @JsonProperty("open_issues_count")
        private Long openIssuesCount;
        @JsonProperty("license")
        private License license;
        @JsonProperty("forks")
        private Long forks;
        @JsonProperty("open_issues")
        private Long openIssues;
        @JsonProperty("watchers")
        private Long watchers;
        @JsonProperty("default_branch")
        private String defaultBranch;
        @JsonProperty("score")
        private Long score;
        private final static long serialVersionUID = 4892489454021322880L;

        @JsonProperty("id")
        public Long getId() {
            return id;
        }

        @JsonProperty("id")
        public void setId(Long id) {
            this.id = id;
        }

        @JsonProperty("node_id")
        public String getNodeId() {
            return nodeId;
        }

        @JsonProperty("node_id")
        public void setNodeId(String nodeId) {
            this.nodeId = nodeId;
        }

        @JsonProperty("name")
        public String getName() {
            return name;
        }

        @JsonProperty("name")
        public void setName(String name) {
            this.name = name;
        }

        @JsonProperty("full_name")
        public String getFullName() {
            return fullName;
        }

        @JsonProperty("full_name")
        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        @JsonProperty("private")
        public boolean isPrivate() {
            return _private;
        }

        @JsonProperty("private")
        public void setPrivate(boolean _private) {
            this._private = _private;
        }

        @JsonProperty("owner")
        public Owner getOwner() {
            return owner;
        }

        @JsonProperty("owner")
        public void setOwner(Owner owner) {
            this.owner = owner;
        }

        @JsonProperty("html_url")
        public String getHtmlUrl() {
            return htmlUrl;
        }

        @JsonProperty("html_url")
        public void setHtmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
        }

        @JsonProperty("description")
        public String getDescription() {
            return description;
        }

        @JsonProperty("description")
        public void setDescription(String description) {
            this.description = description;
        }

        @JsonProperty("fork")
        public boolean isFork() {
            return fork;
        }

        @JsonProperty("fork")
        public void setFork(boolean fork) {
            this.fork = fork;
        }

        @JsonProperty("url")
        public String getUrl() {
            return url;
        }

        @JsonProperty("url")
        public void setUrl(String url) {
            this.url = url;
        }

        @JsonProperty("forks_url")
        public String getForksUrl() {
            return forksUrl;
        }

        @JsonProperty("forks_url")
        public void setForksUrl(String forksUrl) {
            this.forksUrl = forksUrl;
        }

        @JsonProperty("keys_url")
        public String getKeysUrl() {
            return keysUrl;
        }

        @JsonProperty("keys_url")
        public void setKeysUrl(String keysUrl) {
            this.keysUrl = keysUrl;
        }

        @JsonProperty("collaborators_url")
        public String getCollaboratorsUrl() {
            return collaboratorsUrl;
        }

        @JsonProperty("collaborators_url")
        public void setCollaboratorsUrl(String collaboratorsUrl) {
            this.collaboratorsUrl = collaboratorsUrl;
        }

        @JsonProperty("teams_url")
        public String getTeamsUrl() {
            return teamsUrl;
        }

        @JsonProperty("teams_url")
        public void setTeamsUrl(String teamsUrl) {
            this.teamsUrl = teamsUrl;
        }

        @JsonProperty("hooks_url")
        public String getHooksUrl() {
            return hooksUrl;
        }

        @JsonProperty("hooks_url")
        public void setHooksUrl(String hooksUrl) {
            this.hooksUrl = hooksUrl;
        }

        @JsonProperty("issue_events_url")
        public String getIssueEventsUrl() {
            return issueEventsUrl;
        }

        @JsonProperty("issue_events_url")
        public void setIssueEventsUrl(String issueEventsUrl) {
            this.issueEventsUrl = issueEventsUrl;
        }

        @JsonProperty("events_url")
        public String getEventsUrl() {
            return eventsUrl;
        }

        @JsonProperty("events_url")
        public void setEventsUrl(String eventsUrl) {
            this.eventsUrl = eventsUrl;
        }

        @JsonProperty("assignees_url")
        public String getAssigneesUrl() {
            return assigneesUrl;
        }

        @JsonProperty("assignees_url")
        public void setAssigneesUrl(String assigneesUrl) {
            this.assigneesUrl = assigneesUrl;
        }

        @JsonProperty("branches_url")
        public String getBranchesUrl() {
            return branchesUrl;
        }

        @JsonProperty("branches_url")
        public void setBranchesUrl(String branchesUrl) {
            this.branchesUrl = branchesUrl;
        }

        @JsonProperty("tags_url")
        public String getTagsUrl() {
            return tagsUrl;
        }

        @JsonProperty("tags_url")
        public void setTagsUrl(String tagsUrl) {
            this.tagsUrl = tagsUrl;
        }

        @JsonProperty("blobs_url")
        public String getBlobsUrl() {
            return blobsUrl;
        }

        @JsonProperty("blobs_url")
        public void setBlobsUrl(String blobsUrl) {
            this.blobsUrl = blobsUrl;
        }

        @JsonProperty("git_tags_url")
        public String getGitTagsUrl() {
            return gitTagsUrl;
        }

        @JsonProperty("git_tags_url")
        public void setGitTagsUrl(String gitTagsUrl) {
            this.gitTagsUrl = gitTagsUrl;
        }

        @JsonProperty("git_refs_url")
        public String getGitRefsUrl() {
            return gitRefsUrl;
        }

        @JsonProperty("git_refs_url")
        public void setGitRefsUrl(String gitRefsUrl) {
            this.gitRefsUrl = gitRefsUrl;
        }

        @JsonProperty("trees_url")
        public String getTreesUrl() {
            return treesUrl;
        }

        @JsonProperty("trees_url")
        public void setTreesUrl(String treesUrl) {
            this.treesUrl = treesUrl;
        }

        @JsonProperty("statuses_url")
        public String getStatusesUrl() {
            return statusesUrl;
        }

        @JsonProperty("statuses_url")
        public void setStatusesUrl(String statusesUrl) {
            this.statusesUrl = statusesUrl;
        }

        @JsonProperty("languages_url")
        public String getLanguagesUrl() {
            return languagesUrl;
        }

        @JsonProperty("languages_url")
        public void setLanguagesUrl(String languagesUrl) {
            this.languagesUrl = languagesUrl;
        }


        @JsonProperty("contributors_url")
        public String getContributorsUrl() {
            return contributorsUrl;
        }

        @JsonProperty("contributors_url")
        public void setContributorsUrl(String contributorsUrl) {
            this.contributorsUrl = contributorsUrl;
        }

        @JsonProperty("subscribers_url")
        public String getSubscribersUrl() {
            return subscribersUrl;
        }

        @JsonProperty("subscribers_url")
        public void setSubscribersUrl(String subscribersUrl) {
            this.subscribersUrl = subscribersUrl;
        }

        @JsonProperty("subscription_url")
        public String getSubscriptionUrl() {
            return subscriptionUrl;
        }

        @JsonProperty("subscription_url")
        public void setSubscriptionUrl(String subscriptionUrl) {
            this.subscriptionUrl = subscriptionUrl;
        }

        @JsonProperty("commits_url")
        public String getCommitsUrl() {
            return commitsUrl;
        }

        @JsonProperty("commits_url")
        public void setCommitsUrl(String commitsUrl) {
            this.commitsUrl = commitsUrl;
        }

        @JsonProperty("git_commits_url")
        public String getGitCommitsUrl() {
            return gitCommitsUrl;
        }

        @JsonProperty("git_commits_url")
        public void setGitCommitsUrl(String gitCommitsUrl) {
            this.gitCommitsUrl = gitCommitsUrl;
        }

        @JsonProperty("comments_url")
        public String getCommentsUrl() {
            return commentsUrl;
        }

        @JsonProperty("comments_url")
        public void setCommentsUrl(String commentsUrl) {
            this.commentsUrl = commentsUrl;
        }

        @JsonProperty("issue_comment_url")
        public String getIssueCommentUrl() {
            return issueCommentUrl;
        }

        @JsonProperty("issue_comment_url")
        public void setIssueCommentUrl(String issueCommentUrl) {
            this.issueCommentUrl = issueCommentUrl;
        }

        @JsonProperty("contents_url")
        public String getContentsUrl() {
            return contentsUrl;
        }

        @JsonProperty("contents_url")
        public void setContentsUrl(String contentsUrl) {
            this.contentsUrl = contentsUrl;
        }

        @JsonProperty("compare_url")
        public String getCompareUrl() {
            return compareUrl;
        }

        @JsonProperty("compare_url")
        public void setCompareUrl(String compareUrl) {
            this.compareUrl = compareUrl;
        }

        @JsonProperty("merges_url")
        public String getMergesUrl() {
            return mergesUrl;
        }

        @JsonProperty("merges_url")
        public void setMergesUrl(String mergesUrl) {
            this.mergesUrl = mergesUrl;
        }

        @JsonProperty("archive_url")
        public String getArchiveUrl() {
            return archiveUrl;
        }

        @JsonProperty("archive_url")
        public void setArchiveUrl(String archiveUrl) {
            this.archiveUrl = archiveUrl;
        }

        @JsonProperty("downloads_url")
        public String getDownloadsUrl() {
            return downloadsUrl;
        }

        @JsonProperty("downloads_url")
        public void setDownloadsUrl(String downloadsUrl) {
            this.downloadsUrl = downloadsUrl;
        }

        @JsonProperty("issues_url")
        public String getIssuesUrl() {
            return issuesUrl;
        }

        @JsonProperty("issues_url")
        public void setIssuesUrl(String issuesUrl) {
            this.issuesUrl = issuesUrl;
        }

        @JsonProperty("pulls_url")
        public String getPullsUrl() {
            return pullsUrl;
        }

        @JsonProperty("pulls_url")
        public void setPullsUrl(String pullsUrl) {
            this.pullsUrl = pullsUrl;
        }

        @JsonProperty("milestones_url")
        public String getMilestonesUrl() {
            return milestonesUrl;
        }

        @JsonProperty("milestones_url")
        public void setMilestonesUrl(String milestonesUrl) {
            this.milestonesUrl = milestonesUrl;
        }

        @JsonProperty("notifications_url")
        public String getNotificationsUrl() {
            return notificationsUrl;
        }

        @JsonProperty("notifications_url")
        public void setNotificationsUrl(String notificationsUrl) {
            this.notificationsUrl = notificationsUrl;
        }

        @JsonProperty("labels_url")
        public String getLabelsUrl() {
            return labelsUrl;
        }

        @JsonProperty("labels_url")
        public void setLabelsUrl(String labelsUrl) {
            this.labelsUrl = labelsUrl;
        }

        @JsonProperty("releases_url")
        public String getReleasesUrl() {
            return releasesUrl;
        }

        @JsonProperty("releases_url")
        public void setReleasesUrl(String releasesUrl) {
            this.releasesUrl = releasesUrl;
        }

        @JsonProperty("deployments_url")
        public String getDeploymentsUrl() {
            return deploymentsUrl;
        }

        @JsonProperty("deployments_url")
        public void setDeploymentsUrl(String deploymentsUrl) {
            this.deploymentsUrl = deploymentsUrl;
        }

        @JsonProperty("created_at")
        public String getCreatedAt() {
            return createdAt;
        }

        @JsonProperty("created_at")
        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        @JsonProperty("updated_at")
        public String getUpdatedAt() {
            return updatedAt;
        }

        @JsonProperty("updated_at")
        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        @JsonProperty("pushed_at")
        public String getPushedAt() {
            return pushedAt;
        }

        @JsonProperty("pushed_at")
        public void setPushedAt(String pushedAt) {
            this.pushedAt = pushedAt;
        }

        @JsonProperty("git_url")
        public String getGitUrl() {
            return gitUrl;
        }

        @JsonProperty("git_url")
        public void setGitUrl(String gitUrl) {
            this.gitUrl = gitUrl;
        }

        @JsonProperty("ssh_url")
        public String getSshUrl() {
            return sshUrl;
        }

        @JsonProperty("ssh_url")
        public void setSshUrl(String sshUrl) {
            this.sshUrl = sshUrl;
        }

        @JsonProperty("clone_url")
        public String getCloneUrl() {
            return cloneUrl;
        }

        @JsonProperty("clone_url")
        public void setCloneUrl(String cloneUrl) {
            this.cloneUrl = cloneUrl;
        }

        @JsonProperty("svn_url")
        public String getSvnUrl() {
            return svnUrl;
        }

        @JsonProperty("svn_url")
        public void setSvnUrl(String svnUrl) {
            this.svnUrl = svnUrl;
        }

        @JsonProperty("homepage")
        public String getHomepage() {
            return homepage;
        }

        @JsonProperty("homepage")
        public void setHomepage(String homepage) {
            this.homepage = homepage;
        }

        @JsonProperty("size")
        public Long getSize() {
            return size;
        }

        @JsonProperty("size")
        public void setSize(Long size) {
            this.size = size;
        }

        @JsonProperty("stargazers_count")
        public Long getStargazersCount() {
            return stargazersCount;
        }

        @JsonProperty("stargazers_count")
        public void setStargazersCount(Long stargazersCount) {
            this.stargazersCount = stargazersCount;
        }

        @JsonProperty("watchers_count")
        public Long getWatchersCount() {
            return watchersCount;
        }

        @JsonProperty("watchers_count")
        public void setWatchersCount(Long watchersCount) {
            this.watchersCount = watchersCount;
        }

        @JsonProperty("language")
        public String getLanguage() {
            return language;
        }

        @JsonProperty("language")
        public void setLanguage(String language) {
            this.language = language;
        }

        @JsonProperty("has_issues")
        public boolean isHasIssues() {
            return hasIssues;
        }

        @JsonProperty("has_issues")
        public void setHasIssues(boolean hasIssues) {
            this.hasIssues = hasIssues;
        }

        @JsonProperty("has_projects")
        public boolean isHasProjects() {
            return hasProjects;
        }

        @JsonProperty("has_projects")
        public void setHasProjects(boolean hasProjects) {
            this.hasProjects = hasProjects;
        }

        @JsonProperty("has_downloads")
        public boolean isHasDownloads() {
            return hasDownloads;
        }

        @JsonProperty("has_downloads")
        public void setHasDownloads(boolean hasDownloads) {
            this.hasDownloads = hasDownloads;
        }

        @JsonProperty("has_wiki")
        public boolean isHasWiki() {
            return hasWiki;
        }

        @JsonProperty("has_wiki")
        public void setHasWiki(boolean hasWiki) {
            this.hasWiki = hasWiki;
        }

        @JsonProperty("has_pages")
        public boolean isHasPages() {
            return hasPages;
        }

        @JsonProperty("has_pages")
        public void setHasPages(boolean hasPages) {
            this.hasPages = hasPages;
        }

        @JsonProperty("forks_count")
        public Long getForksCount() {
            return forksCount;
        }

        @JsonProperty("forks_count")
        public void setForksCount(Long forksCount) {
            this.forksCount = forksCount;
        }

        @JsonProperty("mirror_url")
        public Object getMirrorUrl() {
            return mirrorUrl;
        }

        @JsonProperty("mirror_url")
        public void setMirrorUrl(Object mirrorUrl) {
            this.mirrorUrl = mirrorUrl;
        }

        @JsonProperty("archived")
        public boolean isArchived() {
            return archived;
        }

        @JsonProperty("archived")
        public void setArchived(boolean archived) {
            this.archived = archived;
        }

        @JsonProperty("disabled")
        public boolean isDisabled() {
            return disabled;
        }

        @JsonProperty("disabled")
        public void setDisabled(boolean disabled) {
            this.disabled = disabled;
        }

        @JsonProperty("open_issues_count")
        public Long getOpenIssuesCount() {
            return openIssuesCount;
        }

        @JsonProperty("open_issues_count")
        public void setOpenIssuesCount(Long openIssuesCount) {
            this.openIssuesCount = openIssuesCount;
        }

        @JsonProperty("license")
        public License getLicense() {
            return license;
        }

        @JsonProperty("license")
        public void setLicense(License license) {
            this.license = license;
        }

        @JsonProperty("forks")
        public Long getForks() {
            return forks;
        }

        @JsonProperty("forks")
        public void setForks(Long forks) {
            this.forks = forks;
        }

        @JsonProperty("open_issues")
        public Long getOpenIssues() {
            return openIssues;
        }

        @JsonProperty("open_issues")
        public void setOpenIssues(Long openIssues) {
            this.openIssues = openIssues;
        }

        @JsonProperty("watchers")
        public Long getWatchers() {
            return watchers;
        }

        @JsonProperty("watchers")
        public void setWatchers(Long watchers) {
            this.watchers = watchers;
        }

        @JsonProperty("default_branch")
        public String getDefaultBranch() {
            return defaultBranch;
        }

        @JsonProperty("default_branch")
        public void setDefaultBranch(String defaultBranch) {
            this.defaultBranch = defaultBranch;
        }

        @JsonProperty("score")
        public Long getScore() {
            return score;
        }

        @JsonProperty("score")
        public void setScore(Long score) {
            this.score = score;
        }

    }
}
