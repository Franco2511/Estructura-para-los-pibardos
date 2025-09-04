package tp6;

public class registroDesastres {
	 private String fecha;
	    private int victimas;
	    private String fechaUltimoMayor;

	    public registroDesastres(String fechaUltimoMayor, String fecha, int victimas) {
	        this.fechaUltimoMayor = null;
	        this.fecha = fecha;
	        this.victimas = victimas;
	    }


	    public int getVictimas() {
	        return victimas;
	    }

	    public void setVictimas(int victimas) {
	        this.victimas = victimas;
	    }

	    public String getFecha() {
	        return fecha;
	    }

	    public void setFecha(String fecha) {
	        this.fecha = fecha;
	    }

	    public String getFechaUltimoMayor() {
	        return fechaUltimoMayor;
	    }

	    public void setFechaUltimoMayor(String fechaUltimoMayor) {
	        this.fechaUltimoMayor = fechaUltimoMayor;
	    }



	    @Override
	    public String toString() {
	        return fecha + " | victimas=" + victimas + " | ultimoMayor=" + (fechaUltimoMayor==null ? "null" : fechaUltimoMayor);
	    }
}
