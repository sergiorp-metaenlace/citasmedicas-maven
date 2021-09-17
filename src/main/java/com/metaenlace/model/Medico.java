package com.metaenlace.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "MEDICO" )
public class Medico extends Usuario {

	private static final long serialVersionUID = 5455952587147449197L;

	@Column(name = "num_colegiado")
	public String numColegiado;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			name = "MEDICO_PACIENTE",
			joinColumns = @JoinColumn(name = "medico"),
			inverseJoinColumns = @JoinColumn(name = "paciente")
	)
	public List<Paciente> pacientes;
	
	public Medico() {
		super();
		pacientes = new ArrayList<Paciente>();
	}

	public Medico(String clave, String nombre, String apellidos, String user, String numColegiado) {
		super(clave, nombre, apellidos, user);
		this.numColegiado = numColegiado;
		this.pacientes = new ArrayList<Paciente>();
	}

	public String getNumColegiado() {
		return numColegiado;
	}

	public void setNumColegiado(String numColegiado) {
		this.numColegiado = numColegiado;
	}

	public List<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}
	
	public void addPaciente(Paciente pac) {
		if(!pacientes.contains(pac))
			pacientes.add(pac);
	}
	
}
