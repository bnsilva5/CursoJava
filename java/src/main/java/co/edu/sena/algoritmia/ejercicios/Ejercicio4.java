package co.edu.sena.algoritmia.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int cont;
		boolean flag;
		//---- Entrada
		Scanner teclado = new Scanner(System.in);
		List<Integer> arreglo = new ArrayList<>();
		
		//--- Lectura
		System.out.println("Escriba 6 numeros: ");
		for(int i=0; i<6; i++) {
			arreglo.add(teclado.nextInt());
		}
		
		//--- Operacion
		
		cont = 0;
		
		for(int i=0; i<=4; i++) {
			flag = true;
			for(int j=2; j<= arreglo.get(i)/2; j++) {
				if(arreglo.get(i) % j==0) {
					flag = false;
					break;
				}
			}
			if(flag) 
				cont = cont +1;
		}
		
		System.out.println("Cantidad de numeros primos: " + cont);
	}

}
