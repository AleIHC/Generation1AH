package com.generation.f20220527;

import java.util.ArrayList;
import java.util.HashMap;

public class ColeccionesMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Colecciones Map
		//Pares Key <-> Value
		//HashMap<K, V> map = new HashMap<K, V>();
		//HashMap mapa = new HashMap(); ---- Más utilizado porque es más fácil
		//HashMap es lo más cercano que hay en un principio a una API
		
		//Este tipo de HashMap hay que establecer el tipo de clave - valor, limitando en el tipo de dato
		//HashMap<String, String> objHashMap = new HashMap<>();
		
		//Si se hace de la siguiente manera, no hay que definir el tipo porque es un objeto
		HashMap objHashMap = new HashMap();
		
		
		objHashMap.put("Nombre", "Alejandro");
		objHashMap.put("ApellidoP", "Heredia");
		objHashMap.put("ApellidoM", "Castillo");
		objHashMap.put("Edad", "29");
		
		System.out.println(objHashMap);
		
		//HashMap no trabaja con las posiciones, obtiene valor a través de la clave
		System.out.println(objHashMap.get("Nombre"));
		
		//Eliminar
		objHashMap.remove("Edad");
		System.out.println(objHashMap);
		
		//Muestra todas las keys
		System.out.println(objHashMap.keySet());
		
		//Muestra todos los values
		System.out.println(objHashMap.values());
		
		
		//Agregar arrayList para que sea dinámico
		ArrayList<String> vocales = new ArrayList<String>();
		vocales.add("a");
		vocales.add("e");
		vocales.add("i");
		vocales.add("o");
		vocales.add("u");
		
		//Cuando no encuentra la key, retorna un null
		objHashMap.put("Vocales", vocales);
		System.out.println(objHashMap);
		
		//Crear menú de comida donde se eligen los platos y se muestra al usuario, para solicitarle que elija su plato y se imprime el plato+
		
		
		//Cómo recorrer un HashMap
		//Si se usa la sintáxis definiendo el tipo, acá habría que definir el tipo de Key
		//Si se usa la sintáxis genérica se debe indicar que el key es un Object
		//Como es un for each, la primera vez le asigna la primera key a la variable clave
		for(Object clave : objHashMap.keySet()) {
			System.out.println("Key: " + clave + " - Value: " +objHashMap.get(clave));
		}
		
		
		
	}

}
