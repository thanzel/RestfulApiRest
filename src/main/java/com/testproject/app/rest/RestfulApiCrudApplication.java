package com.testproject.app.rest;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication //indica que es una app de SpringBoot
public class RestfulApiCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulApiCrudApplication.class, args);
	}

	@Bean
	public OpenAPI custumOpenApi() { //bean para agregarle descripción al encabezado de swagger
		return  new OpenAPI()
			.info(new Info()
				.title("Spring Boot Api Restful with mysql and swagger")
				.version("1.0.0")
				.description("Proyecto de Prueba")
				.termsOfService("http")
		);
	}

}
