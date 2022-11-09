package com.example.demo.user;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
	@Bean
	CommandLineRunner commandLineRunner(
			UserRepository repository) {
		return args -> {
			User user2 = new User(
					"Omar", 
					"omar@gimial.com", 
					"passsword"
			);
			User user1 = new User(
					"Yuria", 
					"yuria@gimial.com", 
					"passswordY"
			);
			
			repository.saveAll(
					List.of(user1, user2)
			);
		};
	}

}
