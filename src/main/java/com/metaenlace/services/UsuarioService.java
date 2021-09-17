package com.metaenlace.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.metaenlace.model.Usuario;
import com.metaenlace.repositories.UsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService{

	@Autowired
	private UsuarioRepository repository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Usuario> GetAllUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	@Transactional
	public Usuario AddUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	@Transactional(readOnly = true)
	public Usuario GetUsuarioById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	@Transactional
	public Usuario DeleteUsuario(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


}
