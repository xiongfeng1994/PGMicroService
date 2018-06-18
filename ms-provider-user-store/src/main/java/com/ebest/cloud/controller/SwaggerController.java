package com.ebest.cloud.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Swagger2 configuration class
 * @author ebest
 *
 */
@Configuration
public class SwaggerController {

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.ebest.cloud.controller"))
                .paths(PathSelectors.any())
                .build();
	}
	
	private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Store RESTful API")
                .description("Include adding, deleting, modifying, and querying")
                .contact("ebest")
                .version("1.0")
                .build();
    }
	
}
