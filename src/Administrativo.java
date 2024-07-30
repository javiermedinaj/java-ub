import java.util.Scanner;

public class Administrativo {
    private String nombre;
    private double sueldo;
    private String telefono;

    public Administrativo(String nombre, double sueldo, String telefono){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.telefono = telefono;
    }
    public String getNombre (){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public double getSueldo(){
        return sueldo;
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String toString(){
        return "Nombre: " + nombre + "\nSueldo: " + sueldo + "\nTelefono: " + telefono;
    }
    public static Administrativo ejemplo1(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del administrativo: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el sueldo del administrativo: ");
        double sueldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Ingrese el telefono del administrativo: ");
        String telefono = scanner.nextLine();

        Administrativo admin = new Administrativo(nombre, sueldo, telefono);
        System.out.println("Administrativo creado exitosamente" + "\n" + admin.toString());
        return admin;
    }

    public static void ejemplo2() {
        System.out.println("Creando el primer administrativo:");
        Administrativo admin1 = ejemplo1();

        System.out.println("Creando el segundo administrativo:");
        Administrativo admin2 = ejemplo1();

        if (admin1.getSueldo() > admin2.getSueldo()) {
            System.out.println(admin1.getNombre() + " gana más que " + admin2.getNombre());
        } else if (admin1.getSueldo() < admin2.getSueldo()) {
            System.out.println(admin2.getNombre() + " gana más que " + admin1.getNombre());
        } else {
            System.out.println(admin1.getNombre() + " y " + admin2.getNombre() + " ganan lo mismo.");
        }
    }

    public static void main(String[] args) {
        ejemplo2();
    }
}