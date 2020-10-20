package co.edu.sena.algoritmia.ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//-- Lectura
		Scanner teclado = new Scanner(System.in);
		
		int cont;
		int []vA = new int[4];
		int []vB = new int[4];
		
		//--- Entrada
		
		for(int i=0; i<vA.length; i++) {
			System.out.println("Vector A Escriba un numero para la posicion: " + i);
			vA[i] = teclado.nextInt();
		}
		
		for(int i=0; i<vB.length; i++) {
			System.out.println("Vector B Escriba un numero para la posicion: " + i);
			vB[i] = teclado.nextInt();
		}
		
		cont = 0;
		//--- Operacion
		for(int i=0; i<vA.length; i++) {
			for(int j=0; j<vB.length; j++) {
				if(vA[i] == vB[j]) {
					cont = cont + 1;
				}
			}
		}
		
		System.out.println("Cantidad de numeros iguales que se encontraron en los dos Vectores: " + cont);
	}

}
