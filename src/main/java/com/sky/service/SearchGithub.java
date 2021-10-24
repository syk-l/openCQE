package com.sky.service;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import java.io.IOException;

public class SearchGithub {
    @Test
    public void ccc() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet httpget = new HttpGet("https://api.github.com/search/repositories" +
                "?q=b+language:java&sort=stars&order=desc&per_page=100&page=10");
        CloseableHttpResponse response ;
        httpget.setHeader("Accept","application/vnd.github.v3+json");

        response = httpClient.execute(httpget);
        HttpEntity responseEntity = response.getEntity();
        System.out.println("登录响应状态为:" + response.getStatusLine());
        String s = EntityUtils.toString(responseEntity);
        System.out.println("登录响应内容为:" + s);
    }
}
