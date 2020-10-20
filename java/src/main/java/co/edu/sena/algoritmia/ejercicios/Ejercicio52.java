package co.edu.sena.algoritmia.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio52 {

	public static void main(String[] args) {
		
			int i;
			int ma;
			int me;
		Scanner teclado = new Scanner(System.in);
		List<Integer> arreglo = new ArrayList<>();
		
		for (i = 0; i < 4; i++) {
			arreglo.add(teclado.nextInt());
		}

		ma=arreglo.get(0);
		me=arreglo.get(0);
		for (i = 0; i < arreglo.size(); i++) {
			
			if(arreglo.get(i) > ma) {
				ma=arreglo.get(i);
			}
			
			if(arreglo.get(i) < me) {
				me=arreglo.size();
			}
		}
		
		System.out.println("Mayor " + ma);
		System.out.println("Menor " + me);
	}

}
