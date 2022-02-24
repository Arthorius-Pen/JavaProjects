package com.art.artfood.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.art.artfood.domain.model.Estado;
import com.art.artfood.domain.repository.EstadoRepository;

@RestController
@RequestMapping(value = "/estados", produces = MediaType.APPLICATION_XML_VALUE)
public class EstadoController {
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@GetMapping
	public List<Estado> listar() {
		return estadoRepository.listar();
	}
}
