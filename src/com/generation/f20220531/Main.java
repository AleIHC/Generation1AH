package com.generation.f20220531;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.generation.f20220531.manager.ClientManager;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Arreglo de clientes
		List<Cliente> ListaCliente = new ArrayList<Cliente>();
		int opcion = 0;
		
		// TODO Auto-generated method stub
		//Instancia de cliente
		//Si no agregamos constructores, por default viene el constructor vac�o, el objeto se crea cuando se crea con par�metros.
		
		/***************************
		//Ejemplo de constructor vac�o
		/*Cliente cliente = new Cliente();
		cliente.setId(1234);
		cliente.setNombre("Franco");
		cliente.setRut("1944664");
		*****************************/
		
		//Solicitando si quiere repetir
		do {
			
		//Otra instancia
		Cliente clienteDatosDinamicos = new Cliente();
		
		//Excepciones
		System.out.println("Indique el ID");
		
		//Integer id = sc.nextInt();
		String idString = sc.nextLine();
		
		//Try sirve para solucionar el error
			try {
				Integer id = Integer.parseInt(idString);//null para probar error
				clienteDatosDinamicos.setId(id);//id + null para probar error
				//sc.nextLine();
				System.out.println("Tu n�mero de identificaci�n es " + id);
				
				System.out.println("Ingrese nombre");
				String nombreCte = sc.nextLine();
				clienteDatosDinamicos.setNombre(nombreCte);
				System.out.println("Tu nombre es " + nombreCte);
				
				System.out.println("Ingrese RUT");
				String rutAct = sc.nextLine();
				clienteDatosDinamicos.setRut(rutAct);
				System.out.println("Tu RUT es " + rutAct);
				
				System.out.println("Ingrese correo");
				String correo = sc.nextLine();
				clienteDatosDinamicos.setCorreo(correo);
				System.out.println("Tu correo es " + correo);
				
				ListaCliente.add(clienteDatosDinamicos);
				//Integer division = 100/0;
				//System.out.println();
	
				} catch(NullPointerException npe) {
				System.out.println("No se puede realizar la operaci�n matem�tica, un dato est� mal");
				} catch(InputMismatchException ime) {
				System.out.println("Error en el ingreo de un dato");
				}
				catch(NumberFormatException sda) {
				System.out.println("No se puede crear una leta como id " + sda);
				} catch(ArithmeticException ae) {
				System.out.println("No se puede dividir por 0");
				}
						
				catch (Exception e) {
				System.out.println("Contacte al administrador");
				}
				
				//Opci�n para seguir
				System.out.println("Desea ingresar uno nuevo (1) si (0) no");
				opcion = sc.nextInt();
				sc.nextLine();
		
		} while(opcion == 1);//Mientras opci�n sea 1, continuar
		
		
		/**************************Acceder a un m�todo de otra clase****************************/
		//Crear instancia de la clase
		ClientManager cm = new ClientManager();//Para poder acceder al metodo de otra clase, se crea la instancia
		cm.recorrerArregloCliente(ListaCliente);//Recorrer e imprimir cliente
	
		
	}
}
