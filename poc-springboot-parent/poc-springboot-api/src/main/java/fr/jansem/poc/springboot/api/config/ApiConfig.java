package fr.jansem.poc.springboot.api.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration générale
 * 
 * @author rjansem
 *
 */
@EnableAutoConfiguration
@Configuration
@ComponentScan({ "fr.jansem.poc.springboot.api" })
public class ApiConfig extends SpringBootServletInitializer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ApiConfig.class);

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ApiConfig.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiConfig.class, args);
	}

}
