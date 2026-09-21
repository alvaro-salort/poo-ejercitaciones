package ejercitacion2_1.ejercicio09;

import java.util.ArrayList;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}

class CarritoDeCompras {
    private ArrayList<Producto> productos;

    public CarritoDeCompras() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : this.productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public void mostrarDetalle() {
        System.out.println("--- DETALLE DEL CARRITO ---");
        for (Producto producto : this.productos) {
            System.out.printf("- %-15s| $%.2f%n", producto.getNombre(), producto.getPrecio());
        }
        System.out.println("---------------------------");
        System.out.println("Total a pagar: $" + calcularTotal());
    }

    public static void main(String[] args) {
        CarritoDeCompras carrito = new CarritoDeCompras();

        Producto p1 = new Producto("Detergente", 1500);
        Producto p2 = new Producto("Cerveza", 11000);
        Producto p3 = new Producto("Papas fritas", 3000);
        Producto p4 = new Producto("Gaseosa", 5300);
        Producto p5 = new Producto("Pan", 1800);

        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);
        carrito.agregarProducto(p3);
        carrito.agregarProducto(p4);
        carrito.agregarProducto(p5);

        carrito.mostrarDetalle();
    }
}