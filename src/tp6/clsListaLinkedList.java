package tp6;

public class clsListaLinkedList {
	private clsNode tope, lista;
	
	clsListaLinkedList(){
		limpiaLista();
	}
	
	boolean estaVacia(){
		return (lista==null);
	}
	

	void limpiaLista(){
		this.tope=this.lista=null;;
	}
	
	
	// inserta elemento a la derecha
	void insertaFin(Object objElemento){
		if (!estaVacia()){
			this.lista.setNextNode(new clsNode(objElemento));
			this.lista=this.lista.getNextNode();
		}else{
			this.tope = this.lista=new clsNode(objElemento);			
		}
	}	

	// elimina elemento ubicado m�s a la derecha
	void eliminaFin(){
		if (!estaVacia()){
			if (this.lista==this.tope){
				// un solo elemento
				limpiaLista();
			}else{
				clsNode temp;
				for (temp=this.tope;temp.getNextNode()!=lista;temp=temp.getNextNode());
				this.lista=temp;
				this.lista.setNextNode(null);			
			}
		}else{
			System.out.println("Error eliminaFin. Lista vacia");			
		}
	}		

	
	// inserta elemento a la izq
	void insertaTope(Object objElemento){
		if (!estaVacia()){
			this.tope = new clsNode(objElemento,this.tope);		
		}else{
			this.tope = this.lista=new clsNode(objElemento);			
		}
	}	

	
	// elimina elemento ubicado m�s a la izq
	void eliminaTope(){
		if (!estaVacia()){
			if (this.lista==this.tope){
				// un solo elemento
				limpiaLista();
			}else{
				this.tope=this.tope.getNextNode();			
			}
		}else{
			System.out.println("Error eliminaTope. Lista vacia");			
		}
	}	
	
	
	void muestra(){
		clsNode temp;		
		if (!estaVacia()){
			temp=this.tope;
			while (temp!=null){
				System.out.println("Elemento " + temp.getNodeInfo().toString());
				temp=temp.getNextNode();
			}			
		}else{
			System.out.println("Error muestra. Lista vacia");
		}		
	}
	public int longitud () {
		clsNode temp;
		int x = 0;
		if (!estaVacia()) {
			temp = this.tope;
			while (temp != null ) {
				x += 1;
				temp = temp.getNextNode();

			}
		}
		return x;
	}
	
	clsNode getTope(){return tope;}
	
	//Ejercicio Nº 3: Se desea determinar mediante un método denominado valorEnLista() si un valor determinado se encuentra en una lista
	public void valorEnLista(int X) {
		if(estaVacia()) {
			System.out.println("La lista no existe");
		}else {
			clsNode aux =tope;
			int band=0;
			while (aux!=null && band==0) {
				if (aux.getNodeInfo().equals(X)) {
					System.out.println("El valor "+ X+" Se encuentra en la lista");
					band=1;
				}
				aux=aux.getNextNode();
			}
		}
	}
	//Ejercicio Nº 4: Proponga un metodo que permita desplazar X posiciones a la derecha o izquierda en una lista. 
	public void rotar(int cant,String direccion) {
		if(estaVacia()) {
			return;
		}
		int tamanio=longitud();
		cant= cant%tamanio;
		if (cant==0) {
			return;
		}
		for(int i=0;i<cant;i++) {
			if(direccion.equals("d")) {
				clsNode aux= this.tope;
				clsNode ant=aux;
				while(aux.getNextNode()!=null) {
					ant=aux;
					aux=aux.getNextNode();
				}
				ant.setNextNode(null);
				aux.setNextNode(this.tope);
				this.tope=aux;
			}else {
				clsNode seg = this.tope.getNextNode();
				clsNode ultimo = this.tope;
				while (ultimo.getNextNode()!=null) {
					ultimo=ultimo.getNextNode();
				}
				ultimo.setNextNode(this.tope);
				this.tope.setNextNode(null);
				this.tope=seg;
			}
		}
	}
	//Ejercicio N°6:
    void mostrarDesastres() {
        clsNode temp;
        if (!estaVacia()) {
            System.out.println("+-----------------+------------------+----------------------+");
            System.out.println("| Fecha Desastre  | Número Víctimas  | Fecha Último Mayor   |");
            System.out.println("+-----------------+------------------+----------------------+");

            temp = this.tope;
            while (temp != null) {
                if (temp.getNodeInfo() instanceof desastre) {
                    desastre d = (desastre) temp.getNodeInfo();
                    System.out.printf("| %-15s | %-16d | %-20s |\n",
                            d.getFechaDesastre(),
                            d.getNumeroVictimas(),
                            d.getFechaUltimoMayor());
                }
                temp = temp.getNextNode();
            }
            System.out.println("+-----------------+------------------+----------------------+");
        } else {
            System.out.println("Error muestra. Lista vacia");
        }
    }
    public void completarFechas(){
        if (estaVacia() || tope.getNextNode() == null) {
            return;
        }

        clsNode actual = tope.getNextNode();

        while (actual != null) {
            if (actual.getNodeInfo() instanceof desastre) {
                desastre desastreActual = (desastre) actual.getNodeInfo();
                clsNode temp = tope;
                desastre ultimoMayor = null;

                while (temp != actual) {
                    if (temp.getNodeInfo() instanceof desastre) {
                        desastre desastreTemp = (desastre) temp.getNodeInfo();
                        if (desastreTemp.getNumeroVictimas() > desastreActual.getNumeroVictimas()) {
                            ultimoMayor = desastreTemp;
                        }
                    }
                    temp = temp.getNextNode();
                }

                if (ultimoMayor != null) {
                    desastreActual.setFechaUltimoMayor(ultimoMayor.getFechaDesastre());
                }
            }
            actual = actual.getNextNode();
        }
    }
   
	
	
}
