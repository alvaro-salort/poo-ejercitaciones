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
