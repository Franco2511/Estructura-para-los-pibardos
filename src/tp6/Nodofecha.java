package tp6;
import java.time.LocalDate;
public class Nodofecha {
	private LocalDate fechaDesastre;
	private int numeroVictimas;
	private LocalDate fechaAnteriorDesastre;
	private Nodofecha siguiente;

	public Nodofecha(LocalDate fechaDesastre, int numeroVictimas, LocalDate fechaAnteriorDesastre) {
        this.fechaDesastre = fechaDesastre;
        this.numeroVictimas = numeroVictimas;
        this.fechaAnteriorDesastre = fechaAnteriorDesastre;
        this.siguiente = null;
    }

    // Getters y Setters
    public LocalDate getFechaDesastre() {
        return fechaDesastre;
    }

    public void setFechaDesastre(LocalDate fechaDesastre) {
        this.fechaDesastre = fechaDesastre;
    }

    public int getNumeroVictimas() {
        return numeroVictimas;
    }

    public void setNumeroVictimas(int numeroVictimas) {
        this.numeroVictimas = numeroVictimas;
    }

    public LocalDate getFechaAnteriorDesastre() {
        return fechaAnteriorDesastre;
    }

    public void setFechaAnteriorDesastre(LocalDate fechaAnteriorDesastre) {
        this.fechaAnteriorDesastre = fechaAnteriorDesastre;
    }

    public Nodofecha getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodofecha siguiente) {
        this.siguiente = siguiente;
    }








}
