package com.idat.EC2AlanEscumpaniBodega.Service;

import java.util.List;

import com.idat.EC2AlanEscumpaniBodega.Modelo.Productos;

public interface ProductosService {
	
void guardarProductos(Productos producto);
	
	void actualizarProductos(Productos producto);
	
	void eliminarProductos(Integer id);
	
	List<Productos> listarBodega();
	
	Productos obtenerBodegaId(Integer id);

}
