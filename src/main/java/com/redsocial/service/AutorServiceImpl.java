package com.redsocial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.entity.Autor;
import com.redsocial.repository.AutorRepository;

@Service
public class AutorServiceImpl implements AutorService{

	@Autowired
	private AutorRepository repository;
	

	@Override
	public Autor inserta(Autor obj) {
		return repository.save(obj);
	}


	@Override
	public List<Autor> listaAutor() {
		return repository.findAll();
	}

}
