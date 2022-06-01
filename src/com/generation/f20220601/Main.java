package com.generation.f20220601;

import java.util.ArrayList;
import java.util.List;

import com.generation.f20220601.modelos.Gato;
import com.generation.f20220601.modelos.Mascota;
import com.generation.f20220601.modelos.Mishi;
import com.generation.f20220601.modelos.Perro;

public class Main {

	public static void main(String[] args) {
		//Lista
		List<Mascota> ListaMascotas = new ArrayList<Mascota>();
		
		//Herencia
		//Caso genéricode clase mascota 
		Mascota mascota = new Mascota();
		mascota.setColor("gris");
		mascota.setNombre("Tom");
	
		Perro perro = new Perro();
		perro.setColor("Verde");
		perro.setEspecie("Canino");

		
		Gato gato = new Gato();
		gato.setColor("Azul");
		gato.setEspecie("Felino");
		gato.setPelaje("pelos");
		gato.setGarraRetractil(true);
		
		Mishi mishi = new Mishi();
		mishi.setColor("Morado");
		System.out.println(mishi.toString());
		/*if(mishi.getFamosoEnInternet() == true) {
			System.out.println("Sí, soy fabuloso");
		}*/
		
		ListaMascotas.add(perro);
		ListaMascotas.add(gato);
		
		
		//Pruebas para imprimir
		System.out.println(gato);
		System.out.println("La mascota numero " + (ListaMascotas.indexOf(perro) + 1) + " tiene los siguientes atributos: \n");
		System.out.println(perro.toString());
		System.out.println("El gato es de color " + gato.getColor());
		if (gato.getGarraRetractil() == true) {
			System.out.println("Puedo escalar");
		}
		//Notar atributos repetidos
		
		
		/************************POLIMORFISMO*****************************/
		
		//Un objeto padre se comporta como hijo
		Mascota regalon = new Mascota("negro", "canes", "Pelo", "Firulais", 1.5f, "Macho");
		ListaMascotas.add(regalon);
		System.out.println();
		
		//Creando nueva mascota que se va a visualizar como un gato, pero es de tipo mascota
		Mascota felix = new Gato();
		felix.setNombre("Felix");
		felix.setColor("Negro");
		felix.setPeso(3);
		ListaMascotas.add(felix);
		
		//3era instancia
		Mascota chocolo = new Perro();
		chocolo.setNombre("Chocolo");
		chocolo.setColor("Cafe");
		chocolo.setPeso(10);
		ListaMascotas.add(chocolo);
		
		/***********************Sobrecarga de Método**************************/
		regalon.hacerSonido();//Llamando al método en mascotas
		felix.hacerSonido();//En este caso corresponde al método de gato que resultó en override
		chocolo.hacerSonido();
		System.out.println("***********");
		for (Mascota mascota2 : ListaMascotas) {
			mascota2.hacerSonido();
		}
		
		//Transformar el objeto genérico a uno específico se puede hacer casteando
		Perro perroChocolo = (Perro) chocolo;
		perroChocolo.setCantPaseos(3);
	}

}
