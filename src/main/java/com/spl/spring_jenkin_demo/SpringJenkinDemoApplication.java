package com.spl.spring_jenkin_demo;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringJenkinDemoApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringJenkinDemoApplication.class);

	@PostConstruct
	public void intt(){
		logger.info("Application started...");
	}

	public static void main(String[] args) {

		logger.info("Application executed...");
		SpringApplication.run(SpringJenkinDemoApplication.class, args);
	}

}
