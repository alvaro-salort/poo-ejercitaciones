package ejercitacion2_2.ejercicio09;

public class Cliente {
    private String nombre;
    private GiftCard tarjeta;

    public Cliente(String nombre, GiftCard tarjeta) {
        this.nombre = nombre;
        this.tarjeta = tarjeta;
    }

    public void realizarCompra(double monto) {
        System.out.printf("El cliente %s intenta realizar una compra de $%.2f...%n", nombre, monto);
        if (tarjeta == null) {
            System.out.println("Error: El cliente no posee una GiftCard asociada.");
            return;
        }

        boolean exito = tarjeta.descontarSaldo(monto);
        if (exito) {
            System.out.printf("¡Compra aprobada! Saldo restante en la tarjeta [%s]: $%.2f%n",
                    tarjeta.getCodigo(), tarjeta.getSaldo());
        } else {
            System.out.printf("Rechazado: Saldo insuficiente en la tarjeta [%s]. Saldo disponible: $%.2f%n",
                    tarjeta.getCodigo(), tarjeta.getSaldo());
        }
    }

    public static void main(String[] args) {
        GiftCard giftCard = new GiftCard("GC-998877", 10000.0);
        Cliente cliente = new Cliente("Sofía", giftCard);

        System.out.printf("Saldo inicial GiftCard: $%.2f%n%n", giftCard.getSaldo());

        // 1. Compra exitosa ($4000)
        cliente.realizarCompra(4000.0);

        System.out.println();

        // 2. Compra fallida ($8000 excede el saldo restante de $6000)
        cliente.realizarCompra(8000.0);
    }
}
