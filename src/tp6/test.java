package tp6;

public class test {
	public static void main(String[] args) {
        clsListaLinkedList lista = new clsListaLinkedList();

        // Insertar desastres como objetos Desastre
        lista.insertaFin(new desastre("13/12/2014", 5));
        lista.insertaFin(new desastre("10/01/2015", 2));
        lista.insertaFin(new desastre("12/02/2015", 4));
        lista.insertaFin(new desastre("07/03/2015", 0));

        System.out.println("ANTES de completar:");
        lista.mostrarDesastres();

        // Ejecutar el método
        lista.completarFechas();

        System.out.println("\nDESPUÉS de completar:");
        lista.mostrarDesastres();
        System.out.print("franquito se la come");
	}
}
