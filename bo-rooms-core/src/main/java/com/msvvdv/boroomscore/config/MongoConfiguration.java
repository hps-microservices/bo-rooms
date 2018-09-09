package com.msvvdv.boroomscore.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@Configuration
@EnableMongoRepositories(basePackages = {"com.msvvdv.boroomscore.repository"})
public class MongoConfiguration {}
