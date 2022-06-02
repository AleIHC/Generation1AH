package com.generation.f20220602.ejercicios;

public class Usuario {
	//Atributos del usuario
    private String nombre;
    private String password;
    private String correo;
    private String rut;
    private String direccion;
    private String genero;
    private int edad;
    private Boolean esPremium;
    private Boolean usuarioBloqueado;

    //Constructor vacío
    public Usuario() {
    }
    
    //Constructor con parámetros
    public Usuario(String nombre, String password, String correo, String rut, String direccion, String genero,
                   int edad, Boolean esPremium, Boolean usuarioBloqueado) {
        this.nombre = nombre;
        this.password = password;
        this.correo = correo;
        this.rut = rut;
        this.direccion = direccion;
        this.genero = genero;
        this.edad = edad;
        this.esPremium = esPremium;
        this.usuarioBloqueado = usuarioBloqueado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Boolean getEsPremium() {
        return esPremium;
    }

    public void setEsPremium(Boolean esPremium) {
        this.esPremium = esPremium;
    }

    public Boolean getUsuarioBloqueado() {
        return usuarioBloqueado;
    }

    public void setUsuarioBloqueado(Boolean usuarioBloqueado) {
        this.usuarioBloqueado = usuarioBloqueado;
    }

    //ToString
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", password='" + password + '\'' +
                ", correo='" + correo + '\'' +
                ", rut='" + rut + '\'' +
                ", direccion='" + direccion + '\'' +
                ", genero='" + genero + '\'' +
                ", edad=" + edad +
                ", esPremium=" + esPremium +
                ", usuarioBloqueado=" + usuarioBloqueado +
                '}';
    }
        
      //usuario prueba = nombre: usuarioPrueba password: test123 
    	public Boolean login(String nombre, String password) {
    		
    		if (nombre.equals("usuarioPrueba")  && password.equals("test123")  ) {
    			System.out.println("Has iniciado Sesion como usuario");
    			return true;
    		}
    		else {
    			System.out.println("Acceso denegado");
    			return false;
    		}
    
    }
}
    


