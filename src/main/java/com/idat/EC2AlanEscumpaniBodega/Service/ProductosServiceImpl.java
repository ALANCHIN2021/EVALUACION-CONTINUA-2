package com.idat.EC2AlanEscumpaniBodega.Service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC2AlanEscumpaniBodega.Modelo.Productos;
import com.idat.EC2AlanEscumpaniBodega.Repository.ProductosRepository;
@Service
public class ProductosServiceImpl implements ProductosService {
	
	@Autowired 
	private ProductosRepository repository;
	

	@Override
	public void guardarProductos(Productos producto) {
		// TODO Auto-generated method stub
		repository.save(producto);

	}

	@Override
	public void actualizarProductos(Productos producto) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(producto);

	}

	@Override
	public void eliminarProductos(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public List<Productos> listarBodega() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Productos obtenerBodegaId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
