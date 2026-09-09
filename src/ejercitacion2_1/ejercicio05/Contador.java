package ejercitacion2_1.ejercicio05;

public class Contador {
    int valor;

    public Contador() {
        this.valor = 0;
    }

    public Contador(int valorInicial){
        this.valor = Math.max(0, valorInicial);
    }

    public void incrementar(){
        this.valor++;
    }

    public void decrementar(){
        if(this.valor > 0){
            this.valor--;
        }
    }

    public void resetear(){
        this.valor = 0;
    }

    public int getValor(){
        return valor;
    }

    public static void main(String[] args) {

        Contador contador = new Contador();
        System.out.println("Valor actual del contador: " + contador.getValor());

        contador.incrementar();
        System.out.println("Valor después de incrementar: " + contador.getValor());
        
        contador.decrementar();
        System.out.println("Valor después de decrementar: " + contador.getValor());

        contador.decrementar();
        System.out.println("Decrementar a numero negativo: " + contador.getValor());

        contador.incrementar();
        System.out.println("Valor después de incrementar: " + contador.getValor());

        contador.resetear();
        System.out.println("Valor después de resetear: " + contador.getValor());

        Contador contador2 = new Contador(5);
        System.out.println("Valor actual del contador 2: " + contador2.getValor());
    }



}