package com.generation.f20220602.ejercicios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Usuario usuarioPrueba = new Usuario();
		Usuario vendedorPrueba = new Vendedor();
		
		Usuario clientePrueba = new Cliente();
		System.out.println("Ingrese su nombre de usuario:");
		String nombreUsuario = sc.nextLine();
		
		System.out.println("Ingrese su contraseña:");
		String passwordUsuario = sc.nextLine();
		
		usuarioPrueba.login(nombreUsuario, passwordUsuario);
		
		System.out.println("Ingrese su nombre de Vendedor:");
		String nombreVendedor = sc.nextLine();
		
		System.out.println("Ingrese su contraseña:");
		String passwordVendedor = sc.nextLine();
		
		vendedorPrueba.login(nombreVendedor, passwordVendedor);
		
		System.out.println("Ingrese su nombre de Cliente:");
		String nombreCliente = sc.nextLine();
		
		System.out.println("Ingrese su contraseña:");
		String passwordCliente = sc.nextLine();
		
		clientePrueba.login(nombreCliente, passwordCliente);
		
		//Casteamos a la clase especifica
		Cliente clientePrueba1 =  (Cliente) clientePrueba;
		System.out.println("Ingrese su pregunta:");
		String preguntaCliente = sc.nextLine();
		clientePrueba1.hacerPreguntas(preguntaCliente);
		
		Vendedor vendedorPrueba1 =  (Vendedor) vendedorPrueba;
		System.out.println("Ingrese su respuesta:");
		String respuestaVendedor= sc.nextLine();
		
		vendedorPrueba1.respondePreguntas(respuestaVendedor);
		
	}

}
