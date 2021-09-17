package com.metaenlace.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.metaenlace.model.Cita;
import com.metaenlace.model.Medico;
import com.metaenlace.model.Paciente;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Long>{
	
	List<Cita> findByPaciente(Paciente paciente);
	
	List<Cita> findByMedico(Medico medico);
}
