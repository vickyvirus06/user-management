package com.paypay.oa.user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Profile({"local", "dev"})
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.paypay.oa.user.controller"))
            .paths(PathSelectors.any())
            .build()
            .apiInfo(metaData());
    }

    private ApiInfo metaData() {
        ApiInfo apiInfo =
            new ApiInfo(
                "API Documentation",
                "API Documentation for OA User Management",
                "1.0",
                "Terms of service",
                "",
                "Apache License Version 2.0",
                "https://www.apache.org/licenses/LICENSE-2.0");
        return apiInfo;
    }
}
