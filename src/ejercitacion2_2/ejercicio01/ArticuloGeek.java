package ejercitacion2_2.ejercicio01;

public class ArticuloGeek {
    public String nombre;
    public double precioBase;



    public static void main(String[] args) {
        ArticuloGeek articulo1 = new ArticuloGeek();
        ArticuloGeek articulo2 = new ArticuloGeek();

        articulo1.nombre = "Dados de rol";
        articulo1.precioBase = 6000;
        System.out.printf("Artículo: %-20s | Precio Base: $%.2f%n", articulo1.nombre, articulo1.precioBase);

        articulo2.nombre = "Figura Eva-01";
        articulo2.precioBase = 17000;
        System.out.printf("Artículo: %-20s | Precio Base: $%.2f%n", articulo2.nombre, articulo2.precioBase);
        
    }
    
}

/*  Objetivo de aprendizaje: Definir una clase en Java, declarar atributos y comprender el proceso de instanciación en la memoria Heap utilizando el operador new.

Consigna:

Defina una clase llamada ArticuloGeek con dos atributos de instancia: nombre (de tipo String) y precioBase (de tipo double).

En el método principal (public static void main), instancie dos objetos distintos de la clase ArticuloGeek.

Asigne valores a los atributos de cada objeto de manera directa mediante el operador de acceso punto (.).

Imprima por consola los datos de ambas instancias. */