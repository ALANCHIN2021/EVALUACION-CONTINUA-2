package com.idat.EC2AlanEscumpaniBodega.Service;

import java.util.List;

import com.idat.EC2AlanEscumpaniBodega.Modelo.Cliente;

public interface ClienteService {

void guardarCliente(Cliente Cliente);
	
	void actualizarCliente(Cliente cliente);
	
	void eliminarCliente(Integer id);
	
	List<Cliente> listarCliente();
	
	Cliente obtenerClienteId(Integer id);
	
	
}
