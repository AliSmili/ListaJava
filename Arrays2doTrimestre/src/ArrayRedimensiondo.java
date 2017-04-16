import java.util.Scanner;
public class ArrayRedimensiondo {

	public static void main(String[] args) {
		// EJERCICIO MUY INTERESANTE DE CLASE QUE INTRODUCE SOBRE LOS ARRAYS DINÁMICOS Y USO DE FUNCIONES
		
		int miArray[] = new int[1];
		int i = 0;
		String valor = "";
		boolean masValores = true;
		boolean error = false;

		do {
			valor = leerCadena("Introduce un numero: ");
			try {
				miArray[i] = Integer.parseInt(valor);
				error = false;
			} catch (NumberFormatException e) {
				error = true;
				System.out.println("Introduce un numero!");
			}
			
			valor = leerCadena("Quieres mas numeros? (s es si)");
			masValores = valor.equalsIgnoreCase("s");

			if (masValores) {
				miArray = copiarArrayIncrementando(miArray, i++);
			}
		} while (masValores || error);

		imprimirArray(miArray);
	}

	public static String leerCadena(String mensaje) {
		Scanner sc = new Scanner(System.in);
		String a;
		System.out.println(mensaje);
		a = sc.nextLine();
		return a;
	}
	
	public static int[] copiarArrayIncrementando(int[] a, int i){
		i++;
		int arrayAux[] = new int[i + 1];
		for (int j = 0; j < a.length; j++) {
			arrayAux[j] = a[j];
		}
		return arrayAux;
	}
	
	public static void imprimirArray(int[] multijugador){
		for (int j = 0; j < multijugador.length; j++) {
			System.out.println("miArray[" + j + "]: " + multijugador[j]);
		}
	}



	}


