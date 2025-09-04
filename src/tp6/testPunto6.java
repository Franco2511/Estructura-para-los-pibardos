package tp6;

public class testPunto6 {

    public static void main(String[] args){
            clsListaLinkedList lista = new clsListaLinkedList();


            lista.insertaFin(new desastre("13/12/2014", 5));
            lista.insertaFin(new desastre("10/01/2015", 2));
            lista.insertaFin(new desastre("12/02/2015", 4));
            lista.insertaFin(new desastre("07/03/2015", 0));
            System.out.print("antes");
            lista.mostrarDesastres();

            lista.completarFechas();

            System.out.print("antes");

            lista.mostrarDesastres();

    }
}
