package com.mongo_spring.dockermongorestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories // bu anno ile bu projede mongo repo' ları kullanılmış ve onları devreye
//al diyoruz
public class DockerMongoRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerMongoRestApiApplication.class, args);
	}

}
