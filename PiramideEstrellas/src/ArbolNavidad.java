
public class ArbolNavidad {

	public static void main(String[] args) {
		// Otro arbol de navidad con + *
		

		// ABOL NAVIDAD con + y *
		
	/*    *
	     + *
	    * + * 
	   + * + * 
	  * + * + *  
	   
		   */
	  //niveles pares +.....niveles impares empieza por *
      //ctos espacios en blanco hay en cada nivel: (5-i)
		
		String linea="";
		for (int i=1; i<=5;i++){
			//ESPACIOS EN BLANCO
			for(int blancos=1;blancos<=(5-i);blancos++){
				linea=" "+linea;
			}
			//AÑADIR + Y *
			
			String caracter1="", caracter2="";
			if (i%2==0){
				caracter1="+ ";
				caracter2="* ";
			}
			else{
				caracter1="* ";
				caracter2="+ ";
			}
			for (int j=1;j<=i;j++){
				if (j%2==0){
					
					linea=linea+caracter2;
				}
				else{
					linea=linea+caracter1;
				}
			}
				System.out.println(linea);
				linea="";     //para que la linea empieze desde el vacio
			}
		}

		}
			

	

