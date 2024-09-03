public class Libro {
    private String titulo;
    private boolean original;
    private boolean prestable;


    //constructor
    public Libro(String titulo, boolean original, boolean prestable){
        this.titulo = titulo;
        this.original = original;
        this.prestable = prestable;
    }

    //getters
    public String getTitulo(){
        return titulo;
    }

    public boolean getOriginal(){
        return original;
    }

    public boolean getPrestable(){
        return prestable;
    }

    //other methods
    public boolean esOriginal(){
        return original;
    }

    public boolean sePresta(){
        return prestable;
    }

    //setters

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setOriginal(boolean original){
        this.original = original;
    }

    public void setPrestable (boolean prestable){
        this.prestable = prestable;
    }

    //metodo para mostrar la informacion del libro
    public void mostrarLibro (){
        System.out.println("Titulo: " + titulo);
        System.out.println("Original: " + original);
        System.out.println("Prestable: " + prestable);
    }


}
