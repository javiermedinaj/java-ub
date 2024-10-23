package exercises;

import java.util.ArrayList;

public class PilaList implements Apilable {
    private ArrayList<Object> lista;
    public PilaList (){
        lista = new ArrayList<Object>();
    }
    @Override
    public void apilar(Object obj){
        lista.add(obj);
    }
    @Override
    public void desapilar(){
        lista.remove(lista.size()-1);
    }
    @Override
    public Object verTope(){
        return lista.get(lista.size()-1);
    }
    @Override
    public boolean esVacia(){
        return lista.isEmpty();
    }
    @Override
    public String mostrar() {
        StringBuilder str = new StringBuilder();
        for (int i = lista.size() - 1; i >= 0; i--) {
            str.append(lista.get(i)).append(" ");
        }
        return str.toString();
    }
}