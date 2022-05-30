package com.generation.f20220525;

import java.util.Scanner;

public class BucleDoWhile {//Clases se escriben con mayuscula

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/***************
		//Do while se ejecutará por lo menos una vez
		int termino = 20;
		do {
			
			System.out.println("El valor de termino es " + termino);
			termino++;
			
		} while (termino <= 10);//parte del do while
		
		System.out.println("***********");
		
		**************/
		
		Scanner sc = new Scanner(System.in);
		int key; 
		
			
			do {
			//While valida que la condición sea verdadera
			System.out.println(" 1 Sumar \n 2 Restar \n 3 Multiplicar \n 4 Dividir");
			key = sc.nextInt();
			} while (key < 0 || key > 4);//while normal
			
	}
}
	
