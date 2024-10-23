package craps.game;


import craps.models.Dado;

public class JuegoCraps {
    private final Dado dado1;
    private final Dado dado2;
    private int punto;

    public JuegoCraps() {
        this.dado1 = new Dado();
        this.dado2 = new Dado();
    }

    public int tirarDados() {
        dado1.tirar();
        dado2.tirar();
        int suma = dado1.getValor() + dado2.getValor();
        System.out.printf("El jugador tiró %d + %d = %d%n",
                dado1.getValor(), dado2.getValor(), suma);
        return suma;
    }

    public void jugar() {
        punto = 0;
        EstadoJuego estadoJuego;
        int sumaDados = tirarDados();

        switch (sumaDados) {
            case 7, 11 -> estadoJuego = EstadoJuego.GANAR;
            case 2, 3, 12 -> estadoJuego = EstadoJuego.PERDER;
            default -> {
                estadoJuego = EstadoJuego.CONTINUAR;
                punto = sumaDados;
                System.out.printf("El punto es %d%n", punto);
            }
        }

        while (estadoJuego == EstadoJuego.CONTINUAR) {
            sumaDados = tirarDados();
            if (sumaDados == punto) {
                estadoJuego = EstadoJuego.GANAR;
            } else if (sumaDados == 7) {
                estadoJuego = EstadoJuego.PERDER;
            }
        }

        System.out.println(estadoJuego == EstadoJuego.GANAR ?
                "¡El jugador gana!" : "El jugador pierde.");
    }
}
