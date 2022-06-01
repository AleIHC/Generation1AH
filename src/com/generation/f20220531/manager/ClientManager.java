package com.generation.f20220531.manager;

import java.util.List;

import com.generation.f20220531.Cliente;

//Lógica de negocio
public class ClientManager {
	//Recorrer el arreglo
	
	public void recorrerArregloCliente(List<Cliente> listaCliente) {
		for (Cliente cliente : listaCliente) {
			System.out.println("***********" + listaCliente.indexOf(cliente) + "***************");
			System.out.println("Tu nombre es: " + cliente.getNombre());
			System.out.println("Tu RUT es: " + cliente.getRut());
			System.out.println("Tu identificador es: " + cliente.getId());
			System.out.println("Tu correo es: " + cliente.getCorreo());
			System.out.println("******************************");
		}
	}
}
