package org.retana.agenda.bean;

public class Contacto {
	private Integer idContacto;
	private String nombre;
	private String telefono;
	private String direccion;
	private String idUsuario;
	public Integer getIdContacto() {
		return idContacto;
	}
	public void setIdContacto(Integer idContacto) {
		this.idContacto = idContacto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Contacto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contacto(Integer idContacto, String nombre, String telefono, String direccion, String idUsuario) {
		super();
		this.idContacto = idContacto;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.idUsuario = idUsuario;
	}
	
	
}
