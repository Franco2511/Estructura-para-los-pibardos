package tp6;

public class testciclismo {
	public static void main(String[] args) {
		Listacliclistas lista = new Listacliclistas();
		for(int i=1; i<=120;i++) {
			lista.agregar(i);
		}
		lista.cargarTiemposAutomaticos();	
		lista.muestra();
		//Tiempos en 0 significa que no completaron la etapa
		System.out.println("Ganador Etapa 1: "+ lista.ganadorEtapa(1));
		System.out.println("Ganador de la Carrera: "+ lista.ganadorCarrera());
		System.out.println("Tiempo del ganador:"+ lista.tiempodelganador());
	
	
	
	
	}
}
