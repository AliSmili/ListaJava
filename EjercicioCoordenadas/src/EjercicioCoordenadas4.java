
public class EjercicioCoordenadas4 {

	public static void main(String[] args) {
		// Generar uns coordenadas triples  del 1 al 10 cada indice que no tengan dos indices iguales
		
	for (int i=1;i<=10;i++){
		for(int j=1;j<=10;j++){
			for (int k=1;k<=10;k++){
				if (i!=k && i!=j &&j!=k){
					System.out.println("("+i+","+j+","+k+")");
				}
			}
		}
	}

	}

}
// se puede hacer tb (recom por el profe): if (i==j || j==k||i==k){
// continue;