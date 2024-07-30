public class Main {
    public static void main(String[] args) {
        /*
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
        */
        Factura factura1 = new Factura(1, "Laptop", 1, 999.99f);
        Factura factura2 = new Factura(2, "Mouse", 2, 19.99f);
        Factura factura3 = new Factura(3, "Teclado", 1, 49.99f);

        System.out.println("Factura 1");
        System.out.println("Número de factura: " + factura1.getNumeroDeFactura());
        System.out.println("Número de artículo: " + factura1.getNumeroDeArticulo());
        System.out.println("Descripción: " + factura1.getDescripcion());
        System.out.println("Cantidad: " + factura1.getCantidad());
        System.out.println("Precio: " + factura1.getPrecio());

        System.out.println("Factura 2");
        System.out.println("Número de factura: " + factura2.getNumeroDeFactura());
        System.out.println("Número de artículo: " + factura2.getNumeroDeArticulo());
        System.out.println("Descripción: " + factura2.getDescripcion());
        System.out.println("Cantidad: " + factura2.getCantidad());
        System.out.println("Precio: " + factura2.getPrecio());

        System.out.println("Factura 3");
        System.out.println("Número de factura: " + factura3.getNumeroDeFactura());
        System.out.println("Número de artículo: " + factura3.getNumeroDeArticulo());
        System.out.println("Descripción: " + factura3.getDescripcion());
        System.out.println("Cantidad: " + factura3.getCantidad());
        System.out.println("Precio: " + factura3.getPrecio());
    }
} 