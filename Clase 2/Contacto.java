 package org.retana.curso.bean;
 
 public class Contacto{
	private Integer idContacto;
	private String nombre;
	private String direccion;
	private String telefono;
	private Integer idUsuario;
	public void setIdContacto(Integer idContacto){
		this.idContacto=idContacto;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setDireccion(String direccion){
		this.direccion=direccion;
	}
	public void setTelefono(String telefono){
		this.telefono=telefono;
	}
	public void setIdUsuario(Integer idUsuario){
		this.idUsuario=idUsuario;
	}
	public Integer getIdContacto(){
		return this.idContacto;
	}
	public String getNombre(){
		return this.nombre;
	}
	public String getTelefono(){
		return this.telefono;
	}
	public Integer getIdUsuario(){
		return this.idUsuario;
	}
 }