package com.generation.f20220601.pruebasUnitarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest2 {
	//TDD
	//Cuando se haga una acción se espera tal resultado
	Calculadora calc = new Calculadora();
	
	@Test
	public void testSuma() {
		int resultado = calc.suma(12, 42);
		//assertEquals(//valorEsperado, resultado);
		assertEquals(54, resultado);
	}

	@Test
	public void testResta() {
		int resultado = calc.resta(42, 12);
		//assertEquals(//valorEsperado, resultado);
		assertEquals(30, resultado);
	}

	@Test
	public void testMultiplicacion() {
		int resultado = calc.resta(42, 12);
		assertEquals(504, resultado);
	}

	@Test
	public void testDivision() {
		String resultado = calc.division(12, 0);
		//assertEquals(//valorEsperado, resultado);
		assertEquals("No se puede dividr por cero", resultado);
	}
	
	@Test
	public void testEsPar() {
		boolean resultado = calc.esPar(4);
		assertTrue(resultado); // Validar que resultado sea true
		assertNotNull(resultado); //Validar que resultado no sea Null
		assertNotSame(false, resultado); //Validar que argumentos sean distintos
		
	}
	
	
	@Test
	public void testEsImpar() {
		boolean resultado = calc.esImpar(6); 
		assertFalse(resultado); //Validar que resultado sea Falso
	}

}
