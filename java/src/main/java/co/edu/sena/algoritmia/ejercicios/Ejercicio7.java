package co.edu.sena.algoritmia.ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int []arreglo = new int [5];
		
		for(int i=0; i<arreglo.length; i++) {
			System.out.println("Escriba un numero para la posicion: " + i);
			arreglo[i] = teclado.nextInt();
		}
		
		
		for(int i=0; i<arreglo.length; i++) {
			for(int j=i+1; j<arreglo.length; j++) {
				if(arreglo[i] > arreglo[j]) {
					int burbuja = arreglo[i];
					arreglo[i] = arreglo[j];
					arreglo[j] = burbuja;
				}
			}
		}
		
		for(int i=0; i<arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
	}

}
