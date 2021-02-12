package com.padre.bookstore.repositories;

import org.springframework.stereotype.Repository;

import com.padre.bookstore.domain.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Integer>{

}
