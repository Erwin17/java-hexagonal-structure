package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaHexagonalStructureApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaHexagonalStructureApplication.class, args);

        IO.println("==============================");
        IO.println("============Hexagonal=========");
        IO.println("==============================");
    }
}
