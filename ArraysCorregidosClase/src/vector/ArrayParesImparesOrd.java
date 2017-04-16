package vector;

public class ArrayParesImparesOrd {

	public static void main(String[] args) {
		// SACAR UN ARRAY DONDE APARECEN PRIMERO LOS PARES Y LUEGO LOS IMPARES
		int numParesImparesDes[]={2,3,5,112,7,8,11};
		int numOrdenados[]=new int[numParesImparesDes.length];
		int j=0;
		
		for(int i=0;i<numParesImparesDes.length;i++){
			if(numParesImparesDes[i]%2==0){
				numOrdenados[j++]=numParesImparesDes[i];			//NO ++j, ya que se almacena en j=0 y luego se incrementa
				
			}		
		}
		for(int i=0;i<numParesImparesDes.length;i++){
			if(numParesImparesDes[i]%2==1){
				numOrdenados[j++]=numParesImparesDes[i];			
				
			}
			
		}
		for (int c : numOrdenados) {
			System.out.print(c+" ");
			
		}
		
		

	}

}
