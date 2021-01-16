package com.demo.gitpoll.utils;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @author tom9b
 * @version 1.0.0
 * @Date 1/16/2021 Date file was Created
 * @package com.demo.gitpoll.utils
 * @project gitpoll
 */
@Component
public class HttpUtils {
    public String sendHttpRawGet(String url) throws IllegalStateException, IOException {

        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet getReq = new HttpGet(url);
        //        String authHeader = "Bearer " + getToken();
        //        getReq.setHeader("Authorization", authHeader);
        //        getReq.setHeader("Access-Key", ACCESS_KEY);
        //        getReq.setHeader("api_key", "658fe77d45ee6981301d4d8f529f9d2d");
        //        getReq.setHeader("api_id", "S100");
        HttpResponse response = httpClient.execute(getReq);
        response.getEntity().getContent();
        ByteArrayOutputStream outstream = new ByteArrayOutputStream();
        response.getEntity().writeTo(outstream);
        byte[] result = outstream.toByteArray();
        return new String(result);
    }
}
