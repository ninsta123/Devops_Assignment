package com.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application1 implements CommandLineRunner {
	
	
	public static final Logger logger= LoggerFactory.getLogger(Application1.class);

	public static void main(String[] args) {
		
		logger.info("CI with build and test");
		SpringApplication.run(Application1.class, args);
	}

	@Override 
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("Logger");
		
	}

}
     
 