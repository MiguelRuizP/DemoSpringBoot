package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Coche;
import com.example.demo.service.CheckColorService;

@RestController
public class TestController {
	
	// Objeto del logger. Importa de org.slf4j.Logger
	// y en el método getLogger() debe contener el .class de donde esté
	private static final Logger LOG = LoggerFactory.getLogger(TestController.class);
	
	@Autowired // Te coge el primer Bean de coche que haya
	private Coche coche;
	
	@Autowired
	private CheckColorService checkColorService;

	@GetMapping("/test") // Dice que tiene un método GET con esa URL
	public ResponseEntity<?> test() {
		return ResponseEntity.ok(coche);
	}
	
	@PostMapping("/enviar") // Método POST. IMPORTANTE el @RequestBody para que detecte JSON
	public ResponseEntity<?> enviar(@RequestBody Coche coche) {
		LOG.info(coche.toString());
		return ResponseEntity.ok("llega bien :)");
	}
	
	@PostMapping("/comprueba")
	public ResponseEntity<?> comprueba(@RequestBody Coche coche) {
		
		if(checkColorService.compruebaColor(coche)) {
			return ResponseEntity.ok("esta bien el color");
		} else {
			return ResponseEntity.ok("no me gusta el color :(");
		}
		
	}
	
}
