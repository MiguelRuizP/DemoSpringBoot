package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Coche;
import com.example.demo.payload.ListaCochesDto;
import com.example.demo.service.CochesService;

@RestController
@RequestMapping("/coches")
public class CochesController {
	
	@Autowired
	private CochesService cochesService;
	
	@GetMapping("/get/{id}")
	public ResponseEntity<?> getCoche(@PathVariable int id){
		Coche coche = cochesService.encontrarPorId(id);
		return ResponseEntity.ok(coche);
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<?> guardarCoche(@RequestBody Coche coche){
		cochesService.insertarCoche(coche);
		return ResponseEntity.ok("Guardado bien el " + coche.getModelo());
	}
	
	@GetMapping("/getDisponibles")
	public ResponseEntity<?> getDisponibles() {
		List<Coche> coches = cochesService.buscarActivo(true);
		return ResponseEntity.ok(new ListaCochesDto(coches));
	}
}
