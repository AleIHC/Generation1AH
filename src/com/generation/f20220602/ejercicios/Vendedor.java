package com.generation.f20220602.ejercicios;

public class Vendedor extends Usuario{
	  //Atributos
	  private Boolean puedePublicar = true;
	  private int cantPublicaciones;
	  
	  //contructor vacío
	  public Vendedor() {
			super();
			// TODO Auto-generated constructor stub
		}
	  
	  //contructor con parámetros
		public Vendedor(Boolean puedePublicar, int cantPublicaciones) {
		super();
		this.puedePublicar = puedePublicar;
		this.cantPublicaciones = cantPublicaciones;
		}
		
		//Getter & setter
		public Boolean getPuedePublicar() {
			return puedePublicar;
		}

		public void setPuedePublicar(Boolean puedePublicar) {
			this.puedePublicar = puedePublicar;
		}

		public int getCantPublicaciones() {
			return cantPublicaciones;
		}

		public void setCantPublicaciones(int cantPublicaciones) {
			this.cantPublicaciones = cantPublicaciones;
		}
		
		//ToString
		@Override
		public String toString() {
			return "Vendedor [puedePublicar=" + puedePublicar + ", cantPublicaciones=" + cantPublicaciones + "]";
		}

		//usuario prueba = nombre: usuarioPrueba password: test123 
	    @Override
    	public Boolean login(String nombre, String password) {
    		
    		if (nombre.equals("usuarioPrueba")  && password.equals("test123")  ) {
    			System.out.println("Has iniciado Sesion como vendedor ");
    			return true;
    		}
    		else {
    			System.out.println("Acceso denegado");
    			return false;
    		}
	    }
	    
	  //Vendedor método
	    public String respondePreguntas(String respuesta) {
	  		System.out.println("su respuesta es: " + respuesta);
	  		return respuesta;
	  	}

}
	    
