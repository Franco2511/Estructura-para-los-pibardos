package tp6;
import java.util.Random;
public class Listacliclistas {
	private Nodociclistas cabeza;
	
	public Listacliclistas() {
		cabeza = null;
	}
	
	public void agregar(int numero) {
		Nodociclistas aux = new Nodociclistas(numero);
		if (cabeza==null) {
			cabeza=aux;
		}else {
			Nodociclistas temp = cabeza;
			while (temp.siguiente !=null) {
				temp=temp.siguiente;
			}
			temp.siguiente =aux;
		}
	}
	
	public void cargarTiempo(int numero, int etapa, int tiempo) {
		Nodociclistas aux= cabeza;
		while(aux!=null) {
			if(aux.numero == numero) {
				aux.tiempo[etapa-1] = tiempo;
				return;
			}
			aux = aux.siguiente;
		}
	}
	//Ejercicio N°7:Implementar un metodo que obtenga, a partir de un número de etapa que se pasará como argumento, el dorsal del ganador de la etapa.
	public int ganadorEtapa(int etapa) {
		Nodociclistas aux =cabeza;
		int ganador = -1;
		int minTiempo = Integer.MAX_VALUE;
		while (aux!=null) {
			int tiempo = aux.tiempo[etapa - 1];
			if (tiempo>0 && tiempo<minTiempo) {
				minTiempo = tiempo;
				ganador = aux.numero;
			}
			aux = aux.siguiente;
		}
		return ganador;
	}
	//Ejercicio N°7:Implementar un metodo que devuelva el número del ganador de la prueba y el tiempo total obtenido.
	public int ganadorCarrera() {
		Nodociclistas aux =cabeza;
		int ganador = -1;
		int minTiempo = Integer.MAX_VALUE;
		while (aux!=null) {
			int suma=0;
			boolean completo=true;
			for(int t:aux.tiempo) {
				if(t == 0) {
					completo = false;
					break;
				}
				suma+=t;
			}
			if(completo && suma < minTiempo) {
				minTiempo = suma;
				ganador = aux.numero;
			}
			aux = aux.siguiente;
		}
		return ganador;
	}
	
	public int tiempodelganador() {
		int ganador= ganadorCarrera();
		Nodociclistas aux =cabeza;
		while (aux !=null) {
			if(aux.numero == ganador) {
				int total = 0;
				for(int t:aux.tiempo) {
					total+=t;
				}
				return total;
			}
			aux=aux.siguiente;
		}
		return -1;
	}
	boolean estaVacia() {
		return(cabeza==null);
	}
	void muestra(){
		Nodociclistas temp=cabeza;	
		while (temp!=null) {
			System.out.println("Ciclista"+temp.numero +"| Tiempos:"  );
			for(int t: temp.tiempo) {
				System.out.println(t+ " ");
			}
			temp=temp.siguiente;
		}
	}
	public void cargarTiemposAutomaticos() {
	    Random rand = new Random();
	    Nodociclistas aux = cabeza;
	    while (aux != null) {
	        for (int i = 0; i < aux.tiempo.length; i++) {
	            if (rand.nextDouble() < 0.8) {
	                aux.tiempo[i] = rand.nextInt(300) + 200; 
	            } else {
	                aux.tiempo[i] = 0;
	            }
	        }
	        aux = aux.siguiente;
	    }
	}
	
	
	
	
	
	
	
	
	
}
