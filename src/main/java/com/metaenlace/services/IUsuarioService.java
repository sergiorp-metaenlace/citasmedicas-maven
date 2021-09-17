package com.metaenlace.services;

import java.util.List;

import com.metaenlace.model.Usuario;

public interface IUsuarioService {

	public List<Usuario> GetAllUsuarios();

    public Usuario GetUsuarioById(Long id);

    public Usuario AddUsuario(Usuario usuario);

    public Usuario DeleteUsuario(Long id);
}
