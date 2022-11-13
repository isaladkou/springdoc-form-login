package com.springdoc.formlogin.config;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.context.annotation.Configuration;

/*@SecurityScheme(
        name = "form",
        type = SecuritySchemeType.HTTP,
        scheme = "basic"
)*/
@Configuration
public class SpringDocConfig {

   /* @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components()
                        .addSecuritySchemes("basicAuth", createSecurityScheme()))
                .addSecurityItem(new SecurityRequirement().addList("basicAuth"));
    }

    private SecurityScheme createSecurityScheme() {
        return new SecurityScheme()
                .name("basicAuth")
                .type(SecurityScheme.Type.HTTP)
                .scheme("basic");
    }*/

}
