package craps.utils;
import java.util.Scanner;
public class ConsoleUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static boolean preguntarSiContinuar() {
        System.out.print("\n¿Desea jugar otra vez? (s/n): ");
        char respuesta = scanner.next().charAt(0);
        return respuesta == 's' || respuesta == 'S';
    }

    public static void cerrarScanner() {
        scanner.close();
    }

    public static void mostrarBienvenida() {
        System.out.println("\n¡Bienvenido al juego de Craps!");
    }
}
