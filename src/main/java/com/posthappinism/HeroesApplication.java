package com.posthappinism;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class HeroesApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeroesApplication.class, args);
	}
}
