package com.niit.usertrackservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@OpenAPIDefinition(info= @Info(title="USER TRACK SERVICE",version="${springdoc.version}",description="USER TRACK SERVICE API V1.0"))
public class UsertrackserviceApplication {//the above line of code to implement swagger 3with springdoc -open api

	public static void main(String[] args) {
		SpringApplication.run(UsertrackserviceApplication.class, args);
	}

}
