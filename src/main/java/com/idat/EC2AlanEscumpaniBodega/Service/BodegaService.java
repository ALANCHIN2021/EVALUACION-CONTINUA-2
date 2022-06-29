package com.idat.EC2AlanEscumpaniBodega.Service;

import java.util.List;

import com.idat.EC2AlanEscumpaniBodega.Modelo.Bodega;

public interface BodegaService {
	
void guardarBodega(Bodega bodega);
	
	void actualizarBodega(Bodega bodega);
	
	void eliminarBodega(Integer id);
	
	List<Bodega> listarBodega();
	
	Bodega obtenerBodegaId(Integer id);

}
