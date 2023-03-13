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
	
	@Bean
	public List<Coche> bbdd(){
		List<Coche> coches = new ArrayList<>();
		
		coches.add(new Coche("rojo", 5, "Ford Fiesta"));
		coches.add(new Coche("amarillo", 5, "BMW"));
		coches.add(new Coche("negro", 5, "Seat Leon"));
		coches.add(new Coche("blanco", 3, "Ferrari"));
		coches.add(new Coche("verde", 5, "Peugeot"));
		
		return coches;
	}
	
	
}
