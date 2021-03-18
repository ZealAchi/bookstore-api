package com.padre.bookstore.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.padre.bookstore.domain.Libro;
import com.padre.bookstore.dtos.LibroDTO;
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
	@GetMapping
	public ResponseEntity<List<LibroDTO>>finalAll(@RequestParam(value="categoria",defaultValue="0") Integer id_cat){
//		localhost:8080/libros?categoria=1
		List<Libro>list=service.findAll(id_cat);
		List<LibroDTO> listDTO=list.stream().map(obj->new LibroDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
}
