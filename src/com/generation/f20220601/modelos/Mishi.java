package com.generation.f20220601.modelos;

public class Mishi extends Gato{
	private Boolean famosoEnInternet;
	
	//
	public Mishi() {
		super();
		// TODO Auto-generated constructor stub
	}

	//
	public Mishi(Boolean garraRetractil, Boolean visionNocturna, String sonidoVocal, Boolean famosoEnInternet) {
		super(garraRetractil, visionNocturna, sonidoVocal);
		this.famosoEnInternet = famosoEnInternet;
	}

	public Boolean getFamosoEnInternet() {
		return famosoEnInternet;
	}

	public void setFamosoEnInternet(Boolean famosoEnInternet) {
		this.famosoEnInternet = famosoEnInternet;
	}

	//Comentarios para verificar la sobreescritura
	/*
	@Override
	public String toString() {
		return "Mishi [famosoEnInternet=" + famosoEnInternet + "]";
	}*/
	
	
	

	
	
}
