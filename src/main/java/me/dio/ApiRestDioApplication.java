package me.dio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@EntityScan(basePackages = "me.dio.domain.model")
public class ApiRestDioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestDioApplication.class, args);
	}

}
