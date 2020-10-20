package co.edu.sena.algoritmia.ejercicios;

import java.util.Scanner;

public class EjercicioMatriz {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int sV = 0;
		int pTrimestre = 0;
		int pTotal=0;
		int cantidadVendedores;
		int [][] trimestre = null;
		String [] nombreVendedor = null;
		
				
		System.out.println("Escriba la cantidad de vendedores: ");
		cantidadVendedores = teclado.nextInt();
		
		
		nombreVendedor = new String [cantidadVendedores];
		trimestre = new int [cantidadVendedores][2];
		
		
		for (int i = 0; i < cantidadVendedores; i++) {
			System.out.println("Escriba el nombre para el Vendedor: " + (i + 1));
			nombreVendedor[i] = teclado.next();
			
			for (int j = 0; j < trimestre.length; j++) {
				
				System.out.println("Escriba el valor de la venta que realizó: " + nombreVendedor[i] + " en el trimestre: " + (j + 1));
				trimestre [i][j] = teclado.nextInt();
				sV = sV + trimestre [i][j];
			}
		}
		
		System.out.println(sV);
		
		for (int i = 0; i<nombreVendedor.length; i++ ) {
			for (int j = 0; j<trimestre.length; j++ ) {
				System.out.println(nombreVendedor [i] + trimestre [i][j]);
			}
		}
		
		
		
		pTrimestre = sV/2;
		for (int i = 0; i<trimestre.length; i++ ) {
			System.out.println("Promedio trimestre: " + i + pTrimestre);
		}
	
		for (int i = 0; i<nombreVendedor.length; i++ ) {
			for (int j = 0; j<trimestre.length; j++ ) {
				pTotal = sV / 4;
			}
		}
		System.out.println("El promedio Total de todos los vendedores es: " + pTotal);
	}
}
