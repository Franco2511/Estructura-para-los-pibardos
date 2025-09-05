package tp6;
//MOCHILA PUNTO 8
	public class Conjunto {
		private final int MaxTam=100;
		private int tam;
		private int [] elementos;
        private int V;
        private  int suma;
		public Conjunto()
		{
			elementos= new int[MaxTam];
			tam=0;
            suma=0;
            V = 0;
		}

        public void setMaxKg (int v) {
            V = v;
        }

    public int getV() {
        return V;
    }

    public int getSuma() {
        return suma;
    }

    public Conjunto(int[] vec)
		{
			elementos= new int[MaxTam];
			for(int i = 0; i<vec.length; i++)
			{
				this.aniadir(vec[i]);
			}
		}
		public boolean esVacio()
		{
		if (tam==0)
		{
			return true;
		}	
		else
		{
			return false;
		}
		}
		public boolean pertenece(int a)
		{
			 int i; i=0;
			 boolean pert; pert=false;
			 while ((i<tam) && (!pert)){
				 if (a == elementos[i]) pert=true;
				 i++;
				 }
			 return pert;
		 }
		public boolean aniadir (int a)
		{
			if ((tam<MaxTam) && (!pertenece(a)) && suma < V)
			{
				elementos[tam]=a;
				tam = tam + 1 ;
                suma += a;
                return true;
			}else {
              System.out.println("La mochila no aguanta mas peso");
              return false;
            }
		}
		public int traerElemento(int i)
		{
			if ((i>=0) && (i<tam))
			{
				return (elementos[i]);
			}
			else 
			{
				return -1;
			}
		}
		public int tamanio()
		{
			return tam;
		}
		public void mostrar()
		{
			String cad;
			cad="";
			for (int i=0; i<tam;i++)
			{
				cad = cad + elementos[i]+ " - ";
			}
			System.out.println(cad);
		}
		public void retirar(int x)
		{
			int i;
			i=0;
			while ((x != elementos[i]) && (i<tam))
			{
				i++;
				
			}
			if (i<tam)
			{
				for (int j=i;j<tam;j++)
				{
					elementos[j]=elementos[j+1];
				}
				tam--;
			}
		}
		public Conjunto union(Conjunto D)
		{
			//boolean result;
			Conjunto AUX = new Conjunto();
			for (int i=0; i<tam;i++)
			{
				AUX.aniadir(elementos[i]);
			}
			for (int i=0; i<D.tamanio();i++)
			{
				AUX.aniadir(D.traerElemento(i));
			}
			return AUX;	
		}
		public Conjunto interseccion(Conjunto D)
		{
			Conjunto AUX = new Conjunto ();
			for (int i=0; i<tam; i++)
			{
				if(D.pertenece(elementos[i]))
				{
					AUX.aniadir(elementos[i]);
				}
			}
			return AUX;
		}
		public boolean incluye(Conjunto D)
		{
			boolean result;
			result = true;
			for(int i=0; i<D.tamanio();i++)
			{
				if (!pertenece(D.traerElemento(i)))
				{
					result=false;
				}
			}
			return result;
		}

	}



