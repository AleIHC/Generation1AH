package com.generation.f20220525;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Menu
		System.out.println("Ingrese opcion");
		System.out.println(" 1 Sumar \n 2 Restar \n 3 Multiplicar \n 4 Dividir");
		int key = sc.nextInt();
		boolean errorIngreso = false;
		
		
		
		while(key < 0 || key > 4) {
			System.out.println(" 1 Sumar \n 2 Restar \n 3 Multiplicar \n 4 Dividir");
			key = sc.nextInt();
		}
		
		
		switch (key) {
		case 1:
			//Acci�n para la opci�n 1 (suma)
			System.out.println("Suma");
			break;
		case 2:
			System.out.println("Resta");
			break;
		case 3:
			System.out.println("Multiplicaci�n");
			break;
		case 4:
			System.out.println("Divisi�n");
			break;
		default:
			System.out.println("Opci�n inv�lida");
		
		}

	}

}
