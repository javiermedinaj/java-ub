package dvd;

public class DVD {
    private String titulo;
    private String genero;
    private int duracion;
    private boolean tengo;
    private String comentario;

    // Constructor
    public DVD(String titulo, String genero, int duracion, boolean tengo, String comentario) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.tengo = tengo;
        this.comentario = comentario;
    }
    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isTengo() {
        return tengo;
    }

    public void setTengo(boolean tengo) {
        this.tengo = tengo;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Género: " + genero + ", Duración: " + duracion +
                " min, Tengo: " + (tengo ? "Sí" : "No") + ", Comentario: " + comentario;
    }
}
