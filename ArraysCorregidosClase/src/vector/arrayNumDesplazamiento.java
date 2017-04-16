package vector;

public class arrayNumDesplazamiento {    //Ejercicio corregido sobre desplazamiento de indices de un vector. MUY IMPORTANTE!!

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Numeros[]={2,5,6,11};
		int aux1=Numeros[0];
		for(int i=1; i<=Numeros.length;i++){
			int aux2=Numeros[i%Numeros.length];
			Numeros[i%Numeros.length]=aux1;
			aux1=aux2;
			
		}
		for (int num : Numeros) {
			System.out.print(num+" ");
			
		}
		

	}

}
