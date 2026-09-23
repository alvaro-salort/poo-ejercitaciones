package ejercitacion2_1.ejercicio10;

public class Personaje {
    private String nombre;
    private int puntosVida;
    private int puntosAtaque;

    public Personaje(String nombre, int puntosVida, int puntosAtaque){
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.puntosAtaque = puntosAtaque;
    }

    public boolean estaVivo(){
        return this.puntosVida > 0;
    }

    public void atacar(Personaje objetivo){
        objetivo.puntosVida -= this.puntosAtaque;
        if(objetivo.puntosVida < 0){
            objetivo.puntosVida = 0;
        }
        System.out.printf("%s ataca a %s causando %d de daño. Vida restante de %s: %d%n", this.nombre, objetivo.nombre, this.puntosAtaque, objetivo.nombre, objetivo.puntosVida);
    }


    public static void main(String[] args){
        Personaje p1 = new Personaje("Guts", 100, 20);
        Personaje p2 = new Personaje("Griffith", 80, 20);
        while(p1.estaVivo() && p2.estaVivo()){
            p1.atacar(p2);
            if(p2.estaVivo()){
                p2.atacar(p1);
            }
        }
        if(p1.estaVivo()){
            System.out.println("El ganador es" + p1.getNombre + "!");
        } else {
            System.out.println("El ganador es" + p2.getNombre + "!");
        }
    }
}