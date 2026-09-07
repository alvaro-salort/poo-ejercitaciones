package ejercitacion2_1.ejercicio04;

public class Calculadora {

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0.0) {
            System.out.println("ERROR: No es posible dividir por cero.");
            return 0.0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double resSuma = calc.sumar(15.5, 4.5);
        double resResta = calc.restar(20.0, 7.3);
        double resMulti = calc.multiplicar(6.0, 3.5);
        double resDivOk = calc.dividir(50.0, 5.0);
        double resDivCero = calc.dividir(10.0, 0.0);

        System.out.println("Suma: " + resSuma);
        System.out.println("Resta: " + resResta);
        System.out.println("Multiplicación: " + resMulti);
        System.out.println("División válida: " + resDivOk);
        System.out.println("División por cero: " + resDivCero);
    }
}
