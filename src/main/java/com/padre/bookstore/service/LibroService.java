package com.padre.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.padre.bookstore.domain.Categoria;
import com.padre.bookstore.domain.Libro;
import com.padre.bookstore.repositories.LibroRepository;
import com.padre.bookstore.service.exceptions.ObjectNotFoundException;

@Service
public class LibroService {
	@Autowired
	private LibroRepository repository;
	
	@Autowired
	private CategoriaService categoriaService;
	
	public Libro findById(Integer id){
		Optional<Libro>obj=repository.findById(id);
		return obj.orElseThrow(()->new ObjectNotFoundException(
				"Objecto no encontrado! Id: "+id+", Tipo: "+Libro.class.getName()));
		
	}
	public List<Libro> findAll(Integer id_cat) {
		categoriaService.findById(id_cat);
		return repository.findAllByCategoria(id_cat);
	}
	public Libro update(Integer id, Libro obj) {
		Libro newObj=findById(id);
		updateData(newObj,obj);
		return repository.save(newObj);
	}
	
	private void updateData(Libro newObj,Libro obj) {
		newObj.setTitle(obj.getTitle());
		newObj.setName_author(obj.getName_author());
		newObj.setText(obj.getText());
	}
	public Libro create(Integer id_cat, Libro obj) {
		obj.setId(null);
		Categoria cat=categoriaService.findById(id_cat);
		obj.setCategoria(cat);
		return repository.save(obj);
	}
	public void delete(Integer id) {
		Libro obj=findById(id);
		repository.delete(obj);
	}
}
