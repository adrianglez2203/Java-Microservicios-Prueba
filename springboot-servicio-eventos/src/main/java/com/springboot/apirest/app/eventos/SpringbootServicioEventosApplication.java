package com.springboot.apirest.app.eventos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class SpringbootServicioEventosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioEventosApplication.class, args);
	}

}
