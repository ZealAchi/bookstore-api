package com.padre.bookstore.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.padre.bookstore.domain.Categoria;
import com.padre.bookstore.domain.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer>{
	@Query("SELECT obj FROM Libro obj WHERE obj.categoria.id=:id_cat ORDER BY title")
	List<Libro> findAllByCategoria(@Param(value="id_cat")Integer id_cat);

}
