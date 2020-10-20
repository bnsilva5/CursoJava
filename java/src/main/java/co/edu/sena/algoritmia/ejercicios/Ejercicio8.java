package co.edu.sena.algoritmia.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		int may;
		//---- Entrada
		Scanner teclado = new Scanner(System.in);
		List<Integer> arreglo = new ArrayList<>();
		
		//--- Lectura
		System.out.println("Escriba 5 numeros");
		for(int i=0; i<5; i++) {
			arreglo.add(teclado.nextInt());
		}
		
		may = 0;
		//--- Operacion
		for(int i=0; i<arreglo.size(); i++) {
			if(arreglo.get(i) > may) {
				may = arreglo.get(i);
			}
		}
		
		//----- Salida
		System.out.println("El numero mayor es: " + may);

	}

}
