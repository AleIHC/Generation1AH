package com.generation.f20220526;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ColeccioArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Palabra reservada
		//ArrayList son dinámicos
		//Con esto se crea una instancia de clase
		//Arreglo de tipo objeto
		
		ArrayList<String> colores = new ArrayList<String>();
		ArrayList<Integer> numPar = new ArrayList<Integer>();
		
		//Agregar un elemento a la lista
		colores.add("Negro");
		colores.add("Azul");
		
		//Si existe un elemento en la posición lo desplaza a la derecha
		colores.add(1, "Verde");
		
		//Se puede crear el indice siguiente, pero no más allá de eso
		colores.add(2, "Amarillo");
		
		//Imprimir el contenido
		System.out.println(colores);
		
		//Acceder a un elemento
		System.out.println(colores.get(1));
		
		//Tamaño del arreglo, length es para estáticos y size para dinámicos
		System.out.println(colores.size());
		
		//Cambiar un elemento, se utiliza Set con el índice y el cambio
		colores.set(2, "Turquesa");
		System.out.println(colores);
		
		//Quitar elemento
		colores.remove(1);
		System.out.println(colores);
		
		//Recorrer el arreglo
		for (int i = 0; i < colores.size(); i++) {
			System.out.println(colores.get(i));
		}
		
		for (String color  : colores) {
			System.out.println(color);
			
		}
		
		Collections.sort(colores);
		System.out.println(colores);
		
		numPar.add(4);
		numPar.add(18);
		numPar.add(20);
		numPar.add(982);
		numPar.add(40);
		numPar.add(40022);
		System.out.print(numPar + " ");
		System.out.println();
		
		//Ordenar
		Collections.sort(numPar);
		System.out.println(numPar + " ");
		
		
		//Reverse no ordena de manera descendente, ordena a la inversa
		Collections.reverse(numPar);
		System.out.println(numPar);
		
		
		//Quitar todos los elementos
		//colores.clear();
		//System.out.println(colores);
		
		
		
		
	}

}
