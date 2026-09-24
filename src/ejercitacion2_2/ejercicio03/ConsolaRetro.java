package ejercitacion2_2.ejercicio03;

public class ConsolaRetro {
    public String modelo;
    public String numeroSerie;
    public boolean encendida;

    public ConsolaRetro(String modelo, String numeroSerie) {
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.encendida = false;
    }

    public void encender() {
        this.encendida = true;
        System.out.println(modelo + " está encendida.");
    }

    public void apagar() {
        this.encendida = false;
        System.out.println(modelo + " está apagada.");
    }

    public void mostrarEstado() {
        if (encendida) {
            System.out.println("Consola ENCENDIDA.");
        } else {
            System.out.println("Consola APAGADA.");
        }
    }

    public static void main(String[] args){

        ConsolaRetro consola1 = new ConsolaRetro("PSX", "123456");

        consola1.mostrarEstado();
        consola1.encender();
        consola1.mostrarEstado();
        consola1.apagar();
        consola1.mostrarEstado();
    }    
}
