package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

// Clase principal de la aplicación.
// TODAS las clases/paquetes/interfaces tienen que estar debajo

@SpringBootApplication
@EnableScheduling // IMPORTANTE Permite que funcione el scheduler
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
