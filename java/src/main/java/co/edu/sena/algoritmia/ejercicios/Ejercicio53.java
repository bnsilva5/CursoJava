package co.edu.sena.algoritmia.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio53 {

	public static void main(String[] args) {
		
		int c;
		int mul;
		
		Scanner teclado = new Scanner(System.in);
		List<Integer> arreglo = new ArrayList<>();
		
		for(int i=0; i < 6; i++) {
			arreglo.add(teclado.nextInt());
		}
		
		System.out.println("Escriba un numero: ");
		mul=teclado.nextInt();
		
		c=0;
		for(int i=0; i < arreglo.size(); i++) {
			if(arreglo.get(i)%mul==0) {
				c=c+1;
			}
		}
		
		System.out.println("Cantidad de multipos del ultimo numero que ingreso: " + c);
	}

}
