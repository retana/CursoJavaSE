package org.retana.curso.manejador;

import org.retana.curso.bean.Contacto;

import java.util.List;
import java.util.ArrayList;

public class ManejadorContacto {
	private List<Contacto> listaContacto;
	
	public ManejadorContacto(){
		listaContacto=new ArrayList();
	}
	public void add(Contacto contacto){
		listaContacto.add(contacto);
	}
	public void eliminar(Contacto contacto){
		listaContacto.remove(contacto);
	}
	public Contacto buscar(Integer idContacto){
		Contacto encontrado=null;
		//forEach (OBJECTO:LISTA)=> CADA OBJETO DE LA LISTA Y EL VALOR LO VA TOMAR OBJETO
		//Operadores logicos ==(igual),!=(distinto que), <,>,>=,<=,! (not), | (or),& (and)
		//concatenar + = "a"+"b"=ab
		for(Contacto c:listaContacto){
			if(c.getIdContacto()==idContacto){
				encontrado=c;
			}
		}
		return encontrado;
	}
	public List<Contacto> listar(){
		return  listaContacto;
	}
}