package com.generation.f20220524;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /*Pedir: Primero solicitar todos los String sc.nextLine(); nombre, apellido,
		 * direccion
		 * 
		 * Segundo solicitar todos los datos numericos edad, numero Direccion
		 * 
		 * Saldo ($)
		 * 
		 * Validar que usuario: - Mayor de edad - Saldo minimo $50.000 else
		 * "No puede apostar" - Cuanto apostara Minimo $10.000 Si quiere apostar más
		 * avisar que no tiene más.*/
		
		
		//capturar el ingreso por consola
		Scanner sc = new Scanner(System.in);
		
		//validar la mayoria de edad
		int mayoriaEdad = 18;
		
		//solicitar ingreso de edad
		System.out.println("Ingrese su edad");
		int edad = sc.nextInt();///capturando ingreso por consola
		
		if(edad >= mayoriaEdad) {
			System.out.println("Usted es mayor de edad");
		} else {
			System.out.println("Ahora no joven");
		}
		
		
		/***************************************/
		//Variables
		int edadMin = 18;
		double balanceMin = 50000f;
		
		Scanner sc2 = new Scanner(System.in);
		

		System.out.println("Cuál es su edad?");
		int edadAct = sc.nextInt();
		
		if(edadAct >= edadMin) {
			System.out.println("Cuál es su nombre?");
			String nombre = sc2.nextLine();
			
			System.out.println("Cuál es su apellido?");
			String apellido = sc2.nextLine();
			
			System.out.println("Cuál es el nombre de la calle donde vive?");
			String direccion = sc2.nextLine();
			
			System.out.println("Cuánto saldo tiene en la cuenta?");
			double balanceAct = sc.nextFloat();
			
		
		}
		
	}
}


