package com.generation.f20220524;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		//Tipo de dato - nombre de variable = asignación; 
		String nombre = "Generation ''' Backslash para poner comillas y salto de linea";
		System.out.println(nombre);
		
		//
		char letraA = 'a';
		System.out.println(letraA);
		
		//Variables numéricas
		//32 Bits
		int numeroInt = 2147483647;
		System.out.println(numeroInt);
		
		//8 Bits
		byte numeroByte = 121;
		System.out.println(numeroByte);
		
		//16 Bits
		short numeroShort = 32761;
		System.out.println(numeroShort);
		
		//64 Bits (
		long numeroLong = 2147483647;
		System.out.println(numeroLong);
		
		//Float y Double (aceptan decimales) primitivo
		float altura = 1.68f;//1,68f: es un double pero para usarlo como float basta con ponerle una f al final
							//cast es convertir un tipo de dato a otro tipo
		
		
		//boolean
		boolean acepta = true;
		
		
		//Practica
		char genero = 'm';
		
		String colorCabello = "negro";
		
		boolean isEngaged = false;
		
		//Practica 2
		int poblacion = 32;
		int edad = 29;
		String nombre2 = "Alejandro";
		char genero2 = 'M';
		
		System.out.println(poblacion);
		
		//variables objeto: las de tipo objeto permite usar metodos
		System.out.println(nombre.charAt(0));
		
		String curso = "G1";
		
		//los String se comparan con equals, los = se utilizan para numeros
		if(curso.equals("g1")) {
			System.out.println("iguales");
		} else {
			System.out.println("distintos");
		}
		
		//iguala la capitalizacion
		if(curso.equalsIgnoreCase("g1")) {
			System.out.println("iguales");
		} else {
			System.out.println("distintos");
		}
		
		//Mayuscula y minuscula
		if(curso.toLowerCase().equals("g1")) {
			System.out.println("iguales");
		}
		
		if(curso.equals("g1".toUpperCase())) {
			System.out.println("iguales");
		}
		
		
		String cursoVacio =  "";//variable vacia
		String cursoNulo = null; //null
		curso.isBlank();
		curso.isEmpty();
		
		//comparar un string con null
		if (null == cursoNulo); {
			System.out.println("nulo"); 
		}
		
		Float peso2 = 73.5f;//con variable de tipo objeto también funciona la f
	
		/*Parse
		Integer.parseInt("23");//String a tipo de numero
		Double.parseDouble("2155,3");
		Long.parseLong("132564");*/
		
		//Ejercicio conversion a otros tipos de datos
		int num1 = 12;
	
		/*Conversión de datos*/
		//automatica
		//byte>short>int>long>float>double
		int num4 = 18;
		float num4f = num4;
		System.out.println(num4+ " " + num4f);
		
		//manual
		//double>float
		Double pesado = 95.6;
		/*float pesadito = pesado.floatValue();
		Float pesadez = pesado.floatValue();
		Float.valueOf(pesado.toString())
		Double pesos = pesado + 0.4; Añadir decimal pero no es la mejor manera
		*/
		
		//Operadores
		//Operadores de comparacion
		
		if (5 == (3+2) ) {
			
		}


	}
}


