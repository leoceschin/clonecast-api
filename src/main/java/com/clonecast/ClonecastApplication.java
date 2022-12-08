package com.clonecast;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import com.clonecast.services.FileStorageService;

@SpringBootApplication
public class ClonecastApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClonecastApplication.class, args);
	}

	@Bean
	CommandLineRunner init(FileStorageService storageService) {
		return (args) -> {
			storageService.init();
		};
	}
	

}
