package com.codeeasy.project;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.codeeasy.project")
public class ProjectApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

}
