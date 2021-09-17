package com.metaenlace.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import com.metaenlace.model.Paciente;
import com.metaenlace.repositories.PacienteRepository;
import com.metaenlace.services.IPacienteService;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
	
	@Autowired
	private IPacienteService service;
	
	@GetMapping
	public ResponseEntity<?> GetPacientes(){
		List<Paciente> pacientes = service.GetAllPacientes();
		
		if(pacientes!=null)
			return ResponseEntity.ok(pacientes);
		else
			return new ResponseEntity<Object>("Ha habido un problema", HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> GetPacienteById(@PathVariable Long id){
		Paciente paciente = service.GetPacienteById(id);
		
		if(paciente!=null)
			return ResponseEntity.ok(paciente);
		else
			return new ResponseEntity<Object>("No se ha encontrado al paciente", HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/medicos/{id}")
	public ResponseEntity<?> GetMedicosByPaciente(@PathVariable Long id){
		Paciente paciente = service.GetPacienteById(id);
		
		if(paciente!=null)
			return ResponseEntity.ok(paciente);
		else
			return new ResponseEntity<Object>("No se ha encontrado al paciente", HttpStatus.BAD_REQUEST);
	}
	
	@PostMapping
	public ResponseEntity<?> PostPaciente(@RequestBody Paciente paciente){
		
		
		if(!service.AddPaciente(paciente))
			return new ResponseEntity<Object>("El paciente ya existe", HttpStatus.BAD_REQUEST);
		else
			return new ResponseEntity<Object>("Paciente creado", HttpStatus.CREATED);
	
	}
}
