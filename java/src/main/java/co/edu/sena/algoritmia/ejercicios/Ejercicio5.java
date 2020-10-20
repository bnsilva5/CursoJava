package co.edu.sena.algoritmia.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//--- Entrada
		
		Scanner teclado = new Scanner(System.in);

		int [] arreglo = new int [5];
		int nb;
		int p;
		
		//--- Lectura
		for(int i=0; i<arreglo.length; i++) {
			System.out.println(" Escriba un numero para la posicion: " + i);
			arreglo[i] = teclado.nextInt();
		}
		
		System.out.println("Escriba el numero a buscar en el arreglo: ");
		nb = teclado.nextInt();
		
		
		p=0;
		//--- Operacion
		for(int i=0; i<arreglo.length; i++) {
			if(arreglo[i] == nb) {
			System.out.println("El numero "+ nb +" esta en el arreglo.");
			p=i;
			}
		}
		
		//--- Salida
		System.out.println("En la posicion: " + p);
	}

}
