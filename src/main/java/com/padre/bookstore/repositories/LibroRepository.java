package com.padre.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.padre.bookstore.domain.Categoria;

@Repository
public interface LibroRepository extends JpaRepository<Categoria, Integer>{

}
