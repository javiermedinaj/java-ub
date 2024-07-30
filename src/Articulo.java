public class Articulo {
    private int codigo;
    private String descripcion;
    private float precio;
    private int stock;

    public Articulo(int c, String d, float p, int s) {
        codigo = c;
        descripcion = d;
        precio = p;
        stock = s;
    }

    public void setCodigo(int c) {
        codigo = c;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String d) {
        descripcion = d;
    }

    public void mostrarArticulo() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
    }
}