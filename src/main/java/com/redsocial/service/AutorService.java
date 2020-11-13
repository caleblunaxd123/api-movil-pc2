package com.redsocial.service;

import java.util.List;

import com.redsocial.entity.Autor;

public interface AutorService {

	public abstract Autor inserta(Autor obj);
	public abstract List<Autor> listaAutor();
}
