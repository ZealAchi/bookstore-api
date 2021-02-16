package com.padre.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.padre.bookstore.domain.Categoria;
import com.padre.bookstore.domain.Libro;
import com.padre.bookstore.repositories.CategoriaRepository;
import com.padre.bookstore.repositories.LibroRepository;

@Service
public class DBService {
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LibroRepository libroRepository;

	public void instanciaBaseDedatos() {

		Categoria cat1=new Categoria(null,"Informatica","Libros de TI");
		Categoria cat2=new Categoria(null,"Fisica","Libros Fisica ");
		Categoria cat3=new Categoria(null,"Biografias","Libros de Biografias");
		
		Libro l1=new Libro(null,"Clean code","Rober Martin","Lorem ipsum",cat1);
		Libro l2=new Libro(null,"Clean code","Rober Martin","Lorem ipsum",cat1);
		Libro l3=new Libro(null,"Fisica I","Rober Martin","Lorem ipsum",cat2);
		Libro l4=new Libro(null,"Fisica II","Rober Martin","Lorem ipsum",cat2);
		Libro l5=new Libro(null,"Fisica III","Rober Martin","Lorem ipsum",cat2);
		
		
		cat1.getLibros().addAll(Arrays.asList(l1,l2));
		cat2.getLibros().addAll(Arrays.asList(l3,l4,l5));
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		this.libroRepository.saveAll(Arrays.asList(l1,l2,l3,l4,l5));
	}
}
