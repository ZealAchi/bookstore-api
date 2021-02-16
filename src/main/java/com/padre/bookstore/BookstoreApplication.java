package com.padre.bookstore;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.padre.bookstore.domain.Categoria;
import com.padre.bookstore.domain.Libro;
import com.padre.bookstore.repositories.CategoriaRepository;
import com.padre.bookstore.repositories.LibroRepository;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LibroRepository libroRepository;
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria cat1=new Categoria(null,"Informatica","Libros de TI");
		
		Libro l1=new Libro(null,"Clean code","Rober Martin","Lorem ipsum",cat1);
		
		
		cat1.getLibros().addAll(Arrays.asList(l1));
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1));
		this.libroRepository.saveAll(Arrays.asList(l1));
		
	}

}
