package models;

public class Libro {

	private String titulo;
	private String autor;
	private int numPaginas;
	private int calificacion;
	
	
	public Libro (String titulo, String autor, int numPaginas, int calificacion){
		
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
		this.calificacion = calificacion;
		
	}
	
	//SETTERS
	
	public void cambiaTitulo(String titulo){
	
	this.titulo = titulo;
		
	}
	
	public void cambiaAutor(String autor){
		
		this.autor = autor;
			
		}
	
	public void cambiaNumPaginas(int numPaginas ){
		
		this.numPaginas = numPaginas;
			
		}
	
	public void cambiaCalificacion(int calificacion){
		
		this.calificacion = calificacion;
			
		}
	
	//GETERS
	
	public String dameTitulo (){
		
		return titulo;
	}
	
	public String dameAutor (){
		
		return autor;
	}

	public int dameNumPaginas (){
	
	return numPaginas;
	
	}
	
	public int dameCalificacion (){
		
		return calificacion;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
