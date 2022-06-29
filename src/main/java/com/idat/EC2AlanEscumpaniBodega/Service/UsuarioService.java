package com.idat.EC2AlanEscumpaniBodega.Service;

import java.util.List;

import com.idat.EC2AlanEscumpaniBodega.Modelo.Usuario;

public interface UsuarioService {
	
void guardarUsuario(Usuario usuario);
	
	void actualizarUsuario(Usuario usuario);
	
	void eliminarUsuario(Integer id);
	
	List<Usuario> listarUsuario();
	
	Usuario obtenerUsuarioId(Integer id);

}
