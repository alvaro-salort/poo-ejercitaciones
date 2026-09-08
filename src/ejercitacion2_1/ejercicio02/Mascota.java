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

    public void mostrarInfo() {
        System.out.printf("Nombre: %-12s | Especie: %-10s | Edad: %2d años%n", nombre, especie, edad);
    }

    public static void main(String[] args) {
        Mascota mascota1 = new Mascota("Naga", "Perro", 9);
        Mascota mascota2 = new Mascota("Panza", "Perro", 12);
        Mascota mascota3 = new Mascota("Lago", "Gato", 1);
        Mascota mascota4 = new Mascota("Yiyi", "Gato", 10);
        Mascota mascota5 = new Mascota("Andromeda", "Ajolote", 4);

        mascota1.mostrarInfo();
        mascota2.mostrarInfo();
        mascota3.mostrarInfo();
        mascota4.mostrarInfo();
        mascota5.mostrarInfo();
    }
}
