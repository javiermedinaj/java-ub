package exercises;

public class MainPila {
    public static void main(String[] args) {
        Apilable pila = new PilaList();
        pila.apilar(1);
        pila.apilar(2);
        pila.apilar(3);
        pila.apilar(4);
        pila.apilar(5);
//        while (!pila.esVacia()){
//            System.out.println(pila.verTope());
//            pila.desapilar();
//        }
        System.out.println(pila.mostrar());
    }
}