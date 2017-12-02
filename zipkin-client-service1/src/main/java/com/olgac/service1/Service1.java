package com.olgac.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Service1 {
    @Autowired
    RestTemplate restTemplate;

    String get() {
        return this.restTemplate.getForEntity("http://zipkin-client-service2:8080/get", String.class).getBody();
    }
}
