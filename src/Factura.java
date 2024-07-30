public class Factura {
    private static int contadorFacturas = 1;
    private int numeroDeFactura;
    private int numeroDeArticulo;
    private String descripcion;
    private int cantidad;
    private double precio;

    public Factura(int numeroDeArticulo, String descripcion, int cantidad, double precio){
        this.numeroDeFactura = contadorFacturas++;
        this.numeroDeArticulo = numeroDeArticulo;
        this.descripcion = descripcion;
        setCantidad(cantidad);
        setPrecio(precio);
    }

    //getters

    public int getNumeroDeFactura() {
        return numeroDeFactura;
    }
    public int getNumeroDeArticulo() {
        return numeroDeArticulo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public int getCantidad() {
        return cantidad;
    }
    public double getPrecio() {
        return precio;
    }
    //setters
    public void setNumeroDeArticulo(int numeroDeArticulo) {
        this.numeroDeArticulo = numeroDeArticulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(int cantidad) {
        if (cantidad < 0){
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }
    }

    public void setPrecio(double precio) {
        if (precio < 0){
            this.precio = 0;
        } else {
            this.precio = precio;
        }
    }
}
