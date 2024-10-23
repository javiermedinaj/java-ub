package exercises;

public class MainLibro {
    public static void main(String[] args) {
        //libro original que no se presta
        Libro Libro1 = new Libro ("El principito", true, false);

        //libro no original que se presta
        Libro Libro2 = new Libro ("El principito-fotocopia", false, true);

        //Mostrar informacion de los libros
        System.out.println("Libro 1");
        Libro1.mostrarLibro();

        System.out.println("\nLibro 2");
        Libro2.mostrarLibro();

    }
}