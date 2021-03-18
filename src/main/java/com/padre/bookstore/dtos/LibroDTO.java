package com.padre.bookstore.dtos;

import java.io.Serializable;

import com.padre.bookstore.domain.Libro;

public class LibroDTO implements Serializable {

	private static final long serialVersionUID=1L;
	
	private Integer id;
	private String title;
	public LibroDTO() {
		super();
	}
	public LibroDTO(Libro obj) {
		super();
		this.id = obj.getId();
		this.title = obj.getTitle();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
