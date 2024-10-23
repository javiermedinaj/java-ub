package exercises;

public class MainAlumno {
    public static void main(String[] args) {
        Curso prog2 = new Curso(20);
        prog2.addAlumno(new Alumno("Juan 15"));
        prog2.addAlumno(new Alumno("Pedro 12"));
        prog2.addAlumno(new Alumno("Maria 18"));

        prog2.mostrarAlumnos();
        System.out.println(prog2);
        System.out.println("Promedio: " + prog2.promedio());
        System.out.println("Mejor nota: " + prog2.mejorNota());
    }
}