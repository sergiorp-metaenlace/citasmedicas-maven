package com.metaenlace.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "USUARIO" )
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario implements Serializable{

	private static final long serialVersionUID = -6055880149649243958L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "clave")
	public String clave;
	
	@Column(name = "nombre")
	public String nombre;
	
	@Column(name = "apellidos")
	public String apellidos;
	
	@Column(name = "usuario")
	public String user;

	public Usuario() {}
	
	public Usuario(String clave, String nombre, String apellidos, String user) {
		this.clave = clave;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
	
}
