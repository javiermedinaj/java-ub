package InterfaCD;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Agregar DVD");
            System.out.println("2. Eliminar DVD");
            System.out.println("3. Modificar DVD");
            System.out.println("4. Listar todos los DVDs");
            System.out.println("5. Listar DVDs que tengo");
            System.out.println("6. Agregar CD");
            System.out.println("7. Eliminar CD");
            System.out.println("8. Modificar CD");
            System.out.println("9. Listar todos los CDs");
            System.out.println("10. Listar CDs que tengo");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título: ");
                    String tituloDVD = sc.nextLine();
                    System.out.print("Ingrese el género: ");
                    String generoDVD = sc.nextLine();
                    System.out.print("Ingrese la duración en minutos: ");
                    int duracionDVD = sc.nextInt();
                    System.out.print("¿Lo tengo? (true/false): ");
                    boolean tengoDVD = sc.nextBoolean();
                    sc.nextLine();
                    System.out.print("Ingrese el comentario: ");
                    String comentarioDVD = sc.nextLine();
                    catalogo.agregarItem(new DVD(tituloDVD, generoDVD, duracionDVD, tengoDVD, comentarioDVD));
                    break;
                case 2:
                    System.out.print("Ingrese el título del DVD a eliminar: ");
                    tituloDVD = sc.nextLine();
                    catalogo.eliminarItem(tituloDVD);
                    break;
                case 6:
                    System.out.print("Ingrese el título del álbum: ");
                    String tituloCD = sc.nextLine();
                    System.out.print("Ingrese el intérprete: ");
                    String interpreteCD = sc.nextLine();
                    System.out.print("Ingrese la cantidad de temas: ");
                    int cantidadTemasCD = sc.nextInt();
                    System.out.print("Ingrese la duración en minutos: ");
                    int duracionCD = sc.nextInt();
                    System.out.print("¿Lo tengo? (true/false): ");
                    boolean tengoCD = sc.nextBoolean();
                    sc.nextLine();
                    System.out.print("Ingrese el comentario: ");
                    String comentarioCD = sc.nextLine();
                    System.out.print("Ingrese el género: ");
                    String generoCD = sc.nextLine();
                    catalogo.agregarItem(new CD(tituloCD, interpreteCD, cantidadTemasCD, duracionCD, tengoCD, comentarioCD, generoCD));
                    break;
                case 7:
                    System.out.print("Ingrese el título del CD a eliminar: ");
                    tituloCD = sc.nextLine();
                    catalogo.eliminarItem(tituloCD);
                    break;
                case 9:
                    catalogo.listarTodos();
                    break;
                case 10:
                    catalogo.listarItemsQueTengo();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0);

        sc.close();
    }
}