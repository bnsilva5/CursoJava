package co.edu.sena.algoritmia.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prueba1 {

	public static void main(String[] args) {
		
		int s=0;
		//-- Entrada
		Scanner teclado = new Scanner(System.in);
		List<Integer> arreglo = new ArrayList<>();
		
		
		
		//---- Lectura
		for(int i=0; i<5; i++) {
			arreglo.add(teclado.nextInt());
		}
		
		//--- Operacion 
		for(int i=0; i<arreglo.size(); i++) {
			s = s + arreglo.get(i);
		}
		
		//---- Salida
		System.out.println(s);
	}

}
