package com.generation.f20220527;

public class Auto {
	//Clase es un modelo o prototipo
	//Nace a partir de la clase, tiene características o atributos
	//Algo concreto se vuelve abstracto
	
	/******ESTRUCTURA******/
	//Atributo
	//Constructores, se crean con click derecho y source -> generate constructor using fields
	//Accesadores y mutadores (get y set)
	//Métodos y funciones
	/**********************/
	
	//Atributos, lo primero es la accesibilidad del atributo
	//Lo primero siempre es crearlos privados
	//accesador tipo nombreDelAtributo
	private String color;
	private String marca;
	private String modelo;
	private Double velocidad;
	
	//Constructor con parámetros
	public Auto(String color, String marca, String modelo, Double velocidad) {
		super();
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = velocidad;
	}

	//Constructor vacío
	public Auto() {
		//Hace la conexión con la clase superior, en este caso "Object"
		super();
	}

	//Public significa que podemos acceder, private es que es inmutable
	//Accesadores y mutadores
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}
	
	//Métodos y funciones, son personalizadas hay que escribirlas, el static no se usa acá porque lo hace fijo
	public void aumentarVelocidad() {
		//Atributo de esta clase (This)
		this.velocidad = 10d;
	}
	
	
	
	
	
	
}
