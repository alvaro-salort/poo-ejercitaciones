package ejercitacion2_2.ejercicio02;

public class Videojuego {
    public String titulo;
    public String plataforma;
    public double precio;

    public Videojuego(String titulo, String plataforma, double precio) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.precio = precio;
    }

    public static void main(String[] args){

        Videojuego juego1 = new Videojuego("Vampire survivors", "PC", 5000.0);
        Videojuego juego2 = new Videojuego("Marvel's Wolverine", "PS5", 12000.0);
        Videojuego juego3 = new Videojuego("Pokemon Pokopia", "Switch", 30000.0);

        String plantilla = "Videojuego: %-20s | Plataforma: %-10s | Precio: $%.2f";

        System.out.println(String.format(plantilla, juego1.titulo, juego1.plataforma, juego1.precio));
        System.out.println(String.format(plantilla, juego2.titulo, juego2.plataforma, juego2.precio));
        System.out.println(String.format(plantilla, juego3.titulo, juego3.plataforma, juego3.precio));
    }
}