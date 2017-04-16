import java.util.*;

public class Ejercicio1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float nota = 0;
		boolean error = false;
		String resultado = "";

		do {
			error = false;
			System.out.println("Nota: ");
			resultado = sc.next();
			try {
				nota = Float.parseFloat(resultado);
			} catch (NumberFormatException ne) {
				error = true;
				System.out.println("Error no has introducido un numero");
			} catch (Exception e) {
				error = true;
				System.out.println("Error generico, revisa la excepcion");
			}
			if (!(nota >= 0 && nota <= 10)) {
				error = true;
				System.out.println("El numero no esta comprendido entre 0 y 10");
			}
		} while (error);

		if (nota >= 0 && nota <= 4.99f) {
			resultado = "Suspenso";
		} else if (nota >= 5 && nota <= 5.99f) {
			resultado = "Aprobado";
		} else if (nota >= 6 && nota <= 6.99f) {
			resultado = "Bien";
		} else if (nota >= 7 && nota <= 8.99f) {
			resultado = "Notable";
		} else if (nota >= 9 && nota <= 10) {
			resultado = "Sobresaliente";
		}

		System.out.println("El resultado es: " + resultado);
	}
}
