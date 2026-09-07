package ejercitacion2_1.ejercicio02;

public class Mascota {
    String nombre;
    String especie;
    int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public static void main(String[] args) {
        Mascota mascota1 = new Mascota("Tommy", "Perro", 5);
        Mascota mascota2 = new Mascota("Cloe", "Perro", 6);
        Mascota mascota3 = new Mascota("Lago", "Gato", 1);
        Mascota mascota4 = new Mascota("Panza", "Perro", 10);
        Mascota mascota5 = new Mascota("Naga", "Perro", 9);

        System.out.println(String.format("Nombre: %-10s  Especie: %-10s  Edad: %3d ", mascota1.nombre, mascota1.especie, mascota1.edad));
        System.out.println(String.format("Nombre: %-10s  Especie: %-10s  Edad: %3d ", mascota2.nombre, mascota2.especie, mascota2.edad));
        System.out.println(String.format("Nombre: %-10s  Especie: %-10s  Edad: %3d ", mascota3.nombre, mascota3.especie, mascota3.edad));
    }
}
