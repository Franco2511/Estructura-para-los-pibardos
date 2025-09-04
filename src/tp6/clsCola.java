package tp6;

public class clsCola {

        private clsListaLinkedList lista = new clsListaLinkedList();


        public void encolar(Object elemento) {
            lista.insertaFin(elemento);
        }

        public void desencolar() {
            lista.eliminaTope();
        }


        public Object inicio() {
            if (!lista.estaVacia()) {
                return lista.getTope().getNodeInfo();
            }
            return null;
        }


        public void mostrar() {
            lista.muestra();
        }

        public boolean estaVacia() {
            return lista.estaVacia();
        }
}
