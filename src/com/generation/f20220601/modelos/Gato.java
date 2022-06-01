package com.generation.f20220601.modelos;

public class Gato extends Mascota{
	private Boolean garraRetractil;
	private Boolean visionNocturna;
	private String sonidoVocal;
	
	//Constructor con parámetros
	public Gato(Boolean garraRetractil, Boolean visionNocturna, String sonidoVocal) {
		super();
		this.garraRetractil = garraRetractil;
		this.visionNocturna = visionNocturna;
		this.sonidoVocal = sonidoVocal;
	}
	
	//Constructos vacío
	public Gato() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Gato(String color, String especie, String pelaje, String nombre, float peso, String sexo) {
		super(color, especie, pelaje, nombre, peso, sexo);
		// TODO Auto-generated constructor stub
	}

	//Getter & Setter
	public Boolean getGarraRetractil() {
		return garraRetractil;
	}

	public void setGarraRetractil(Boolean garraRetractil) {
		this.garraRetractil = garraRetractil;
	}

	public Boolean getVisionNocturna() {
		return visionNocturna;
	}

	public void setVisionNocturna(Boolean visionNocturna) {
		this.visionNocturna = visionNocturna;
	}
	
	public String getSonidoVocal() {
		return sonidoVocal;
	}
	public void setSonidoVocal(String sonidoVocal) {
		this.sonidoVocal = sonidoVocal;
	}

	@Override
	public void hacerSonido() {
		System.out.println("Meow, meow");
	}
	
	//ToString
	//Comentarios para verificar la sobreescritura
	@Override
	public String toString() {
		return "Gato [garraRetractil=" + garraRetractil + ", visionNocturna=" + visionNocturna + ", sonidoVocal=" + sonidoVocal + " " + super.toString() + "]";//Clase super para buscar un atributo o metodo de clase padre, pero dentro de la clase
	}
	
	
}
