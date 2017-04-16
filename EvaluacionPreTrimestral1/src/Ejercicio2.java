
public class Ejercicio2 {

	public static void main(String[] args) {
		// Cual es la salida del trozo de código
		int aux=0;
		int i=0;
		while(i++<10){
			int j=1;
			while(j<i){
				System.out.println(i+" "+j);
				j+=1;
				aux=j;
			}
		}
		System.out.println(i+" "+aux);

	}

}
