package ejercitacion2_1.ejercicio01;

public class Persona {
    String nombre;
    int edad;

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Carlos";
        persona1.edad = 35;

        Persona persona2 = new Persona();
        persona2.nombre = "Ana";
        persona2.edad = 22;

        System.out.println("Persona 1: " + persona1.nombre + ", " + persona1.edad + " años.");
        System.out.println("Persona 2: " + persona2.nombre + ", " + persona2.edad + " años.");
    }
}
