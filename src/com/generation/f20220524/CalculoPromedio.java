package com.generation.f20220524;

import java.util.Iterator;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class CalculoPromedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] notas = {98, 92, 995, 99, 99, 99, 63, 95, 34, 78, 87, 97};
		
		
		//variable acumuladora
		int sumaNotas = 0;
		int notasFueraDeRango = 0;
		
		for (int i = 0; i < notas.length; i++) {
			//validar la nota
			if(notas[i] < 0 || notas[i] > 100) {
				System.out.println("La nota: " + notas[i] + " en la posición " + (i +1)+ " está fuera de rango");
			}
			
			sumaNotas = sumaNotas + notas[i];
		}
		
		
		System.out.println("suma de notas: " + sumaNotas);
		
		//promedio -> suma todas las notas / cantidad de notas
		float promedio =sumaNotas / notas.length;
		
		
		//Punto critico
		if(promedio >= 50 && promedio <=100) {
			System.out.println("Apruebo");
		
		} else if(promedio <= 0 && promedio <= 49) {
			System.out.println("Repruebo");
		} else {
			System.out.println("Revisar notas");
		}
		
	
	}

}
