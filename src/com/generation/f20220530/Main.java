package com.generation.f20220530;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.generation.f20220531.Cliente;

public class Main {

	public static void main(String[] args) {
		//List permite ampliar la cantidad de funciones
		//List diferencia con ArrayList
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		
		// TODO Auto-generated method stub
		//Instancia de una clase
		//Objetos van en mayúscula y variable en minúscula, se acostumbra que tengan el mismo nombre pero no  es necesario
		//Los paréntesis al crear una instancia de ujna clase, lo que hacen es llamar al constructor vacío
		Alumno alumno = new Alumno();  
		Alumno alumnoZero = new Alumno("Alejandro", "Heredia", 29, "G1");
		
		listaAlumnos.add(alumno);
		listaAlumnos.add(alumnoZero);
		
		//Getter
		//System.out.println(alumno.getNombre());
		//System.out.println(alumno2.getNombre());
		
		//Setter
		alumno.setNombre("Yogurt");
		//System.out.println(alumno.getNombre());
		
		/**************************************************************/
		
		Alumno alumno2 = new Alumno ("Cristobal", "Hapsoo", 23,"G1");
		Alumno alumno3 = new Alumno ("Cristian", "Yañez", 26,"G1");
		Alumno alumno4 = new Alumno ("Alejandro", "Heredia", 29,"G1");
		Alumno alumno5 = new Alumno ("Luis", "García", 28,"G1");
		Alumno alumno6 = new Alumno ("joao", "Aranda", 28,"G1");
		
		//Definiendo valores por default 
		
		//Llamndo a la funcion del get(Atributos) y set (Aignar un valor al atributo)
		System.out.println(alumno.getNombre());
		System.out.println(alumno2.getNombre());
		System.out.println(alumno3.getNombre());
		System.out.println(alumno4.getNombre());
		System.out.println(alumno5.getNombre());
		System.out.println(alumno6.getNombre());
    
   
		alumno.setNombre("Cris");
		System.out.println("--------- Grupo 3 --------");
		System.out.println("Nombre Alumno 1: " + alumno2.getNombre());
		System.out.println("Nombre Alumno 2: " + alumno3.getNombre());
		System.out.println("Nombre Alumno 3: " + alumno4.getNombre());
		System.out.println("Nombre Alumno 4: " + alumno5.getNombre());
		System.out.println("Nombre Alumno 5: " + alumno6.getNombre());

		System.out.println("Apellido Alumno 1: " + alumno2.getApellido());
		System.out.println("Apellido Alumno 2: " + alumno3.getApellido());
		System.out.println("Apellido Alumno 3: " + alumno4.getApellido());
		System.out.println("Apellido Alumno 4: " + alumno5.getApellido());
		System.out.println("Apellido Alumno 5: " + alumno6.getApellido());

		System.out.println("Edad Alumno 1: " + alumno2.getEdad());
		System.out.println("Edad Alumno 2: " + alumno3.getEdad());
		System.out.println("Edad Alumno 3: " + alumno4.getEdad());
		System.out.println("Edad Alumno 4: " + alumno5.getEdad());
		System.out.println("Edad Alumno 5: " + alumno6.getEdad());

		System.out.println("Curso Alumno 1: " + alumno2.getCurso());
		System.out.println("Curso Alumno 2: " + alumno3.getCurso());
		System.out.println("Curso Alumno 3: " + alumno4.getCurso());
		System.out.println("Curso Alumno 4: " + alumno5.getCurso());
		System.out.println("Curso Alumno 5: " + alumno6.getCurso());
    
		System.out.println(alumno2.toString());
		System.out.println(alumno3.toString());
		System.out.println(alumno4.toString());
		System.out.println(alumno5.toString());
		System.out.println(alumno6.toString());
		
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);
		
		
		
		/****************************************************************/
		
		//
		for (int i = 0; i < listaAlumnos.size(); i++) {
			System.out.println(listaAlumnos.get(i).getNombre());
			System.out.println(listaAlumnos.get(i).getApellido());
		}
		
		for (Alumno alumn  : listaAlumnos) {
			System.out.println(alumn.toString());
			alumn.getApellido();
		}
		
		/******************************************************************/
		
	
		
		
		
		
		
	}
	
}
