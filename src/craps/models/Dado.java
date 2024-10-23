package craps.models;
import java .util.Random;

public class Dado {
    private final Random random;
    private int valor;

    public Dado(){
        this.random = new Random();
    }

    public void tirar() {
        this.valor = 1 + random.nextInt(6);
    }

    public int getValor(){
        return valor;
    }
}
