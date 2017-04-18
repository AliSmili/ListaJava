package models;

public class Lista<T> {
	
	private T[] elementos;															//Nuestro Array de tipo T (Genérico)
	private int index;																//El índice que apunta a un lemento de la lista
	private int total;																//Tamaño del array
	
	
	@SuppressWarnings("unchecked")
	public Lista(){
		this.total = 0;
        elementos = (T[]) new Object[total];
        this.index = 0;

	}
	
	
	@SuppressWarnings("unchecked")
	public void add(T ele)
    {       	    	 
    	 if(total == 0){
    	 total = 1;																	//Reservamos memoria para un elemento
    	 index = -1;
    	 elementos = (T[]) new Object[total];
    	 }
    	   if(index==total-1 || elementos[total-1] != null){
	           System.out.println("La Cola se ha redimensionado y se introdujo el nuevo elemento ! ");
    		   total = total+1;
    		   @SuppressWarnings("unchecked")
			T[] tmp = (T[]) new Object[total];								
    		   for(int i=0; i<elementos.length;i++){											
    			   tmp[i]=elementos[i];
    		   }
    		   elementos = tmp;
    		   elementos[++index] = ele;
    		 
	            
	       }else{
    		elementos[++index] = ele;
	       }
      
    }
	
	    
    public void remove (T element){
    	  
    	  int contador = 0;
    	 
    	  for(int i = 0; i<elementos.length; i++){
    		  
    		  if(element.equals(elementos[i]) ){
    			  index=i;
    			  index--;															//El index se posiciona a la posición anterior al elemento eliminado
    			  for(int j=i; j<(elementos.length-1); j++)
                  {
                      elementos[j] = elementos[j+1];								//Desplazamiento a la izquierda sustituyendo el elemento que queremos quitar por el siguiente
                  }
    			  									
    			  contador ++;
    			  break;
    			  
    		  }
    	  }
    		 if(contador ==0){
    			 System.out.println("Elemento no encontrado ");
    		 }
    		 else{	    			 	
    				 elementos[elementos.length-1]= null;							//Establecemos la ultima posicion del array a null despues del desplazamiento
    				 total= total - 1;												//Redimensionamos nuestro Array una posición menos
    					@SuppressWarnings("unchecked")
						T[] tmp = (T[]) new Object[total];
    				     System.arraycopy(elementos, 0, tmp, 0, total);				//public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
    				       elementos = tmp;
    		 }
    		  
    	  }
    
    public T getNext(){
    	
    	if(index == elementos.length-1){
    		index = 0;
    	}else{
    		index ++;
    	}
    	 T elem = elementos[index];
   	
	 
	 return  elem;
    	
    }
    
    public boolean isEmpty() {
	       
    	
    	return index == -1;
     }
    
    public T getPrev(){
    	if(index == 0 ){
    		index = elementos.length-1;
    	}else{
    		index --;
    	}
   	 T elem = elementos[index];
  	
	 if(!isEmpty() && index !=-1){	 
   	  System.out.println("Se va a devolver de la Cola este elmento : "+elem); 
   	 															    
		
	 }else{
		 System.out.println("No se puede devolver un elemento previo ya que no existe !");
	 }
	 return  elem;
   	
   }
    
    public T getCurrent(){
   	 
   	 T elem = elementos[index];
  	
	 /*if(!isEmpty()){	 
   	  System.out.println("Se va a devolver de la Cola este elmento : "+elem); 
   	 															    
	 }*/
	 return  elem;
   	
   }
    
    public int setIndex(int i){
    	
    	int indiceMax = elementos.length-1;
    	
    	if(i<0 || i>indiceMax){													// i<0 por si se intenta establecer un indice negativo 
    		this.index = -1;
    	}else{
    		this.index = i;
    	}
  
	 return  index;
   	
   }
    
    public int getIndex(){
    	
    	return index;
    }
    
    
    public void display(){

        for(int i=0;i<elementos.length;i++){
            System.out.print(elementos[i]+ " ");
        }
        System.out.println();
    }
    
    @Override
    public String toString()
    {
    	return elementos.toString();
    }
    
    
    
    

}


