package com.generation.f20220526;

import java.util.Arrays;

public class ColeccionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array ESTÁTICOS en cantidad de elementos
		String[] colores = {"red","blue", "yellow", "orange", "black"};
		Integer[] numPar = {2, 4, 6, 7, 8,10};
		
		//Posición inicial es cero (0)
		System.out.println(colores[0]);
		
		//nombreArray[posición] ->
		System.out.println(numPar[5]);
		
		numPar[5] = 23;
		System.out.println(numPar[5]);
		
		//numPar[7] = 14;
		//Error por estar fuera de índice, no podemos agregar por posición si no existe un elemento
		
		System.out.println("El tamaño del array es de " + colores.length + " caracteres");
		
		//Imprimir contenido del arreglo
		System.out.println(Arrays.toString(colores));
		System.out.println(Arrays.toString(numPar));
		
		
		//Recorrer un arreglo
		for(int i = 0; i < numPar.length; i++) {
			System.out.println(numPar[i]);//Si se remueve el ln lo imprime sin saltar linea
		}
		
		System.out.println("\n");
		
		//foreach
		for (int i : numPar) {//{2, 4, 6, 7, 8,10};
			//int elemento = 0;
			System.out.println(i);
		}
		
		for (String color : colores) {//{"red","blue", "yellow", "orange", "black"};
			System.out.println(color);
		}
		
	}

}
