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
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
}
