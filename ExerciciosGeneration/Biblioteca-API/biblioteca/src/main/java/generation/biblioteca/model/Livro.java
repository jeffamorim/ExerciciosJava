package generation.biblioteca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "TB_LIVRO")
public class Livro {
	
	@Column (name = "cd_isbn", nullable = false, length = 13 )
	@Id
	@NotNull
	private long isbn;
	
	@Column(name = "nm_livro", nullable = false, length = 120)
	@NotNull
	@Size(min = 2, max = 120)
	private String nomeLivro;
	
	@Column(name = "nm_genero", nullable = false, length = 120)
	@NotNull
	@Size(min = 2, max = 120)
	private String genero;
	
	@Column(name = "qt_pagina", nullable = false)
	@NotNull
	private int qtPagina;

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getQtPagina() {
		return qtPagina;
	}

	public void setQtPagina(int qtPagina) {
		this.qtPagina = qtPagina;
	}
	
	
	
}
