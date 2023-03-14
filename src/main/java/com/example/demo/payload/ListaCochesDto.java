package com.example.demo.payload;

import java.util.List;

import com.example.demo.model.Coche;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListaCochesDto {
	private List<Coche> coches;
}
