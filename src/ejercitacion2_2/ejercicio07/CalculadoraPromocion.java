package ejercitacion2_2.ejercicio07;

public class CalculadoraPromocion {
    private double descuentoBase;

    public CalculadoraPromocion(double descuentoBase) {
        this.descuentoBase = descuentoBase;
    }

    public double calcularPrecioFinal(double precioBase) {
        return precioBase - (precioBase * (descuentoBase / 100.0));
    }

    public double calcularPrecioFinal(double precioBase, double porcentajeEspecial) {
        return precioBase - (precioBase * (porcentajeEspecial / 100.0));
    }

    public double calcularPrecioFinal(double precioBase, int cuponFijo) {
        return Math.max(0.0, precioBase - cuponFijo);
    }

    public static void main(String[] args) {
        CalculadoraPromocion calc = new CalculadoraPromocion(10.0); // 10% de descuento base
        double precioOriginal = 10000.0;

        System.out.printf("Precio original: $%.2f%n", precioOriginal);

        // 1. Aplicar descuento base (10%)
        double precioConBase = calc.calcularPrecioFinal(precioOriginal);
        System.out.printf("Con descuento base (10%%): $%.2f%n", precioConBase);

        // 2. Aplicar porcentaje especial (25%)
        double precioConEspecial = calc.calcularPrecioFinal(precioOriginal, 25.0);
        System.out.printf("Con descuento especial (25%%): $%.2f%n", precioConEspecial);

        // 3. Aplicar cupón fijo ($3000)
        double precioConCupon = calc.calcularPrecioFinal(precioOriginal, 3000);
        System.out.printf("Con cupón fijo ($3000): $%.2f%n", precioConCupon);
    }
}
