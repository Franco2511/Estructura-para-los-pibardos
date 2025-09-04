package tp6;

public class clsPila extends clsNode {

        private clsListaLinkedList lista = new clsListaLinkedList();


        public void insertar(Object elemento) {
            lista.insertaTope(elemento);
        }


        public void eliminarEl() {
            lista.eliminaTope();
        }


        public Object verTope() {
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
        public Object getNodeInfo() {
        if (!estaVacia()) {
            return lista.getTope().getNodeInfo();
        }
        return null;
        }
}


