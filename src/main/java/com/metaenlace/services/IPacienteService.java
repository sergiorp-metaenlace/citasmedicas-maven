package com.metaenlace.services;

import java.util.List;

import com.metaenlace.model.Medico;
import com.metaenlace.model.Paciente;

public interface IPacienteService {

	public List<Paciente> GetAllPacientes();

    public Paciente GetPacienteById(Long id);

    public boolean AddPaciente(Paciente paciente);

    public boolean AddMedico(long idPaciente, Long idMedico);

    public List<Medico> GetMedicos(Long idPaciente);

    public List<Medico> GetMedicosNot(Long idPaciente);

    public boolean DeletePaciente(Long id);

    public boolean Login(String username, String password);
}
