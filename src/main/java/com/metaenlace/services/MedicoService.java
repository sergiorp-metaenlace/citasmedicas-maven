package com.metaenlace.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.metaenlace.model.Medico;
import com.metaenlace.model.Paciente;
import com.metaenlace.repositories.MedicoRepository;

@Service
public class MedicoService implements IMedicoService{

	@Autowired
	private MedicoRepository repository;
	
	@Override
	public List<Medico> GetAllMedicos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public Medico GetMedicoById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Paciente> GetPacientes(Long idMedico) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Medico AddMedico(Medico medico) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public Medico Login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Medico DeleteMedico(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
