package com.generation.f20220530;

public class Alumno {
	//Atributos
	//Private permite trabajar con uno de los 4 pilares, que es la proteccion a través de encapsulamiento de los atributos. Private porque solo podemos acceder dentro de la misma clase
	//Protected deja acceder no solo dentro de la misma clase sino todos los que estén dentro del package
	//Public es porque cualquiera puede acceder
	//Los atributos son en singular, no se acostumbra a hacerse en plural
	private String nombre;
	private String apellido;
	private int edad;
	private String curso;
	
	//Constructores
	public Alumno() {
		super();
	}

	//Getter & Setters, se crean con lick derecho --> source > 
	public Alumno(String nombre, String apellido, int edad, String curso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.curso = curso;
	}

	//Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	//Método toString, permite obtener los atributos en un momento
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", curso=" + curso + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
