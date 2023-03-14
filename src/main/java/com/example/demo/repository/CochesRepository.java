package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Coche;

public interface CochesRepository extends JpaRepository<Coche, Integer>{
	Coche findById(int id);
	
	@Query(value = "select * from coches where disponible=:activo", nativeQuery = true)
	List<Coche> encontrarActivos(@Param("activo") boolean activo);
}
