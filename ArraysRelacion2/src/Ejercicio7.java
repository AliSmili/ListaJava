
public class Ejercicio7 {

	public static void main(String[] args) {
		
		// EJERCICIO 7 DE LA RELACION 2
		
		int notas[]={3,7,6,1,2,4,7,9,123};
		int numAprob=0;
		
		
		numAprob=NumAprobados(notas);
		
		System.out.println("El número de aprobados es: "+numAprob);
		
		
		

	}
	public static int NumAprobados(int[]array){
		int contador=0;
		for(int i=0;i<array.length;i++){
			if(array[i]>=5 && array[i]<=10){
				contador++;
			}
		}
		return(contador);
	}

}
