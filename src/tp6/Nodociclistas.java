package tp6;
//Ejercicio numero 7:
public class Nodociclistas {
	int numero;
	int[] tiempo;
	Nodociclistas siguiente;
	
	public Nodociclistas(int numero) {
		this.numero=numero;
		this.tiempo=new int[5];
		this.siguiente=null;
	}
}
