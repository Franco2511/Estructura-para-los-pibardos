package tp6;

public class testPunto8 {
    public static void main(String[] args) {
        clsListaLinkedList listaPaquetes = new clsListaLinkedList();
        Conjunto mochila = new Conjunto();
        mochila.setMaxKg(50);


        listaPaquetes.insertaFin(10);
        listaPaquetes.insertaFin(15);
        listaPaquetes.insertaFin(22);
        listaPaquetes.insertaFin(7);
        listaPaquetes.insertaFin(18);

        System.out.println("Capacidad de la mochila (V) = " + mochila.getV()+ " kg\n");
        System.out.println("Intentos de carga:");
        for (int i = 0;i< listaPaquetes.longitud(); i++){
            int peso = (int) listaPaquetes.obtenerPrimero();
            boolean agregado = mochila.aniadir(peso);
            if (agregado){
                System.out.println("  ✓ Agregado " + peso + " (suma = " + mochila.getSuma() + ")");
            }else {
                System.out.println("  ✗ NO entra " + peso + " (suma = " + mochila.getSuma() + ", V = " + mochila.getV() + ")");
            }
        }
        System.out.println("\nContenido final de la mochila:");
        mochila.mostrar();
        System.out.println("Total cargado = " + mochila.getSuma() + " kg");

}
}
