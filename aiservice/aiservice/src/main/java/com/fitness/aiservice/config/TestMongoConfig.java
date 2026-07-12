package com.fitness.aiservice.config;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestMongoConfig {

    @Value("${spring.data.mongodb.uri:NOT_FOUND}")
    private String uri;

    @PostConstruct
    public void printUri() {
        System.out.println("Mongo URI = " + uri);
    }
}