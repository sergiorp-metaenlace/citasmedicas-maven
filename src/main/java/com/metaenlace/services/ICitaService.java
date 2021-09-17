package com.metaenlace.services;

import java.util.List;
import java.util.Optional;

import com.metaenlace.model.Cita;

public interface ICitaService {

		public List<Cita> GetAllCitas();
		
		public Optional<Cita> GetCitaById(Long id);
		
		public List<Cita> GetCitasByPaciente(Long pacienteId);
		
		public List<Cita> GetCitasByMedico(Long medicoId);
		
		public boolean AddCita(Cita cita, Long idMedico, Long idPaciente);
		
		public void DeleteCita(Long id);
}
