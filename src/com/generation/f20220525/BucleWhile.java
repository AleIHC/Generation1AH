package com.generation.f20220525;

import java.util.Scanner;

public class BucleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese la opci�n (1) Entrar ; (0) Salir");
		int opcion = sc.nextInt();//capturando ingreso
		
		//While valida que la condici�n sea verdadera
		while (opcion != 0 && opcion != 1) {//hay que preguntar lo contrario para que se vuelva a preguntar si no coloca 0 ni 1, la idea es que ingrese al while si no cumple la condici�n
			System.out.println("Est�s mal");
			
			System.out.println("Ingrese la opci�n (1) Entrar ; (0) Salir");
			opcion = sc.nextInt();
		}
		
		System.out.println(" fuera del while");
	}

}
