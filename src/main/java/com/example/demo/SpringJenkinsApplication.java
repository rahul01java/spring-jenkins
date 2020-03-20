package com.example.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	public static Logger logger = org.slf4j.LoggerFactory.getLogger(SpringJenkinsApplication.class);

	public static void main(String[] args) {
		logger.info("main method called");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

	@PostConstruct
	public void intit() {
		logger.info("spring application startes init calles");
	}
}
