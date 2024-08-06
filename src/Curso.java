import javax.swing.JOptionPane;

public class Curso {
    private Alumno alumnos[];
    private int cont;

    public Curso(int n){
        alumnos = new Alumno[n];
        cont = 0;
    }
    public void addAlumno(Alumno a){
        alumnos[cont] = a;
        cont++;
    }
    public void mostrarAlumnos(){
        String s = "";
        for(int i = 0; i < cont; i++){
            s += alumnos[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, s);
    }
    public String toString(){
        String s = "";
        for(int i = 0; i < cont; i++){
            s += alumnos[i] + "\n";
        }
        return s;
    }
    public double promedio(){
        double prom = 0;
        for(int i = 0; i < cont; i++){
            prom += alumnos[i].getNota();
        }
        return prom / cont;
    }
    //mejor nota
    public int mejorNota(){
        int mejor = 0;
        for(int i = 0; i < cont; i++){
            if(alumnos[i].getNota() > mejor){
                mejor = alumnos[i].getNota();
            }
        }
        return mejor;
    }
}
