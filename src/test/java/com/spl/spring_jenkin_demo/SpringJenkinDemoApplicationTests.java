package com.spl.spring_jenkin_demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SpringJenkinDemoApplicationTests {

	private static final Logger logger = LoggerFactory.getLogger(SpringJenkinDemoApplication.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing...");
		logger.info("Test case executing 2nd log just...");
		assertTrue(true, "The condition should be true");
	}

}
