package com.idat.EC2AlanEscumpaniBodega.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.idat.EC2AlanEscumpaniBodega.Modelo.Bodega;
import com.idat.EC2AlanEscumpaniBodega.Repository.BodegaRepository;

public class BodegaServiceImpl implements BodegaService {
	
	@Service
	@Autowired 
	private BodegaRepository repository;
	@Override
	public void guardarBodega(Bodega bodega) {
		// TODO Auto-generated method stub
		repository.save(bodega);

	}

	@Override
	public void actualizarBodega(Bodega bodega) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(bodega);
		

	}

	@Override
	public void eliminarBodega(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		

	}

	@Override
	public List<Bodega> listarBodega() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Bodega obtenerBodegaId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
