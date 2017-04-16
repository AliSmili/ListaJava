package models;

public class Libro {

	// Atributos
	private int nPaginas;
	private String color;
	private String autor;
	private String titulo;

	// Constructor
	public Libro(int nPaginas, String color, String autor, String titulo) {

		this.nPaginas = nPaginas;
		this.color = color;
		this.autor = autor;
		this.titulo = titulo;
	}

	// Comportamientos
	
	public int getnPaginas() {
		return this.nPaginas;
	}

	public String getAutor() {
		return this.autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getColor() {
		return this.color;
	}

	public String abrirLibro(int n) {
		return "Libro abierto por la pagina " + n;
	}

}
