package fr.jansem.poc.springboot.web.config;

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
@ComponentScan({ "fr.jansem.poc.springboot.web" })
public class WebConfig extends SpringBootServletInitializer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(WebConfig.class);

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(WebConfig.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(WebConfig.class, args);
	}

}
