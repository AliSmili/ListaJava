package models;

public class Libro {


	private String titulo;
	private String autor;
	private int nPag;
	private int nota;
	
	public Libro(String titulo, String autor, int nPag, int nota) {
		this.titulo = titulo;
		this.autor = autor;
		this.nPag = nPag;
		this.nota = nota;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getnPag() {
		return nPag;
	}

	public void setnPag(int nPag) {
		this.nPag = nPag;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", nPag=" + nPag + ", nota=" + nota + "]";
	}
	
}
