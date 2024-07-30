public class Main {
    public static void main(String[] args) {
        Articulo articulo = new Articulo(1, "Laptop", 999.99f, 10);
        articulo.mostrarArticulo();
        Socio socio1 = new Socio("Medina");
        socio1.mostrarSocio();
        Socio socio2 = new Socio("Javier");
        socio2.mostrarSocio();

        Administrativo ejemplo1 = Administrativo.ejemplo1();
        Administrativo ejemplo2 = Administrativo.ejemplo1();
        if (ejemplo1.getSueldo() > ejemplo2.getSueldo()) {
            System.out.println(ejemplo1.getNombre() + " gana más que " + ejemplo2.getNombre());
        } else if (ejemplo1.getSueldo() < ejemplo2.getSueldo()) {
            System.out.println(ejemplo2.getNombre() + " gana más que " + ejemplo1.getNombre());
        } else {
            System.out.println(ejemplo1.getNombre() + " y " + ejemplo2.getNombre() + " ganan lo mismo.");
        }
    }
} 