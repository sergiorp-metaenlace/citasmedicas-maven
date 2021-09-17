package com.metaenlace.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.metaenlace.model.Diagnostico;
import com.metaenlace.repositories.DiagnosticoRepository;

@Service
public class DiagnosticoService implements IDiagnosticoService{

	@Autowired
	private DiagnosticoRepository repository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Diagnostico> GetAllDiagnosticos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public Diagnostico GetDiagnosticoById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Diagnostico AddDiagnostico(Diagnostico diagnostico) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Diagnostico DeleteDiagnostico(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
