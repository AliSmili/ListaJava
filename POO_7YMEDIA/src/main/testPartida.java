package main;
import models.*;
import java.util.*;

public class testPartida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Baraja misCartas = new Baraja();
        misCartas.barajar();

        //Imprimir todas las 40 cartas en el orden a repatir
        for( int i = 0; i < 10; i++){
            //Repatir e imprimir 4 cartas
            //El gui�n antes del 20 es para alinear a la izquierda con un ancho de 20
            System.out.printf("%-20s%-20s%-20s%-20s\n", misCartas.repartirCartas(),
                    misCartas.repartirCartas(), misCartas.repartirCartas(),
                    misCartas.repartirCartas());
        } //Fin del for
    } //Fin del main
}