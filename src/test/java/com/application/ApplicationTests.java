package com.application;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import com.application.Application1;

@SpringBootTest
class ApplicationTests {
	
	public static final Logger logger= LoggerFactory.getLogger(Application1.class);


	@Test
	void contextLoads() {
		logger.info("test class");
		assertEquals(true, true);
	
	}

}
