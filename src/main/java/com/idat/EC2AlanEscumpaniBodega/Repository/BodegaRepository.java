package com.idat.EC2AlanEscumpaniBodega.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EC2AlanEscumpaniBodega.Modelo.Bodega;


@Repository
public interface BodegaRepository extends JpaRepository<Bodega,Integer> {

	
	
}
