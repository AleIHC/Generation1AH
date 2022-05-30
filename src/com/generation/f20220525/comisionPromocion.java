package com.generation.f20220525;

import java.util.Scanner;

public class comisionPromocion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Terminar a las 11
		// Scanner entrada = new Scanner(System.in);
		// variables estaticas 10000 5001 9999 1001 4999 1000
				
		int comision0 = 1000; //<= a     $1000 - N/A  
		
		int comision1 = 4999;// $1001 - $4999 - 10%  utilizar comision1+1 para llegar a 5001
		
		int comision2 = 9999;
		
		int comision3 = 10000;
		
		Scanner entrada = new Scanner(System.in);
		
		//Variables de operacion
		
		double porcentaje1 = 0.9;
		double porcentaje2 = 0.8;
		double porcentaje3 = 0.7;
		
		double valorTotal= 0;
		double valorComision = 0;
		
		System.out.println("Ingrese un monto para calcular la comision");
		int ventaCliente = entrada.nextInt();
		
		//Condicionales
		if (ventaCliente > comision0 && ventaCliente < comision1 ) {
			valorTotal = ventaCliente * porcentaje1;
		} else if (ventaCliente > (comision1+1) && ventaCliente < comision2) {
			valorTotal = ventaCliente * porcentaje2;
		}else if (ventaCliente >= comision3) {
			valorTotal = ventaCliente * porcentaje3;
		}else{
			System.out.println("El monto ingresado no aplica a la promocion");
		}
		
		valorComision =  ventaCliente - valorTotal;
		
		//Comentarios al usuario
		System.out.println("El valor total es:" + valorTotal);
		System.out.println("La comision es:" + valorComision);
		System.out.println("Ahora continúe con las siguientes instrucciones para saber su descuento en entradas");
		
		/********************************************/
		
		
		//Variables
		int edad,edadDescNinos,edadDescMayores,cantidadDeTickets;  //Declarar variables en una sola línea
		double descNinos,descMayores,descDesdeDos,precio;
		Scanner entrada2 = new Scanner(System.in);
		
		//Estáticas
		
		edadDescNinos = 15;
		edadDescMayores = 60;
		precio = 3500;
		descNinos = 0.4;
		descMayores = 0.45;
		descDesdeDos = 0.7;
		
		System.out.println("Por favor, ingrese su edad");
		edad = entrada2.nextInt();
		
		//Condicionales
		if(edad<=edadDescNinos){
		
		precio = precio * descNinos;
		System.out.println("El costo de su entrada es de: $" + precio);
		
		}else if(edad>edadDescNinos && edad<=edadDescMayores){
					System.out.println("Cuantos tickets deseas comprar?");
					cantidadDeTickets = entrada2.nextInt();
					if(cantidadDeTickets > 1){
						precio = precio * cantidadDeTickets*descDesdeDos;
						System.out.println("El costo de su entrada es de: $" + precio);
						}
		
		}
		
		else if(edad>edadDescMayores){
		
		precio = precio * descMayores;
		System.out.println("El costo de su entrada es de: $" + precio);
		}
		
	}

}



		
