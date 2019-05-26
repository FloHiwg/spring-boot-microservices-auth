package com.heiwig.microserviceenv.authservice.config.mongodb;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.heiwig.microserviceenv.authservice.repository")
public class MongoConfig {

}
