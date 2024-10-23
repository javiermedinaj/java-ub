package exercises;

public class PilaEst implements Pila , PilaMostrable {
    private Object vec[];
    private int tope;

    public PilaEst(){
        vec = new Object[100];
        tope = -1;
    }

    @Override
    public void apilar(Object obj){
        if (tope == vec.length-1)
            throw new RuntimeException("Pila llena");
        vec[++tope] = obj;
    }

    @Override
    public void desapilar(){
        if (esVacia())
            throw new RuntimeException("Pila vacía");
        tope--;
    }

    @Override
    public Object verTope(){
        if (esVacia())
            throw new RuntimeException("Pila vacía");
        return vec[tope];
    }

    @Override
    public boolean esVacia(){
        return tope == -1;
    }
    @Override
    public String mostrar() {
        String str = "";
        for (int i = tope; i >= 0; i--) {
            str += vec[i] + " ";
        }
        return str;
    }

}