package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Modalidad;
import com.empresa.repository.ModalidadRepository;

@Service
public class ModalidadServiceImpl implements ModalidadService{

	@Autowired
	private ModalidadRepository repository;
	
	@Override
	public List<Modalidad> listaModalidadPorNombre(String nombre) {
		return repository.findByNombre(nombre);
	}

	@Override
	public Modalidad insertaModalidad(Modalidad obj) {
		return repository.save(obj);
	}

}
