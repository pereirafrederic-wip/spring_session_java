package com.pereira.frederic.application.ssession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class SpringSessionApplication {

	public static void main(String[] args) {
	    System.setProperty("server.servlet.context-path", "/session");
		SpringApplication.run(SpringSessionApplication.class, args);
	}

}
