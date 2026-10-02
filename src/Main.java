import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = -1;
        do {
            System.out.println("\n==================================================");
            System.out.println("       MENÚ PRINCIPAL - EJERCITACIONES POO        ");
            System.out.println("==================================================");
            System.out.println("1. Ejercitación 2.E.1 (Ejercicios 1 a 10)");
            System.out.println("2. Ejercitación 2.E.2 (Ejercicios 1 a 10)");
            System.out.println("0. Salir");
            System.out.println("==================================================");
            System.out.print("Seleccione una opción: ");

            opcion = leerEntero();

            switch (opcion) {
                case 1:
                    menuEjercitacion2_1();
                    break;
                case 2:
                    menuEjercitacion2_2();
                    break;
                case 0:
                    System.out.println("\n¡Gracias por revisar las ejercitaciones!");
                    break;
                default:
                    System.out.println("\n[!] Opción inválida.");
            }
        } while (opcion != 0);
    }

    private static void menuEjercitacion2_1() {
        int opcion = -1;
        do {
            System.out.println("\n--------------------------------------------------");
            System.out.println("              EJERCITACIÓN 2.E.1                  ");
            System.out.println("--------------------------------------------------");
            System.out.println("1.  Ejercicio 1: Persona");
            System.out.println("2.  Ejercicio 2: Mascota");
            System.out.println("3.  Ejercicio 3: Auto");
            System.out.println("4.  Ejercicio 4: Calculadora");
            System.out.println("5.  Ejercicio 5: Contador");
            System.out.println("6.  Ejercicio 6: Libro");
            System.out.println("7.  Ejercicio 7: CuentaBancaria");
            System.out.println("8.  Ejercicio 8: Estudiante");
            System.out.println("9.  Ejercicio 9: Producto y CarritoDeCompras");
            System.out.println("10. Ejercicio 10: Personaje (Combate)");
            System.out.println("0.  Volver al menú principal");
            System.out.println("--------------------------------------------------");
            System.out.print("Seleccione un ejercicio a ejecutar: ");

            opcion = leerEntero();
            System.out.println();

            switch (opcion) {
                case 1:
                    ejercitacion2_1.ejercicio01.Persona.main(new String[0]);
                    pausa();
                    break;
                case 2:
                    ejercitacion2_1.ejercicio02.Mascota.main(new String[0]);
                    pausa();
                    break;
                case 3:
                    ejercitacion2_1.ejercicio03.Auto.main(new String[0]);
                    pausa();
                    break;
                case 4:
                    ejercitacion2_1.ejercicio04.Calculadora.main(new String[0]);
                    pausa();
                    break;
                case 5:
                    ejercitacion2_1.ejercicio05.Contador.main(new String[0]);
                    pausa();
                    break;
                case 6:
                    ejercitacion2_1.ejercicio06.Libro.main(new String[0]);
                    pausa();
                    break;
                case 7:
                    ejercitacion2_1.ejercicio07.CuentaBancaria.main(new String[0]);
                    pausa();
                    break;
                case 8:
                    ejercitacion2_1.ejercicio08.Estudiante.main(new String[0]);
                    pausa();
                    break;
                case 9:
                    ejercitacion2_1.ejercicio09.CarritoDeCompras.main(new String[0]);
                    pausa();
                    break;
                case 10:
                    ejercitacion2_1.ejercicio10.Personaje.main(new String[0]);
                    pausa();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("[!] Opción inválida.");
            }
        } while (opcion != 0);
    }

    private static void menuEjercitacion2_2() {
        int opcion = -1;
        do {
            System.out.println("\n--------------------------------------------------");
            System.out.println("              EJERCITACIÓN 2.E.2                  ");
            System.out.println("--------------------------------------------------");
            System.out.println("1.  Ejercicio 1: ArticuloGeek");
            System.out.println("2.  Ejercicio 2: Videojuego");
            System.out.println("3.  Ejercicio 3: ConsolaRetro");
            System.out.println("4.  Ejercicio 4: CajaRegistradora");
            System.out.println("5.  Ejercicio 5: SocioGeek");
            System.out.println("6.  Ejercicio 6: Comic");
            System.out.println("7.  Ejercicio 7: CalculadoraPromocion");
            System.out.println("8.  Ejercicio 8: MangaVolume");
            System.out.println("9.  Ejercicio 9: GiftCard y Cliente");
            System.out.println("10. Ejercicio 10: ColeccionLote y ArticuloGeek");
            System.out.println("0.  Volver al menú principal");
            System.out.println("--------------------------------------------------");
            System.out.print("Seleccione un ejercicio a ejecutar: ");

            opcion = leerEntero();
            System.out.println();

            switch (opcion) {
                case 1:
                    ejercitacion2_2.ejercicio01.ArticuloGeek.main(new String[0]);
                    pausa();
                    break;
                case 2:
                    ejercitacion2_2.ejercicio02.Videojuego.main(new String[0]);
                    pausa();
                    break;
                case 3:
                    ejercitacion2_2.ejercicio03.ConsolaRetro.main(new String[0]);
                    pausa();
                    break;
                case 4:
                    ejercitacion2_2.ejercicio04.CajaRegistradora.main(new String[0]);
                    pausa();
                    break;
                case 5:
                    ejercitacion2_2.ejercicio05.SocioGeek.main(new String[0]);
                    pausa();
                    break;
                case 6:
                    ejercitacion2_2.ejercicio06.Comic.main(new String[0]);
                    pausa();
                    break;
                case 7:
                    ejercitacion2_2.ejercicio07.CalculadoraPromocion.main(new String[0]);
                    pausa();
                    break;
                case 8:
                    ejercitacion2_2.ejercicio08.MangaVolume.main(new String[0]);
                    pausa();
                    break;
                case 9:
                    ejercitacion2_2.ejercicio09.Cliente.main(new String[0]);
                    pausa();
                    break;
                case 10:
                    ejercitacion2_2.ejercicio10.ColeccionLote.main(new String[0]);
                    pausa();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("[!] Opción inválida.");
            }
        } while (opcion != 0);
    }

    private static int leerEntero() {
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (Exception e) {
            return -1;
        }
    }

    private static void pausa() {
        System.out.println("\nPresione ENTER para continuar...");
        scanner.nextLine();
    }
}
// Hecho con ayuda de la buena IA