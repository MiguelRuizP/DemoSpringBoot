package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// Generadores de métodos de Lombok
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Coche {
	private String modelo;
	private int nPuertas;
	private String color;
}
