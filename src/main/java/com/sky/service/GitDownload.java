package com.sky.service;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.internal.storage.file.FileRepository;
import org.eclipse.jgit.lib.Repository;

import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import org.junit.Test;

import java.io.File;

public class GitDownload {
    private String localPath;
    private Repository localRepo;
    private Git git;

    @Test
    public void tt(){
        download("test","git://github.com/orhanobut/bee.git","master");
    }

    /**
     * git代码下载
     */
    public String download(String projectName, String gitUrl,String branch) {
        if((gitUrl == null) || gitUrl.equals("")){
            return "git仓库地址不能为空";
        }
        //认证凭据
        UsernamePasswordCredentialsProvider credentialsProvider = new UsernamePasswordCredentialsProvider("shaoyikang@buaa.edu.cn","zy2014203");
        try {
            //代码指定存储目录
            localPath = "D:\\git_repository" + File.separator + projectName;
            System.out.println("============localPath==========" + localPath);
            localRepo = new FileRepository(localPath + "/.git");
            git = new Git(localRepo);
            File localPathFile = new File(localPath);
            if (!localPathFile.exists()) {
                gitClone(gitUrl, branch, localPath,credentialsProvider);
                System.out.println("正在下载");
            } else {
                gitPull(branch,credentialsProvider);
                System.out.println("更新");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return localPath;
    }

    /**
     * 如果没有该代码目录,执行git clone
     */
    private void gitClone(String gitUrl, String branch, String localPath,UsernamePasswordCredentialsProvider credentialsProvider) throws Exception {
        Git.cloneRepository().setURI(gitUrl).setBranch(branch)
                .setDirectory(new File(localPath)).setCredentialsProvider(credentialsProvider).call();
    }

    /**
     * 如果有代码,git pull
     */
    private void gitPull(String branch,UsernamePasswordCredentialsProvider credentialsProvider) throws Exception {
        git.pull().setRemoteBranchName(branch).setCredentialsProvider(credentialsProvider).call();
    }
}
