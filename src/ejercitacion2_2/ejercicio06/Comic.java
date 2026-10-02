package ejercitacion2_2.ejercicio06;

public class Comic {
    private String titulo;
    private double precio;
    private int stock;

    public Comic(String titulo, double precio, int stock) {
        this.titulo = titulo;
        this.precio = Math.max(0.0, precio);
        this.stock = Math.max(0, stock);
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("Error: El precio no puede ser negativo.");
        }
    }

    public int getStock() {
        return stock;
    }

    public void reponerStock(int cantidad) {
        if (cantidad > 0) {
            this.stock += cantidad;
            System.out.printf("Stock repuesto. Stock actual de '%s': %d unidades.%n", titulo, stock);
        } else {
            System.out.println("La cantidad a reponer debe ser mayor a cero.");
        }
    }

    public void venderUnidad() {
        if (this.stock > 0) {
            this.stock--;
            System.out.printf("Venta realizada. Stock restante de '%s': %d unidades.%n", titulo, stock);
        } else {
            System.out.printf("No se puede vender '%s': Stock agotado (%d unidades).%n", titulo, stock);
        }
    }

    public static void main(String[] args) {
        Comic comic = new Comic("Batman: Year One", 4500.0, 2);

        System.out.printf("Comic: %s | Precio: $%.2f | Stock inicial: %d%n%n", comic.getTitulo(), comic.getPrecio(), comic.getStock());

        comic.venderUnidad(); // Stock = 1
        comic.venderUnidad(); // Stock = 0
        comic.venderUnidad(); // Intento cuando stock es 0

        System.out.println("\nReponiendo 3 unidades...");
        comic.reponerStock(3);
        comic.venderUnidad(); // Venta exitosa tras reposición
    }
}
