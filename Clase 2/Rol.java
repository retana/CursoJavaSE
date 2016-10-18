package org.retana.curso.bean;

public class Rol{
	private Integer idRol;
	private String nombre;
	private String descripcion;
	//Declaración de Getters **Funciones**
	public Integer getIdRol(){
		return this.idRol;
	}
	public String getNombre(){
		return this.getNombre();
	}
	public String getDescripcion(){
		return this.descripcion;
	}
	//Declaración de setters **Metodos**
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setIdRol(Integer idRol){
		this.idRol=idRol;
	}
	public void setDescripcion(String descripcion){
		this.descripcion=descripcion;
	}
	public Rol(){
		
	}
}