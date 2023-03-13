package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Coche;

@Service // Cuando se utilice, IMPORTAR ESTO CON AUTOWIRED, NO EL IMPL
public interface CheckColorService {
	boolean compruebaColor(Coche coche);
}
