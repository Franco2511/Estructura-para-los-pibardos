package tp6;

public class test2 {
	public static void main(String[] args) {
		clsListaOrdenada1 lista= new clsListaOrdenada1();
		clsListaOrdenada1 lista2= new clsListaOrdenada1();
		Double obj1,obj2,obj3,obj4;
		Double obj5,obj6,obj7,obj8;
		
		obj1=new Double(30.0);
		obj2=new Double(50.2);
		obj3=new Double(-4.1);
		obj4=new Double(12.6);
		
		lista.inserta(obj1);
		lista.inserta(obj2);
		lista.inserta(obj3);
		lista.inserta(obj4);
		
	
		lista.muestra();		
		System.out.println("****");
		Object mayor=lista.mayor();
		System.out.println(mayor);
		Object menor=lista.menor();
		System.out.println(menor);
		System.out.println("****");

		obj5=new Double(70.0);
		obj6=new Double(20.2);
		obj7=new Double(-7.1);
		obj8=new Double(8.6);
		
		lista2.inserta(obj5);
		lista2.inserta(obj6);
		lista2.inserta(obj7);
		lista2.inserta(obj8);
		
		lista2.muestra();
		System.out.println("****");
		Object mayor2=lista2.mayor();
		System.out.println(mayor2);
		Object menor2=lista2.menor();
		System.out.println(menor2);
		System.out.println("****");

		clsListaOrdenada1 listaMezcla = lista.mezclar(lista2);
		listaMezcla.muestra();
	}
}
