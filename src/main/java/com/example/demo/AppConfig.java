package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Coche;

@Configuration // Le dice a Spring que aquí puede encontrar Beans
public class AppConfig {

	@Bean // Metodo que devuelve Bean, objeto que puede usar donde quiera
	public Coche coche() {
		Coche coche = new Coche();
		coche.setColor("rojo");
		coche.setNPuertas(5);
		coche.setModelo("Ford Fiesta");
		return coche;
	}
	
}
