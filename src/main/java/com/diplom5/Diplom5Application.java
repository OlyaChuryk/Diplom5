package com.diplom5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class Diplom5Application implements WebMvcConfigurer{

	public static void main(String[] args) {
		SpringApplication.run(Diplom5Application.class, args);
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler(
				"/img/**",
				"/css/**",
				"/js/**")
				.addResourceLocations(
						"classpath:/static/img/",
						"classpath:/static/css/",
						"classpath:/static/js/");
	}

}

