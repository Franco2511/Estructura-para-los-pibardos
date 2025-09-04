package tp6;

public class test {
	public static void main(String[] args) {
		clsListaLinkedList lista = new clsListaLinkedList();
		Integer objInt1=30;
		Integer objInt2=50;
		Integer objInt3=-4;
		
		lista.insertaFin(objInt1);
		lista.insertaFin(objInt2);
		lista.insertaFin(objInt3);
	
		lista.muestra();
		lista.valorEnLista(40);
		lista.rotar(1, "d");
		lista.muestra();
		
		System.out.println("HOLAAAAAAAAAAAAAAAAAA");
	}
	
}
