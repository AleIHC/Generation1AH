package com.generation.f20220526;

import java.util.Scanner;

public class Funciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Funciones
		//4 Tipos de funciones
		//2 que retornan
		//2 que no retornan (como void)
		//nombre de la funcion se escribe con minuscula la primera letra
		//Hay que definir el tipo de parametro
		//No se peude crear un metodo dentro de otro metodo, si puede llamar a otro metodo
		
		calculoSumaImpares();//Llamado al metodo
		calculoSumaPares(true, 23, "33", 44l, "Summar");
		
		int edad = obtenerEdad();
		System.out.println(edad);
		
		boolean mayorMenor = validarMayorEdad(edad);
		
		if(mayorMenor == true) {
			System.out.println("Puede ingresar al curso");
		} else {
			System.out.println("No puede ingresar");
		}
		
	}
	
	/*******************FUNCIONES QUE RETORNAN*************************/
	
	//Accesador - tipo de retorno - nombre de la función(parámetros)
	public static void calculoSumaPares(boolean verdad, int numero1, String numero2, Long numero3, String accion) {
		Integer num2 = Integer.parseInt(numero2);
		System.out.println(numero1 + numero3 + num2);
		
	}
	
	//"Static" nos permite acceder al metodo
	public static void calculoSumaImpares() {
		//solicitar ingreso de datos por ejemplo
		//funcion más simple
		System.out.println("Hola");
	}
	
	/*******************FUNCIONES QUE NO RETORNAN*************************/
	
	//funcion que retorna tipo de dato
	public static Integer obtenerEdad() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese edad");
		Integer edad = sc.nextInt();
		return edad;//retornar el contenido de la variable
	}
	
	public static Boolean validarMayorEdad(Integer edad) {
		if (edad >= 18) {
			System.out.println("Es mayor de edad");
			return true;
		} else {
			System.out.println("Es menor de edad");
			return false;
		}
	}
	
}
