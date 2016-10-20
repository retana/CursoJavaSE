package org.retana.agenda.manejador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.retana.agenda.bean.Contacto;

//Import ctrl+shift+o 
public class ManejadorContacto {
	private List<Contacto> lista;

	public ManejadorContacto() {
		lista=new ArrayList();
	}
	public void agregar(Contacto contacto){
		lista.add(contacto);
	}
	public void eliminar(Contacto contacto){
		lista.remove(contacto);
	}
	public Contacto buscar(Integer idContacto){
		Contacto encontrado=null;
		//forEach (OBJECTO:LISTA)=> CADA OBJETO DE LA LISTA Y EL VALOR LO VA TOMAR OBJETO
		//Operadores logicos ==(igual),!=(distinto que), <,>,>=,<=,! (not), | (or),& (and)
		//concatenar + = "a"+"b"=ab
		for(Contacto c:lista){
			if (c.getIdContacto()==idContacto) {
				encontrado=c;
			}
		}
		return encontrado;
	}
	public Contacto buscar(String nombreContacto){
		Contacto encontrado=null;
		//forEach (OBJECTO:LISTA)=> CADA OBJETO DE LA LISTA Y EL VALOR LO VA TOMAR OBJETO
		//Operadores logicos ==(igual),!=(distinto que), <,>,>=,<=,! (not), | (or),& (and)
		//concatenar + = "a"+"b"=ab
		for(Contacto c:lista){
			if (c.getNombre().equals(nombreContacto)==true) {
				encontrado=c;
			}
		}
		return encontrado;
	}
	public List<Contacto> listar(){
		return lista;
	}
}
