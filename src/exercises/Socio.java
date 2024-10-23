package exercises;

public class Socio {
    private String nombre;
    private int numero;
    private static int proximoNumero = 1;

    public Socio (String nombre){
        this.nombre = nombre;
        numero = proximoNumero;
        proximoNumero++;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getNumero()
    {
        return numero;
    }
    //no es necesario el setNumero porque el numero se asigna automaticamente
//    public void setNumero(int numero){
//        this.numero = numero;
//    }
    public void mostrarSocio(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Numero: " + numero);
    }
}
