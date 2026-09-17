    package ejercitacion2_1.ejercicio07;

    public class CuentaBancaria {

        private String titular;
        private double saldo;

        public CuentaBancaria(String titular, double saldoInicial) {
            this.titular = titular;
            this.saldo = Math.max(0.0, saldoInicial);
        }
        
        public String getTitular() {
            return titular;
        }
        
        public void setTitular(String titular){
            this.titular = titular;
        }

        public double consultar(){
            return saldo;
        }

        public double depositar(double monto) {
            if (monto > 0) {
                saldo += monto;
                System.out.printf("Se depositaron %.2f a la cuenta de %s. Nuevo saldo: %.2f%n", monto, titular, saldo);
            } else {
                System.out.println("El monto a depositar debe ser mayor que cero.");
            }
            return saldo;
        }

        public double retirar(double monto) {
            if (monto <= saldo && monto > 0){
            saldo -= monto;
            System.out.printf("Se retirararon %.2f de la cuenta. Nuevo saldo: %.2f%n", monto, saldo);
        } else if(monto <= 0){
            System.out.println("Operación inválida.");
        } else {
            System.out.printf("No hay suficiente dinero en la cuenta. Saldo actual: %.2f%n", saldo);
        }
        return saldo;
        }

        public static void main(String[] args){
            CuentaBancaria cuenta1 = new CuentaBancaria("Bill Gates", 60000.0);
            System.out.printf("Titular: %s | Saldo: %.2f%n", cuenta1.getTitular(), cuenta1.consultar()); //Cuenta valida
            cuenta1.depositar(1000); //deposito valido
            cuenta1.retirar(2000); //retiro valido
            System.out.printf("Titular: %s | Saldo: %.2f%n", cuenta1.getTitular(), cuenta1.consultar()); //Cuenta valida
            System.out.println("\n");

            CuentaBancaria cuenta2 = new CuentaBancaria("Steve Jobs", -1000.0);
            System.out.printf("Titular: %s | Saldo: %.2f%n", cuenta2.getTitular(), cuenta2.consultar()); //Cuenta invalida
            cuenta2.retirar(500); //retiro valido
            cuenta2.retirar(-200); //retiro invalido
        }   

    }
