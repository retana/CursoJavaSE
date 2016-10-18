package org.retana.curso.sistema;

import org.retana.curso.bean.Contacto;
import org.retana.curso.manejador.ManejadorContacto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Principal{
	public static void main(String args[]){
		//Lectura de datos en consola
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int opcion=1;
		try{
			while(opcion!=0){
				System.out.println("========== MENU =============");
				System.out.println("===== Agregar Contacto  => 1 =");
				System.out.println("===== Eliminar Contacto => 2 =");
				System.out.println("===== Buscar Contacto   => 3 =");
				System.out.println("===== Listar Contactos  => 4 =");
				System.out.println("===== Salir             => 0 =");
				System.out.print(">> ");
				opcion=Integer.parseInt(br.readLine());
				System.out.println("========== MENU =============");
				switch(opcion){
					case 1:
						System.out.println("======== AGREGAR ==========");
						break;
					case 2:
						System.out.println("======== ELIMINAR ==========");
						break;
					case 3:
						System.out.println("======== BUSCAR ==========");
						break;
					case 4:
						System.out.println("======== LISTAR ==========");
						break;
					case 0:
						System.out.println("======== SALIR ==========");
						opcion=0;
						break;
				}
			}
		}catch(IOException e){
			
		}
	}
	
}