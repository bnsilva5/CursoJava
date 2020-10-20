package co.edu.sena.algoritmia.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio54 {

	public static void main(String[] args) {
		
			char a;
		
		Scanner teclado = new Scanner(System.in);
		List<Integer> arreglo = new ArrayList<>();
		
		for(int i=0; i < 6; i++) {
			arreglo.add(teclado.nextInt());
		}

		System.out.println("Escriba como quiere organizar los numeros A(Ascendente)/D(Descendente)");
		a = teclado.next().charAt(0);

		if (a == 'A' || a == 'a') {
			for (int i = 0; i < arreglo.size(); i++) {
				for (int j = i + 1; j < arreglo.size(); j++) {
					if (arreglo.get(i) > arreglo.get(j)) {
						int burbuja = arreglo.get(i);
						arreglo.set(i, arreglo.get(j));
						arreglo.set(j, burbuja);
					}
				}
			}
		} else {
			if (a == 'd' || a == 'D') {
				for (int i = 0; i < arreglo.size(); i++) {
					for (int j = i + 1; j < arreglo.size(); j++) {
						if (arreglo.get(i) < arreglo.get(j)) {
							int burbuja = arreglo.get(i);
							arreglo.set(i, arreglo.get(j));
							arreglo.set(j, burbuja);
						}
					}
				}
			}
		}

		for(int i=0; i < arreglo.size(); i++) {
			System.out.println(arreglo.get(i));
		}
	}

}
