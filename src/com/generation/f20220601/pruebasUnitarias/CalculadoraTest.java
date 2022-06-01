package com.generation.f20220601.pruebasUnitarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {
	Calculadora calc = new Calculadora();
	
	@Test
	public void test() {
		int resultado = calc.suma(12, 42);
		//assertEquals(//valorEsperado, resultado);
		assertEquals(54, resultado);
		
	}
	@Test
	public void testMultiplicacion() {
		String res =calc.division(0, 0);
		assertEquals("No se puede dividir por cero", res);
		assertNotNull(res);
		assertNotEquals("0", res);
	}
	@Test
	public void testDivision() {
		String res =calc.division(0, 0);
		assertEquals("No se puede dividir por cero", res);
		assertNotNull(res);
		assertNotEquals("0", res);
	}
}
