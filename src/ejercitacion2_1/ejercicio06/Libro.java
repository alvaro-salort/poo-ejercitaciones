package ejercitacion2_1.ejercicio06;

public class Libro {

    String titulo;
    String autor;
    int paginasTotales;
    int paginaActual;

    public Libro(String titulo, String autor, int paginasTotales) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginasTotales = paginasTotales;
        this.paginaActual = 0;
    }

    public void leer(int paginas){
        this.paginaActual += paginas;
        if (this.paginaActual >= this.paginasTotales){
            this.paginaActual = this.paginasTotales;
            System.out.println("Ya terminaste este libro! :)");
        }
    }

    public double mostrarProgreso(){
        double progreso = paginaActual / (double) paginasTotales * 100;
        System.out.printf("Libro: %-25s | Autor: %-20s | progreso: %.2f%% %n", titulo, autor, progreso);
        return progreso;
    }

    public static void main(String[] args){ 

        Libro libro1 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1000);
        libro1.paginaActual = 570;
        libro1.mostrarProgreso();
        libro1.leer(3);

        System.out.println("Leyendo 500 paginas...");
        libro1.leer(500);
        libro1.mostrarProgreso();

        System.out.println("\n");

        Libro libro2 = new Libro("1984", "George Orwell", 328);
        libro2.paginaActual = 100;
        libro2.mostrarProgreso();
        System.out.println("Leyendo 12 páginas");
        libro2.leer(12);
        libro2.mostrarProgreso();
    }

}
