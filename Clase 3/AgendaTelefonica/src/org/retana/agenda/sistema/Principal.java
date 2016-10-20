package org.retana.agenda.sistema;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.retana.agenda.bean.Contacto;
import org.retana.agenda.manejador.ManejadorContacto;


public class Principal {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Integer opcion=1;
		ManejadorContacto manejador=new ManejadorContacto();
		while(opcion!=0){
			System.out.println("================MENU==================");
			System.out.println("=====  1) Agregar Contacto       =====");
			System.out.println("=====  2) Eliminar Contacto      =====");
			System.out.println("=====  3) Buscar Contacto        =====");
			System.out.println("=====  4) Listar Contacto        =====");
			System.out.println("=====  0) Salir                  =====");
			System.out.println("================MENU==================");
			opcion=Integer.parseInt(br.readLine());
			switch(opcion){
				case 1:
					Contacto c=new Contacto();
					System.out.println("1) Agregar Contacto");
					System.out.println("-------------------");
					System.out.print("ID >> ");
					c.setIdContacto(Integer.parseInt(br.readLine()));
					System.out.print("Nombre >> ");
					c.setNombre(br.readLine());
					System.out.print("Direccion >> ");
					c.setDireccion(br.readLine());
					System.out.print("Telefono >> ");
					c.setTelefono(br.readLine());
					manejador.agregar(c);
					break;
				case 2:
					System.out.println("2) Eliminar Contacto");
					for(Contacto miContacto:manejador.listar()){
						System.out.println("-----------------------------------------");
						System.out.println("ID >> "+miContacto.getIdContacto());
						System.out.println(" Nombre >> "+miContacto.getNombre());
						System.out.println(" Direccion >> "+miContacto.getDireccion());
						System.out.println(" Telefono >> "+miContacto.getTelefono());
						System.out.println("------------------------------------------");
					}
					System.out.print("Ingrese id de contacto a eliminar: ");
					Integer idContacto=Integer.parseInt(br.readLine());
					if(manejador.buscar(idContacto)==null){
						System.out.println("El contacto ingresado no existe en la lista");
					}else{
						manejador.eliminar(manejador.buscar(idContacto));
						System.out.println("\t CONTACTO ELIMINADO DE LA BASE DE DATOS!!! ");
					}
					break;
				case 3:
					System.out.println("3) Buscar Contacto");
					System.out.print("Ingrese nombre de contacto >> ");
					String nombre=br.readLine();
					if(manejador.buscar(nombre)!=null){
						Contacto contactoEncontrado=manejador.buscar(nombre);
						System.out.println("-----------------------------------------");
						System.out.println("ID >> "+contactoEncontrado.getIdContacto());
						System.out.println(" Nombre >> "+contactoEncontrado.getNombre());
						System.out.println(" Direccion >> "+contactoEncontrado.getDireccion());
						System.out.println(" Telefono >> "+contactoEncontrado.getTelefono());
						System.out.println("------------------------------------------");
					}else{
						System.out.println("\t El contacto que buscas no esta en tu agenda!!!");
					}
					
					break;
				case 4:
					System.out.println("4) Listar Contacto");
					for(Contacto miContacto:manejador.listar()){
						System.out.println("-----------------------------------------");
						System.out.println("ID >> "+miContacto.getIdContacto());
						System.out.println(" Nombre >> "+miContacto.getNombre());
						System.out.println(" Direccion >> "+miContacto.getDireccion());
						System.out.println(" Telefono >> "+miContacto.getTelefono());
						System.out.println("------------------------------------------");
					}
					break;
				case 0:
					System.out.println("0) SALIR DEL SISTEMA");
					break;
			}
		}
	}

}
