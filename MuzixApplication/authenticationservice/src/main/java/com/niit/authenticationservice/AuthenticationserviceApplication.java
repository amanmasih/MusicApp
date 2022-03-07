package com.niit.authenticationservice;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
@OpenAPIDefinition(info= @Info(title="AUTHENTICATION SERVICE",version="${springdoc.version}",description="AUTHENTICATION SERVICE API V1.0"))
public class AuthenticationserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationserviceApplication.class, args);
	}

	}


