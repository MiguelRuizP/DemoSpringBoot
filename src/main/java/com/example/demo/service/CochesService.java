package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Coche;

@Service
public interface CochesService {
	Coche encontrarPorId(int id);
	void insertarCoche(Coche coche);
	List<Coche> buscarActivo(boolean activo);
}
