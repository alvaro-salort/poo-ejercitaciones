package ejercitacion2_2.ejercicio10;

import ejercitacion2_2.ejercicio01.ArticuloGeek;

public class ColeccionLote {
    private String descripcion;
    private ArticuloGeek articuloPrincipal;
    private ArticuloGeek articuloSecundario;

    public ColeccionLote(String descripcion, ArticuloGeek articuloPrincipal, ArticuloGeek articuloSecundario) {
        this.descripcion = descripcion;
        this.articuloPrincipal = articuloPrincipal;
        this.articuloSecundario = articuloSecundario;
    }

    public double calcularValorLote() {
        double precio1 = (articuloPrincipal != null) ? articuloPrincipal.getPrecioBase() : 0.0;
        double precio2 = (articuloSecundario != null) ? articuloSecundario.getPrecioBase() : 0.0;
        return precio1 + precio2;
    }

    public void mostrarDetalleLote() {
        System.out.println("=== DETALLE DEL LOTE: " + descripcion + " ===");
        if (articuloPrincipal != null) {
            System.out.printf("- Artículo Principal: %-20s | Price: $%.2f%n",
                    articuloPrincipal.getNombre(), articuloPrincipal.getPrecioBase());
        }
        if (articuloSecundario != null) {
            System.out.printf("- Artículo Secundario: %-19s | Price: $%.2f%n",
                    articuloSecundario.getNombre(), articuloSecundario.getPrecioBase());
        }
        System.out.println("----------------------------------------------");
        System.out.printf("Valor Total del Lote: $%.2f%n", calcularValorLote());
    }

    public static void main(String[] args) {
        ArticuloGeek item1 = new ArticuloGeek("Figura Eva-01", 17000.0);
        ArticuloGeek item2 = new ArticuloGeek("Dados de rol", 6000.0);

        ColeccionLote loteCombo = new ColeccionLote("Combo Otaku & Rolero", item1, item2);

        loteCombo.mostrarDetalleLote();
    }
}
