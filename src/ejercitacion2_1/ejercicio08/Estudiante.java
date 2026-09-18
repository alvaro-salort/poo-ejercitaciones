package ejercitacion2_1.ejercicio08;

import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private ArrayList<Double> calificaciones;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.calificaciones = new ArrayList<>();
    }

    public void agregarNota(double nota){
        if(nota >= 0 && nota <= 10){
            calificaciones.add(nota);
        } else {
            System.out.println("Nota inválida. Debe estar entre 0 y 10.");
        }
    }
    public double calcularPromedio(){
        double suma = 0;
        if(calificaciones.isEmpty()){
            System.out.println("Aún no se agregaron notas.");
            return 0;
        } else {
        for (double nota : calificaciones) {
            suma += nota;
            }
        }
        return suma / calificaciones.size();
    }

    public boolean haAprobado() {
        if(calcularPromedio() >= 6){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        Estudiante estudiante1 = new Estudiante("Jimin");
        estudiante1.calcularPromedio(); //promedio sin notas

        estudiante1.agregarNota(-2); //nota invalida
        System.out.println("\n");

        estudiante1.agregarNota(8.5);
        estudiante1.agregarNota(7);
        estudiante1.agregarNota(9);
        System.out.printf("Promedio del alumno %s: %.2f\n", estudiante1.nombre, estudiante1.calcularPromedio());
        System.out.println("Condición: " + estudiante1.haAprobado() + "\n"); //estudiante valido y aprobado

        Estudiante estudiante2 = new Estudiante("Chavo");
        estudiante2.agregarNota(5);
        estudiante2.agregarNota(7);
        estudiante2.agregarNota(3);
        System.out.printf("Promedio del alumno %s: %.2f\n", estudiante2.nombre, estudiante2.calcularPromedio());
        System.out.println("Condición: " + estudiante2.haAprobado() + "\n"); //estudiante valido y desaprobado

    }
}
