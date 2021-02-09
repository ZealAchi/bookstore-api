package com.padre.bookstore.domain;

public class Libro {

	private Integer id;
	private String title;
	private String name_author;
	private String text;
	
	private Categoria categoria;
	
	
	
	public Libro() {
		super();
	}
	public Libro(Integer id, String title, String name_author, String text, Categoria categoria) {
		super();
		this.id = id;
		this.title = title;
		this.name_author = name_author;
		this.text = text;
		this.categoria = categoria;
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

	public String getName_author() {
		return name_author;
	}

	public void setName_author(String name_author) {
		this.name_author = name_author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
	
}
