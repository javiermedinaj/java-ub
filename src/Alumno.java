public class Alumno {
    private String nombre;
    private int nota;

    public Alumno(String str){
        String[] x = str.split(" ");
        nombre = x[0];
        nota = Integer.parseInt(x[1].trim());
    }
    public String toString(){
        return "Nombre: " + nombre + "\n" + " Nota: " + nota;
    }
    public int getNota(){
        return nota;
    }
}