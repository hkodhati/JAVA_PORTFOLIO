package com.portfolio.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI portfolioOpenAPI() {
        Server devServer = new Server();
        devServer.setUrl("http://localhost:8080");
        devServer.setDescription("Development server");

        Contact contact = new Contact();
        contact.setName("Hemanth Kumar Kodhati");
        contact.setEmail("hemanth0070kodhati@gmail.com");
        contact.setUrl("https://www.linkedin.com/in/hemanth-kumar-k-java7");

        License mitLicense = new License()
                .name("MIT License")
                .url("https://opensource.org/licenses/MIT");

        Info info = new Info()
                .title("Java Developer Portfolio API")
                .version("1.0.0")
                .description("RESTful API for the Java Developer Portfolio application. " +
                        "This API provides endpoints for managing profile information, " +
                        "projects, and contact form submissions.")
                .contact(contact)
                .license(mitLicense);

        return new OpenAPI()
                .info(info)
                .servers(List.of(devServer));
    }
} 