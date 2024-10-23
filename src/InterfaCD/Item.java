package InterfaCD;

public abstract class Item {
    private String titulo;
    private int duracion; // En minutos
    private boolean tengo;
    private String comentario;

    public Item(String titulo, int duracion, boolean tengo, String comentario) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.tengo = tengo;
        this.comentario = comentario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
        return "Título: " + titulo + ", Duración: " + duracion + " min, Tengo: " + (tengo ? "Sí" : "No") + ", Comentario: " + comentario;
    }
}