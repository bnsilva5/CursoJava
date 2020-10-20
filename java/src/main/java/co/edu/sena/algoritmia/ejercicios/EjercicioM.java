package co.edu.sena.algoritmia.ejercicios;

import java.util.Scanner;

public class EjercicioM {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int fila =2;
		int columna=3;
		
		int [][] matriz = new int[fila][columna];
		
		for(int i=0; i<fila; i++) {
			for(int j=0; j<columna; j++) {
				System.out.println("Escriba un numero para la posicion: ["+i+"],["+j+"]:");
				matriz[i][j] = teclado.nextInt();
			}
		}

		
		for(int i=0; i<fila; i++) {
			for(int j=0; j<columna; j++) {
				System.out.println("["+i+"],["+j+"]: "+ matriz[i][j]);
			}
		}
	}

}
