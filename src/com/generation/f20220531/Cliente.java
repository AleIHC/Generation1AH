package com.generation.f20220531;

import java.util.List;

public class Cliente {
	//El objetivo de la encapsulación es de protección de los datos
	//El package se crea para crear los objetos de un tipo
	/********************************************ACÁ HAY UN EJEMPLO DE ENCAPSULAMIENTO***********************************************/
	//No tienen accesadores por lo que están como default, solo se puede acceder a los atributos si se está en el mismo package
	private String rut;
	private Integer id;
	//Privados solo se pueden usar dentro de la clase
	private List<Integer> numerosVenta; 
	private String nombre;
	private String correo;
	
	//Constructores
	public Cliente() {
		super();
	}
	
	//Crear constructores con click derecho
	public Cliente(String rut, Integer id, List<Integer> numerosVenta, String nombre, String correo) {
		super();
		this.rut = rut;
		this.id = id;
		this.numerosVenta = numerosVenta;
		this.nombre = nombre;
		this.correo = correo;
	}
	
	
	public void modificarAtributo() {
		this.rut = "123456789-0";
		nombre="Donato";
	}
	
	//Setters y getters
		public String getNombre() {
		return nombre;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Integer> getNumerosVenta() {
		return numerosVenta;
	}

	public void setNumerosVenta(List<Integer> numerosVenta) {
		this.numerosVenta = numerosVenta;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//Método toString para devolver atributos como string
	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", id=" + id + ", numerosVenta=" + numerosVenta + ", nombre=" + nombre
				+ ", correo=" + correo + "]";
	}
	
	
	
}
