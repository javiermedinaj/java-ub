package InterfaCD;

public class CD extends Item {
    private String interprete;
    private int cantidadTemas;
    private String genero;

    public CD(String tituloAlbum, String interprete, int cantidadTemas, int duracion, boolean tengo, String comentario, String genero) {
        super(tituloAlbum, duracion, tengo, comentario);
        this.interprete = interprete;
        this.cantidadTemas = cantidadTemas;
        this.genero = genero;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString() + ", Intérprete: " + interprete + ", Temas: " + cantidadTemas + ", Género: " + genero;
    }
}