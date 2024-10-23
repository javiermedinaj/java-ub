package craps;
import craps.game.JuegoCraps;
import craps.utils.ConsoleUtils;

public class Main {
    public static void main(String[] args) {
        JuegoCraps juego = new JuegoCraps();

        do {
            ConsoleUtils.mostrarBienvenida();
            juego.jugar();
        } while (ConsoleUtils.preguntarSiContinuar());

        System.out.println("¡Gracias por jugar!");
        ConsoleUtils.cerrarScanner();
    }
}
