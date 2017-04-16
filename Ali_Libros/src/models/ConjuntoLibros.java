package models;

public class ConjuntoLibros {
	
	public final int TAMANIO = 10;
	private Libro[] Libros ;
	
	//CONSTRUCTOR
	
	public ConjuntoLibros (Libro[]Libros){
		
		this.Libros = new Libro[TAMANIO];
	}
	
	
	
	public void almacenaLibros(Libro l ){
		
		boolean hayCopia = false ;
		
		for (Libro libro : Libros) {
		
				if(libro !=null && l.dameTitulo().equals(libro.dameTitulo())){		//Hay una pos llena y encima tiene el mismo titulo
					
					hayCopia = true;
					
					break;															//Si hay copia que se salga del bucle
					
				}else{
					
					hayCopia = false;
					
				}
		if(!hayCopia){											//Ahora, sino hay copia, q pasa?
			
			if(dameSiguientePosicion() == -1){
				
				System.out.println("Esto esta petado !! No hay hueco !!");
			}else{
			
			Libros[dameSiguientePosicion()]=l;					//Almacenare el libro introducido en la posición que me ha devuelto el metodo de abajo	
					
			
			}
		}else{
			
			System.out.println("Ya existe una copia campeón !!");
		
		}
		
		}
	 
		}
	
	
	private int dameSiguientePosicion(){
		
		int i=0;
		
		for(i=0;i<this.Libros.length;i++){
			
			if(Libros[i]==null){
				
				return i;
				
			}
		}
			return -1;
			
		}
	
	//Eliminar libro por título
	
	public void eliminarPorTitulo(String tit){
		
		for(int i=0;i<Libros.length;i++){
			for (Libro lib : Libros) {
			
				if(tit.equals(lib.dameTitulo())){
				
					Libros[i]=null;
				
				}
			
			}
		}
	}
	
	//Eliminar libro por autor
	
	public void eliminarPorAutor(String aut){
		
		for(int i=0;i<Libros.length;i++){
			for (Libro lib : Libros) {
			
				if(aut.equals(lib.dameAutor())){
				
					Libros[i]=null;
				
				}
			
			}
		}
	}
	
	//Sacar el libro con la mayor calificación
	
	public String dameMayorCalific(Libro[] books){
		String s ="";
		int MaxCalificacion=0;
	for (Libro lib : books) {
		
		if(lib.dameCalificacion() >= MaxCalificacion){
			MaxCalificacion = lib.dameCalificacion();
			s =lib.dameTitulo();
		}
		
	}
	
	return "El libro con la mayoy calificacion es" +s;	
	
	}	
	
	//Sacar el libro con la menor calificación
	
	public String dameMenorCalific(Libro[] books){
		String s ="";
		int MinCalificacion=0;
	for (Libro lib : books) {
		
		if(lib.dameCalificacion() <= MinCalificacion){
			MinCalificacion = lib.dameCalificacion();
			s =lib.dameTitulo();
		}
		
	}
	return "El libro con la menor calificacion es" +s;	
	
	}
		
		
		
		
		 
		
		
		
		
	
		
	
	
	
	
	
	
	
	
	
		
		
		
	
		
	
	

}
