package com.metaenlace.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "DIAGNOSTICO" )
public class Diagnostico implements Serializable{

	private static final long serialVersionUID = -4469921529377397450L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "valoracion_esp")
	public String valoracionEspecialista;
	
	@Column(name = "enfermedad")
	public String enfermedad;

	
	public Diagnostico() {}
	
	public Diagnostico(String valoracionEspecialista, String enfermedad) {
		super();
		this.valoracionEspecialista = valoracionEspecialista;
		this.enfermedad = enfermedad;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getValoracionEspecialista() {
		return valoracionEspecialista;
	}

	public void setValoracionEspecialista(String valoracionEspecialista) {
		this.valoracionEspecialista = valoracionEspecialista;
	}

	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

}
