package fr.jansem.poc.springboot.api.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;

/**
 * Configuration de Swagger
 *
 * @author ntakpe_j
 */
@Configuration
@EnableSwagger
@ConditionalOnWebApplication
public class SwaggerConfig {

    public static final String ALL_PATTERN = "/.*";

    private static final Logger LOG = LoggerFactory.getLogger(SwaggerConfig.class);

    @Bean
    public SwaggerSpringMvcPlugin swaggerSpringMvcPlugin(SpringSwaggerConfig springSwaggerConfig) {
        LOG.trace("Generating Swagger api docs");
        SwaggerSpringMvcPlugin swagger = new SwaggerSpringMvcPlugin(springSwaggerConfig)
                .apiInfo(apiInfo())
                .includePatterns(ALL_PATTERN);
        swagger.build();
        return swagger;
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "NewCarmin API",
                "NewCarmin API",
                "",
                "",
                "",
                ""
        );
    }
}
