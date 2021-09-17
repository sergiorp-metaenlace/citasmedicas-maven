package com.metaenlace.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.metaenlace.model.Medico;
import com.metaenlace.model.Paciente;
import com.metaenlace.repositories.PacienteRepository;

@Service
public class PacienteService implements IPacienteService{

	@Autowired
	private PacienteRepository repository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Paciente> GetAllPacientes() {
		return repository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Paciente GetPacienteById(Long id) {
		Optional<Paciente> pac = repository.findById(id);
		if(pac.isPresent())
			return pac.get();
		else
			return null;
	}

	@Override
	@Transactional
	public boolean AddPaciente(Paciente paciente) {
		if(repository.findByUser(paciente.getUser()) != null)
			return false;
		repository.save(paciente);
		return true;
	}

	@Override
	@Transactional
	public boolean AddMedico(long idPaciente, Long idMedico) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Medico> GetMedicos(Long idPaciente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Medico> GetMedicosNot(Long idPaciente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public boolean DeletePaciente(Long id) {
		repository.deleteById(id);
		return true;
	}

	@Override
	@Transactional(readOnly = true)
	public boolean Login(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
