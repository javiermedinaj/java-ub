package exercises;

public class MarketItem {
    private static int contadorClaves = 0;
    private int clave;
    private String descripcion;
    private double precio;
    private int cantidad;
    //constructor
    public MarketItem(){
        this.clave = ++contadorClaves;
        this.descripcion ="";
        this.precio = 0.0;
        this.cantidad = 0;
    }

    //constructor con parametros
    public MarketItem(String descripcion, double precio, int cantidad){
        this.clave = ++contadorClaves;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    //getters
    public int getClave(){
        return clave;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public double getPrecio(){
        return precio;
    }

    public int getCantidad(){
        return cantidad;
    }

    //setters
    public void setDescripcion (String descripcion){
        this.descripcion = descripcion;
    }

    public void setPrecio (double precio){
        this.precio = precio;
    }

    public void setCantidad (int cantidad){
        this.cantidad = cantidad;
    }

    public void mostrarArticulo(){
        System.out.println("Clave: " + clave);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
    }

}








