public class MainAdministrativo {
    public static void main(String[] args) {
        Administrativo ejemplo1 = Administrativo.ejemplo1();
        Administrativo ejemplo2 = Administrativo.ejemplo1();

        if (ejemplo1.getSueldo() > ejemplo2.getSueldo()) {
            System.out.println("El administrativo con el sueldo más alto es: " + ejemplo1.getNombre());
        } else {
            System.out.println("El administrativo con el sueldo más alto es: " + ejemplo2.getNombre());
        }
    }
}
