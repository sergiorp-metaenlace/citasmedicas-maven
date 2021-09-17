package com.metaenlace.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "PACIENTE" )
public class Paciente extends Usuario {

	private static final long serialVersionUID = -8519936834699477534L;
	
	@Column(name = "nss")
	public String nss;
	
	@Column(name = "num_tarjeta")
	public String numTarjeta;
	
	@Column(name = "telefono")
	public String telefono;
	
	@Column(name = "direccion")
	public String direccion;
	
	@ManyToMany(mappedBy = "pacientes", fetch = FetchType.EAGER)
	public List<Medico> medicos;
	
	public Paciente() {
		super();
		medicos = new ArrayList<Medico>();
	}

	public Paciente(String clave, String nombre, String apellidos, String user, String nss, String numTarjeta, String telefono, String direccion) {
		super(clave, nombre, apellidos, user);
		this.nss = nss;
		this.numTarjeta = numTarjeta;
		this.telefono = telefono;
		this.direccion = direccion;
		this.medicos = new ArrayList<Medico>();
	}

	public String getNss() {
		return nss;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	public String getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Medico> getMedicos() {
		return medicos;
	}

	public void setMedicos(List<Medico> medicos) {
		this.medicos = medicos;
	}
	
	public void addMedico(Medico med) {
		if(!medicos.contains(med))
			medicos.add(med);
	}

}
