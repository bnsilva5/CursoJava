package co.edu.sena.algoritmia.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio51 {

	public static void main(String[] args) {
		
			int i;
			int s=0;
			int p;
		
		Scanner teclado = new Scanner(System.in);
		List<Integer> arreglo = new ArrayList<>();

		for (i = 0; i < 4; i++) {
			arreglo.add(teclado.nextInt());
		}

		
		for (i = 0; i < arreglo.size(); i++) {
			s=s+arreglo.get(i);
		}
		
		p=s/i;
		
		System.out.println("La suma de los numeros es: " + s);
		System.out.println("El promedio es: " + p);
	}

}
