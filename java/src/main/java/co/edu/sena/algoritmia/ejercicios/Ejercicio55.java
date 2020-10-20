package co.edu.sena.algoritmia.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio55 {

	public static void main(String[] args) {
		
		int r;
		Scanner teclado = new Scanner(System.in);
		List<Integer> arreglo = new ArrayList<>();
		
		for(int i=0; i < 6; i++) {
			arreglo.add(teclado.nextInt());
		}
		
		r=0;
		for(int i=0; i < arreglo.size(); i++) {
			for(int j= i+1; j < arreglo.size(); j++) {
				if(arreglo.get(i) == arreglo.get(j)) {
					r=r+1;
				}
			}
		}
		
		System.out.println("Hay " + r + " numeros repetidos");
		
	}
}
