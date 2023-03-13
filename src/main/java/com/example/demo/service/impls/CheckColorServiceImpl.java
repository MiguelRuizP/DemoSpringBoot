package com.example.demo.service.impls;

import org.springframework.stereotype.Service;

import com.example.demo.model.Coche;
import com.example.demo.service.CheckColorService;

// Implementación del servicio. Cuando se llame a la interfaz, se hará lo que haya aquí
@Service
public class CheckColorServiceImpl implements CheckColorService{

	private String checkColor = "rojo";
	
	@Override
	public boolean compruebaColor(Coche coche) {
		String color = coche.getColor();
		if(color.equals(checkColor)) {
			return true;
		} else {
			return false;
		}
	}
	
}
