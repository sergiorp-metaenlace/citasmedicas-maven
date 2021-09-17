package com.metaenlace.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.metaenlace.model.Cita;
import com.metaenlace.model.Medico;
import com.metaenlace.model.Paciente;
import com.metaenlace.repositories.CitaRepository;
import com.metaenlace.repositories.MedicoRepository;
import com.metaenlace.repositories.PacienteRepository;

@Service
public class CitaService implements ICitaService{

	@Autowired
	private CitaRepository repository;
	
	@Autowired
	private MedicoRepository medRepository;
	
	@Autowired
	private PacienteRepository pacRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Cita> GetAllCitas() {
		return repository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Cita> GetCitaById(Long id) {
		return repository.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Cita> GetCitasByPaciente(Long pacienteId) {
		Optional<Paciente> pac = pacRepository.findById(pacienteId);
		if(pac.isPresent())
			return repository.findByPaciente(pac.get());
		else
			return null;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Cita> GetCitasByMedico(Long medicoId) {
		Optional<Medico> med = medRepository.findById(medicoId);
		if(med.isPresent())
			return repository.findByMedico(med.get());
		else
			return null;
	}

	@Override
	@Transactional
	public boolean AddCita(Cita cita, Long idMedico, Long idPaciente) {
		
		Optional<Medico> med = medRepository.findById(idMedico);
		Optional<Paciente> pac = pacRepository.findById(idPaciente);
		if(!med.isPresent() || !pac.isPresent())
			return false;
		cita.setMedico(med.get());
		cita.setPaciente(pac.get());
		
		if(repository.findById(cita.getId()).isPresent())
			return false;
		
		repository.save(cita);
		
		return true;
	}

	@Override
	@Transactional
	public void DeleteCita(Long id) {
		repository.deleteById(id);
	}

}
