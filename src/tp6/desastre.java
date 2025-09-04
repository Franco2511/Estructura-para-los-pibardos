package tp6;

public class desastre {

        private String fechaDesastre;
        private int numeroVictimas;
        private String fechaUltimoMayor;

        public desastre(String fechaDesastre, int numeroVictimas) {
            this.fechaDesastre = fechaDesastre;
            this.numeroVictimas = numeroVictimas;
            this.fechaUltimoMayor = "";
        }


        public String getFechaDesastre() {
            return fechaDesastre;
        }

        public int getNumeroVictimas() {
            return numeroVictimas;
        }

        public String getFechaUltimoMayor() {
            return fechaUltimoMayor;
        }


        public void setFechaUltimoMayor(String fechaUltimoMayor) {
            this.fechaUltimoMayor = fechaUltimoMayor;
        }

        @Override
        public String toString() {
            return String.format("| %-15s | %-16d | %-20s |",
                    fechaDesastre, numeroVictimas, fechaUltimoMayor);
        }
    }



