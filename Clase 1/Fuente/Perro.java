 public class Perro{//Letra inicial mayuscula, si compone de 2 palabras MiPerro
	//Alcance (Scope) - Tipo de dato - Nombre de Variable () -- Valor por defecto es NULL,Double,Integer | int = 0, double
	public String raza="abc";
	private Double costo=0.0; //float, double Double
	private char inicialDeNombre='A';
	private int peso=100;
	//Metodo constructor
	/*
		Sin parametros
	*/
	public Perro(){
		System.out.println("Se ejecuta metodo constructor sin parametros");
	}
	/*
		Metodo constructor con parametros - new 
	*/
	public Perro(String _raza,Double _costo){
		this.raza=_raza;
		this.costo=_costo;
		System.out.println("Se ejecuta metodo constructor con parametros");
	}
	//Método comun
	public void horaDeDormir(){
		System.out.println("Yo duermo de 8:30 a 9:30");
	}
	//Función 
	public String saludo(String mensaje){
		return "Hola "+mensaje;
	} 
	public static void main(String args[]){
		Perro miPerro; //Declarar variable
		miPerro=new Perro();//Instanciar una variable y asignar un valor por defecto
		System.out.println(miPerro.costo);
	}
	public Double getPrecio(){
		return costo;
	}
 }