package com.metaenlace.services;

import java.util.List;

import com.metaenlace.model.Medico;
import com.metaenlace.model.Paciente;

public interface IMedicoService {
	
	public List<Medico> GetAllMedicos();

    public Medico GetMedicoById(Long id);

    public List<Paciente> GetPacientes(Long idMedico);

    public Medico AddMedico(Medico medico);

    public Medico Login(String username, String password);

    public Medico DeleteMedico(Long id);
}
