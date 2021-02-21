package com.padre.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.padre.bookstore.domain.Categoria;
import com.padre.bookstore.dtos.CategoriaDTO;
import com.padre.bookstore.repositories.CategoriaRepository;
import com.padre.bookstore.service.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;

	public Categoria findById(Integer id) {
		Optional<Categoria> obj = repository.findById(id);
		return obj.orElseThrow(()->new ObjectNotFoundException("Objecto no encontrado! Id: "+id + ", Tipo: "+ Categoria.class.getName()));
	}
	public List<Categoria>findAll(){
		return repository.findAll();
	}
	public Categoria create(Categoria obj) {
		obj.setId(null);
		return repository.save(obj);
	}
	public Categoria update(Integer id, CategoriaDTO objDto) {
		Categoria obj=findById(id);
		obj.setName(objDto.getName());
		obj.setDescription(objDto.getDescription());
		return repository.save(obj);
	}
}