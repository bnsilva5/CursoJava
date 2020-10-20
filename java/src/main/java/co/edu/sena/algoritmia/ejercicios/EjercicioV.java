package co.edu.sena.algoritmia.ejercicios;

import java.util.Scanner;

public class EjercicioV {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int []vector = new int [5];
		
		for(int i=0; i<vector.length; i++) {
			System.out.println("Escriba un numero para posicion: " + i);
			vector[i]=teclado.nextInt();
		}
		
		for(int i=0; i<vector.length; i++) {
			System.out.println(vector[i]);
		}

	}

}
