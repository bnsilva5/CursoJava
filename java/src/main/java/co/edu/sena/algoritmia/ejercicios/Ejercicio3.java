package co.edu.sena.algoritmia.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int div;
		int cont;
		int []arreglo = new int [5];
		
		for(int i=0; i<arreglo.length; i++) {
			System.out.println("Escriba un numero para la posicion: " + i);
			arreglo[i] = teclado.nextInt();
		}
		
		System.out.println("Escriba un numero divisor");
		div = teclado.nextInt();
		
		
		cont = 0;
		
		for(int i=0; i<arreglo.length; i++) {
			if(arreglo[i] % div == 0) {
				cont = cont+1;
			}
		}
		
		System.out.println("Hay " + cont + " numeros multiplos de: " + div);

	}

}
