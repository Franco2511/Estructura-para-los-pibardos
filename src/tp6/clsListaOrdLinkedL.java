package tp6;
public abstract class clsListaOrdLinkedL{
	protected Nodo lista;
	protected int contador;
	
	public clsListaOrdLinkedL(){
		limpiarLista();
		this.contador=0;
	}
	
	public boolean estaVacia(){
		return (this.lista==null);
	}
	

	public void limpiarLista(){
		this.lista=null;;
	}
	
	
	public abstract boolean esMenor(Object objA, Object objB);
	public abstract boolean esMayor(Object objA, Object objB);
	public abstract boolean iguales(Object objA, Object objB);
	
	public Object devuelveElemento(int posicion){
		int counter=-1;
		Nodo temp;
		temp=this.lista;
		boolean flag=true;
		Object elemento = null;
		
		
		if (posicion>=0 && posicion<this.contador){			
			while (counter<posicion){
				temp = temp.getNextNode();			
			}
			elemento = temp.getNodeInfo();

		}else{
			System.out.println("error");
		}		
		
		return elemento;
	}
	
	public void mezclarListas(clsListaOrdLinkedL lista1 , clsListaOrdLinkedL lista2 ){
		
	}
	
	
	public void inserta(Object objElemento){
		Nodo node;
		node = new Nodo(objElemento);
		
		this.contador++;
		
		if (estaVacia()){
			this.lista=node;
		} else{
			if (esMenor(objElemento, this.lista.getNodeInfo())){
				node.setNextNode(this.lista);
				this.lista=node;
			}else{
				Nodo temp = this.lista;
				boolean flag=false;
				while (temp.getNextNode()!=null && !flag){
					if (esMayor(objElemento,temp.getNextNode().getNodeInfo())){
						temp=temp.getNextNode();
					}else{
						flag=true;
					}
				}
				node.setNextNode(temp.getNextNode());
				temp.setNextNode(node);				
			}
		}
	}	
	
	
	public boolean esta(Object objElemento){
		boolean response=false;
		if (estaVacia()){
			System.out.println("Error esta. lista vacia");			
		}else{
			Nodo temp=this.lista;
			while (temp!=null && !response){
				if (iguales(objElemento, temp.getNodeInfo())){
					response=true;
				}else{
					temp=temp.getNextNode();
				}
			}
		}		
		return response;
	}	
	

	public void elimina(Object objElemento){
		Nodo temp, ant;
		boolean flag=false;
		
		if (estaVacia()){
			System.out.println("Error elimina. lista vacia");
		}else{
						
			if (!esta(objElemento)){
				System.out.println("Error elimina. no esta elemento");
			}else{
				
				this.contador--;
				if (iguales(objElemento,this.lista.getNodeInfo())){
					this.lista=this.lista.getNextNode();
				}else{				
					ant=this.lista;
					temp=this.lista.getNextNode();

					while (temp!=null && !flag){
						if (iguales(objElemento, temp.getNodeInfo())){
							flag=true;
						}else{
							ant=temp;
							temp=temp.getNextNode();
						}
					}									
					
					if (flag){
						ant.setNextNode(temp.getNextNode());							
						
					}					
				}		
				
			}
		}	
		
	}
	
	
}
