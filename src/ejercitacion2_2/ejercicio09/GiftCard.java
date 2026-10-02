package ejercitacion2_2.ejercicio09;

public class GiftCard {
    private String codigo;
    private double saldo;

    public GiftCard(String codigo, double saldo) {
        this.codigo = codigo;
        this.saldo = Math.max(0.0, saldo);
    }

    public String getCodigo() {
        return codigo;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean descontarSaldo(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }
}
