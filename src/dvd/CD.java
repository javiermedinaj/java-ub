package dvd;

public class CD {
    private String tituloAlbum;
    private String interprete;
    private int cantidadTemas;
    private int duracion; // En minutos
    private boolean tengo;
    private String comentario;
    private String genero;

    // Constructor
    public CD(String tituloAlbum, String interprete, int cantidadTemas, int duracion, boolean tengo, String comentario, String genero) {
        this.tituloAlbum = tituloAlbum;
        this.interprete = interprete;
        this.cantidadTemas = cantidadTemas;
        this.duracion = duracion;
        this.tengo = tengo;
        this.comentario = comentario;
        this.genero = genero;
    }

    // Getters y Setters
    public String getTituloAlbum() {
        return tituloAlbum;
    }

    public void setTituloAlbum(String tituloAlbum) {
        this.tituloAlbum = tituloAlbum;
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public int getCantidadTemas() {
        return cantidadTemas;
    }

    public void setCantidadTemas(int cantidadTemas) {
        this.cantidadTemas = cantidadTemas;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Álbum: " + tituloAlbum + ", Intérprete: " + interprete + ", Temas: " + cantidadTemas +
                ", Duración: " + duracion + " min, Tengo: " + (tengo ? "Sí" : "No") +
                ", Comentario: " + comentario + ", Género: " + genero;
    }
}