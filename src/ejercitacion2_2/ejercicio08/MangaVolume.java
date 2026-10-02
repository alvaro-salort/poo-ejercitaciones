package ejercitacion2_2.ejercicio08;

public class MangaVolume {
    private String tituloSerie;
    private int numeroTomo;
    private int cantidadPaginas;

    public MangaVolume(String tituloSerie, int numeroTomo, int cantidadPaginas) {
        this.tituloSerie = tituloSerie;
        this.numeroTomo = numeroTomo;
        this.cantidadPaginas = cantidadPaginas;
    }

    private boolean esTomoExtenso() {
        return this.cantidadPaginas > 300;
    }

    public boolean esEdicionEspecial() {
        return esTomoExtenso();
    }

    @Override
    public String toString() {
        String tipoEdicion = esEdicionEspecial() ? "Edición Especial (Extenso)" : "Edición Estándar";
        return String.format("Manga: %s Vol. %d | Páginas: %d | Categoría: %s",
                tituloSerie, numeroTomo, cantidadPaginas, tipoEdicion);
    }

    public static void main(String[] args) {
        MangaVolume manga1 = new MangaVolume("Berserk", 1, 220);
        MangaVolume manga2 = new MangaVolume("JoJo's Bizarre Adventure", 1, 420);

        System.out.println(manga1);
        System.out.println(manga2);
    }
}
