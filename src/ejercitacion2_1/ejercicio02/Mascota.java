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
        Mascota[] mascotas = {
                new Mascota("Naga", "Perro", 9),
                new Mascota("Panza", "Perro", 12),
                new Mascota("Lago", "Gato", 1),
                new Mascota("Yiyi", "Gato", 10),
                new Mascota("Andromeda", "Ajolote", 4)
        };

        for (Mascota mascota : mascotas) {
            mascota.mostrarInfo();
        }
    }
}
