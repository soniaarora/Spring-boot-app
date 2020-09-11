package com.sonia.demo.SpringTest;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class SpringTestApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringTestApplication.class, args);
	}

	

}
