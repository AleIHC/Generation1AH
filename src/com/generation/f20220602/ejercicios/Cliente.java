package com.generation.f20220602.ejercicios;

public class Cliente extends Usuario{
	//Atributos 
	private int cantCompras;
    private String interes;
    
    //Constructor vacío
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Constructor con parámetros
	public Cliente(int cantCompras, String interes) {
	super();
	this.cantCompras = cantCompras;
	this.interes = interes;
	}
	
	//Getter & setter
	public int getCantCompras() {
		return cantCompras;
	}

	public void setCantCompras(int cantCompras) {
		this.cantCompras = cantCompras;
	}

	public String getInteres() {
		return interes;
	}

	public void setInteres(String interes) {
		this.interes = interes;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Cliente [cantCompras=" + cantCompras + ", interes=" + interes + "]";
	}
	
	//usuario prueba = nombre: usuarioPrueba password: test123 
	@Override
	public Boolean login(String nombre, String password) {
			
		if (nombre.equals("usuarioPrueba")  && password.equals("test123")  ) {
			System.out.println("Has iniciado Sesion como cliente");
			return true;
			}
			else {
				System.out.println("Acceso denegado");
				return false;
			}
		} 
	
	//Cliente método
	public String hacerPreguntas(String pregunta) {
			System.out.println("La pregunta ha sido pudblicada como: " + pregunta);
			return pregunta;
		}

	
	  
	  
}
