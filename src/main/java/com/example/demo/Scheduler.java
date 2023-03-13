package com.example.demo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.demo.model.Coche;

@Component
public class Scheduler {
	
	private static final Logger LOG = LoggerFactory.getLogger(Scheduler.class);
	
	@Autowired
	private List<Coche> bbdd;
	
	// segundos - minutos - horas - dias - dia mes - dia semana
	// https://es.wikipedia.org/wiki/Cron_(Unix)
	@Scheduled(cron = "* * * * * *")
	public void contadorDePuertasJob() {
		int contador = 0;
		for(Coche coche: bbdd) {
			contador += coche.getNPuertas();
		}
		LOG.info("El conteo de puertas es: " + contador);
	}
}
