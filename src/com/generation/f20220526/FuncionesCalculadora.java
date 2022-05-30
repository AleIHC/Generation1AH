package com.generation.f20220526;

public class FuncionesCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Math
		//Elevar o potencia
		double numeroElevado = Math.pow(4.5, 2);
		System.out.println(numeroElevado);
		
		//Redondear al entero mayor
		double enteroMayor = Math.ceil(numeroElevado);
		System.out.println(enteroMayor);
		
		//Redondear al entero menor
		double enteroMenor = Math.floor(numeroElevado);
		System.out.println(enteroMenor);
		
		//Redondeo
		double enteroRedondo = Math.round(numeroElevado);
		System.out.println(enteroRedondo);
		
		
		//Numeros aleatorios
		double enteroRandom = Math.random();
		System.out.println(enteroRandom);
		
		//Numeros aleatorios entre 0 y 100
		double num010 = Math.random() * 100;
		System.out.println(num010);
		
		//Numeros aleatorios entre 2 y 8
		double num28 = 2 + (Math.random() * 8);
		System.out.println(Math.abs(num28));
		System.out.println(Math.round(num28));
		
		//numero aleatorio entre 4 y -4
		double numNegPos = (Math.random()* (4 - -4)) + - 4;
		System.out.println(numNegPos);
	}
}
