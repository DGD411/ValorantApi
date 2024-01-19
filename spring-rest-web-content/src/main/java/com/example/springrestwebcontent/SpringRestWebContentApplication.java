package com.example.springrestwebcontent;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;




@SpringBootApplication
public class SpringRestWebContentApplication {
	private static final Logger log = LoggerFactory.getLogger(SpringRestWebContentApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringRestWebContentApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
		return restTemplateBuilder
				.defaultHeader("X-RapidAPI-Key","8a570c5c58msh9c255414fa9f8aep1e67d9jsne11b04aa7a10")
				.build();
	}
}
