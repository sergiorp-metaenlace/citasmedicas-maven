package com.metaenlace.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metaenlace.repositories.CitaRepository;

@RestController
@RequestMapping("/citas")
public class CitaController {

	@Autowired
	private CitaRepository repository;
	

}
