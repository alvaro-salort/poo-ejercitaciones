package ejercitacion2_2.ejercicio04;

public class CajaRegistradora {
    private double montoRecaudado;
    private int totalVentasRealizadas;

    public CajaRegistradora() {
        this.montoRecaudado = 0.0;
        this.totalVentasRealizadas = 0;
    }

    public void registrarVenta(double monto) {
        if (monto > 0) {
            this.montoRecaudado += monto;
            this.totalVentasRealizadas++;
        }
    }

    public double obtenerPromedioVenta() {
        if (totalVentasRealizadas == 0) {
            System.out.println("No se han realizado ventas aún.");
            return 0.0;
        }
        return montoRecaudado / totalVentasRealizadas;
    }

    public static void main(String[] args) {
        CajaRegistradora caja = new CajaRegistradora();

        caja.registrarVenta(1500.50);
        caja.registrarVenta(3200.00);
        caja.registrarVenta(800.25);

        double promedio = caja.obtenerPromedioVenta();
        System.out.printf("Monto promedio por venta: $%.2f%n", promedio);
    }
}
