package ejercitacion2_2.ejercicio05;

public class SocioGeek {
    private int numeroSocio;
    private String nombre;
    private int puntosFidelidad;

    public SocioGeek(int numeroSocio, String nombre, int puntosFidelidad) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        setPuntosFidelidad(puntosFidelidad);
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosFidelidad() {
        return puntosFidelidad;
    }

    public void setPuntosFidelidad(int puntosFidelidad) {
        if (puntosFidelidad >= 0) {
            this.puntosFidelidad = puntosFidelidad;
        } else {
            System.out.println("Error: La cantidad de puntos de fidelidad no puede ser negativa.");
        }
    }

    public static void main(String[] args) {
        SocioGeek socio = new SocioGeek(101, "Lucas", 150);

        System.out.println("Socio: " + socio.getNombre() + " | Puntos: " + socio.getPuntosFidelidad());

        System.out.println("\nIntentando asignar puntaje válido (250)...");
        socio.setPuntosFidelidad(250);
        System.out.println("Puntos actualizados: " + socio.getPuntosFidelidad());

        System.out.println("\nIntentando asignar puntaje negativo (-50)...");
        socio.setPuntosFidelidad(-50);
        System.out.println("Puntos actuales tras intento fallido: " + socio.getPuntosFidelidad());
    }
}
