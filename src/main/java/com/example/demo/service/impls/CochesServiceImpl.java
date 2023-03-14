package com.example.demo.service.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Coche;
import com.example.demo.repository.CochesRepository;
import com.example.demo.service.CochesService;

@Service
public class CochesServiceImpl implements CochesService{
	
	@Autowired
	private CochesRepository cochesRepository;

	@Override
	public Coche encontrarPorId(int id) {
		return cochesRepository.findById(id);
	}

	@Override
	public void insertarCoche(Coche coche) {
		cochesRepository.save(coche);
	}

	@Override
	public List<Coche> buscarActivo(boolean activo) {
		return cochesRepository.encontrarActivos(activo);
	}
	

}
