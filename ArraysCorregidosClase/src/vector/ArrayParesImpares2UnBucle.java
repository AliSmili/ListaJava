package vector;

public class ArrayParesImpares2UnBucle {

	public static void main(String[] args) {
		// SACAR UN ARRAY DONDE APARECEN PRIMERO LOS PARES Y LUEGO LOS IMPARES pero con un solo bucle
				int numParesImparesDes[]={2,3,5,112,7,8,11};
				int numOrdenados[]=new int[numParesImparesDes.length];
				int aux=0;
				
				for(int i=0; i<numParesImparesDes.length;i++){
					for(int j=numParesImparesDes.length-1;j>=0;j--){
						
						if(numParesImparesDes[j]%2==0){
							numOrdenados[aux++]=numParesImparesDes[j];
						}
						else{
							numOrdenados[j--]=numParesImparesDes[j];
							
						}
						
					}
					
				}
				for(int i=0;i<numOrdenados.length;i++){
					
				}
				
				
	}

}
