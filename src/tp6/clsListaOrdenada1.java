package tp6;
public class clsListaOrdenada1 extends clsListaOrdLinkedL {
	
	
	public boolean esMenor(Object objA, Object objB){
		boolean response=false;
		
		if (((Double)objA).doubleValue()<((Double)objB).doubleValue()){
			response=true;
		}
		return response;
	}

	public boolean esMayor(Object objA, Object objB){
		boolean response=false;

		if (((Double)objA).doubleValue()>((Double)objB).doubleValue()){
			response=true;
		}	
		return response;
	}
	
	
	public boolean iguales(Object objA, Object objB){
		boolean response=false;
	
		if (((Double)objA).doubleValue()==((Double)objB).doubleValue()){
			response=true;
		}
		return response;
	}
	
	
	public void muestra(){
		Nodo temp;		
		if (!estaVacia()){
			temp=this.lista;
			while (temp!=null){
				System.out.println("Elemento " + temp.getNodeInfo().toString());
				temp=temp.getNextNode();
			}			
		}else{
			System.out.println("Error muestra. Lista vacia");
		}		
	}
	//Ejercicio N°5 Inciso a:Agregar las operaciones menor () y mayor () (en subclase) que devuelven el menor y el mayor elemento de la lista, respectivamente.
	public Object menor() {
		if(estaVacia()) {
			return null;
		}else {
			return this.lista.getNodeInfo();
		}
		
	}
	public Object mayor() {
		if(estaVacia()) {
			return null;
		}else {
			Nodo aux=this.lista;
			while(aux.getNextNode()!=null) {
				aux=aux.getNextNode();
			}
			
			return aux.getNodeInfo();
		}
	}
	//Ejercicio N°5 Inciso b:Escribir una operación llamada mezclarListas() (en subclase) con las siguientes especificaciones (las listas están ordenadas de menor a mayor).	
	public clsListaOrdenada1 mezclar(clsListaOrdenada1 Lista2) {
		if(estaVacia()) {
			if(Lista2.estaVacia()) {
				return null;
			}else {
				return Lista2;
			}
		}
		clsListaOrdenada1 LF = new clsListaOrdenada1();
		Nodo l1=lista;
		Nodo l2=Lista2.lista;
		while(l1!=null && l2!=null) {
			if((double)l1.getNodeInfo()<(double)l2.getNodeInfo()) {
				LF.inserta(l1.getNodeInfo());
				l1=l1.getNextNode();
			}else {
				LF.inserta(l2.getNodeInfo());
				l2=l2.getNextNode();
			}
		}
		if(l1==null) {
			while (l2!=null) {
				LF.inserta(l2.getNodeInfo());
				l2=l2.getNextNode();
			}
		}else {
			while(l1!=null) {
				LF.inserta(l1.getNodeInfo());
				l1=l1.getNextNode();
			}
		}
		
		return LF;
	}
	
	
	
	
	
	
	
	
	
	
	
}
