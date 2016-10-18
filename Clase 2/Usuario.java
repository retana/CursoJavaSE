 package org.retana.curso.bean;
 
 public class Usuario{
	private Integer idUsuario;
	private String nombre;
	private String correo;
	private String contrasena;
	private Integer idRol;
	
	public void setIdUsuario(Integer idUsuario){
		this.idUsuario=idUsuario;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setCorreo(String correo){
		this.correo=correo;
	}
	public void setContrasena(String contrasena){
		this.contrasena=contrasena;
	}
	public void setIdRol(Integer idRol){
		this.idRol=idRol;
	}
	public String getNombre(){
		return nombre;
	}
	public Integer getUsuario(){
		return this.idUsuario;
	}
	public String getCorreo(){
		return this.correo;
	}
	public String getContrasena(){
		return this.contrasena;
	}
	public Integer getIdRol(){
		return this.idRol;
	}
	public Usuario(){
		
	}
}