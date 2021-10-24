package com.sky.polo;


public class GitResult {
    private String gitUrl;
    private String defaultBranch;
    private int id;
    private String name;
    private String full_name;
    private String forks;
    private String localFilePath;
    private String authority;
    private String repository;

    public GitResult() {
    }

    public GitResult(String gitUrl, String defaultBranch, int id, String name, String full_name,
                     String forks, String localFilePath, String authority, String repository) {
        this.gitUrl = gitUrl;
        this.defaultBranch = defaultBranch;
        this.id = id;
        this.name = name;
        this.full_name = full_name;
        this.forks = forks;
        this.localFilePath = localFilePath;
        this.authority = authority;
        this.repository = repository;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getForks() {
        return forks;
    }

    public void setForks(String forks) {
        this.forks = forks;
    }

    public String getLocalFilePath() {
        return localFilePath;
    }

    public void setLocalFilePath(String localFilePath) {
        this.localFilePath = localFilePath;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }
}
