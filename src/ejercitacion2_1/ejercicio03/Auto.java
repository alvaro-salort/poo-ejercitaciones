package ejercitacion2_1.ejercicio03;

public class Auto {
    String marca;
    String modelo;
    boolean encendido;

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.encendido = false;
    }

    public void encender() {
        this.encendido = true;
        System.out.println("El auto " + marca + " " + modelo + " está encendido.");
    }

    public void apagar() {
        this.encendido = false;
        System.out.println("El auto " + marca + " " + modelo + " está apagado.");
    }

    public void mostrarEstado() {
        if (encendido) {
            System.out.println("Auto ENCENDIDO.");
        } else {
            System.out.println("Auto APAGADO.");
        }
    }

    public static void main(String[] args) {
        Auto auto1 = new Auto("Honda", "Civic");
        auto1.mostrarEstado();
        auto1.encender();
        auto1.mostrarEstado();
        auto1.apagar();
        auto1.mostrarEstado();
    }
}
