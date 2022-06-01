package com.generation.f20220601.pruebasUnitarias;

public class Calculadora {
	
	public int suma(int a, int b){
		return a + b;
	}
	
	public int resta(int a, int b){
		return a - b;
	}
	
	public int multiplicacion(int a, int b){
		return a * b;
	}
	
	public String division(int a, int b){
		if(b != 0) {
			String resultado = Integer.toString(a,b);
			return resultado;
		}
		return "No se puede dividr por cero";		
	}
	
	public boolean esPar(int num) {
		if (num %2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean esImpar(int num) {
		if (num %2 != 0) {
			return true;
		} else {
			return false;
		}
	}
}
