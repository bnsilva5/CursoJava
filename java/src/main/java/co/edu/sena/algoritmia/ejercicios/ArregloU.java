package co.edu.sena.algoritmia.ejercicios;

import java.util.Scanner;

public class ArregloU {

	public static void main(String[] args) {
		
		// Entrada del teclado
		Scanner teclado = new Scanner(System.in);
		
		// Definicion de variables
		double s=0;
		double p=0;
		int nA=0;
		int nE=0;
		
		// Se define el tamaño del arreglo
		System.out.println("Defina el tamaño del arreglo unidimensional: ");
		nA = teclado.nextInt();
		
		
		// Definicion del arreglo
		int [] arreglo = new int [nA];
		
		
		// Seccion de codigo para digitar los numeros en el arreglo
		for (int i=0; i<arreglo.length; i++) {
			System.out.println("Escriba un numero para agregar al arreglo en la posicion: " + (i+1));
			arreglo [i] = teclado.nextInt();
		}
		
		// Seccion de codigo que muestra el contenido del arreglo
		System.out.println("Contenido del arreglo: ");
		for (int i=0; i<arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
		
		
		// Operacion para eliminar un numero del arreglo
		System.out.println("Seleccione un numero del arreglo para eliminarlo");
		nE = teclado.nextInt();
		for (int i=0; i<arreglo.length; i++) {
			if(nE == arreglo[i]) {
				arreglo[i] = 0;
			}
		}
		
		
		// Seccion de codigo que muestra el arreglo despues de eliminar el numero
		System.out.println("Contenido del arreglo despues de eliminar el numero: ");
		for (int i=0; i<arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
		
		// Operacion para calcular la suma del contenido del arreglo
		for (int i=0; i<arreglo.length; i++) {
			s = s+arreglo[i];
		}
		
		
		// Operacion para calcular el promedio del arreglo 
		//Suma del contenido del arreglo dividido por la cantidad de numeros en el arreglo
		System.out.println("Promedio del arreglo");
		p = s/arreglo.length;
		
		
		//Muestra el resultado del promedio
		System.out.println("El promedio del arreglo es:\n " + p);
		
		
		// Operacion para vaciar el arreglo
		System.out.println("Se vacia el arreglo: ");
		for (int i=0; i<arreglo.length; i++) {
			arreglo[i] = 0;
		}
		
		// Muestra el arreglo vacio
		for (int i=0; i<arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
		
	}

}
