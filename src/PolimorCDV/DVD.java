package PolimorCDV;

public class DVD extends Item {
    private String genero;

    public DVD(String titulo, String genero, int duracion, boolean tengo, String comentario) {
        super(titulo, duracion, tengo, comentario);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString() + ", Género: " + genero;
    }
}
