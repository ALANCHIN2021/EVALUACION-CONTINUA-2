package com.idat.EC2AlanEscumpaniBodega.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC2AlanEscumpaniBodega.Modelo.Usuario;
import com.idat.EC2AlanEscumpaniBodega.Repository.UsuarioRepository;
@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	
	@Autowired 
	private UsuarioRepository repository;

	@Override
	public void guardarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		repository.save(usuario);

	}

	@Override
	public void actualizarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(usuario);
		
		

	}

	@Override
	public void eliminarUsuario(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		

	}

	@Override
	public List<Usuario> listarUsuario() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Usuario obtenerUsuarioId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
