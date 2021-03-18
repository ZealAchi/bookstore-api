package com.padre.bookstore.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.padre.bookstore.domain.Libro;
import com.padre.bookstore.service.LibroService;

@RestController
@RequestMapping(value="/libros")
public class LibroResource {

	@Autowired
	private LibroService service;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Libro>findById(@PathVariable Integer id){
		Libro obj=service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
