public class MainFactura {
    public static void main(String[] args) {
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