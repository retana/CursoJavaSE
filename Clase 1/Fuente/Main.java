public class Main{
	public static void main(String args[]){
		Perro perro =new Perro();
		Perro perro2=new Perro("Chihuahua",1200.20);
		System.out.println(perro.raza);
		
		System.out.println(perro2.raza);
		System.out.println(""+perro2.getPrecio());
		
		perro2.horaDeDormir();
		System.out.println(perro.saludo(" SUSAN KE ASE"));
	}
}