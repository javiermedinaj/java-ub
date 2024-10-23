package dvd;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CatalogoDVD {
    private List<DVD> catalogo;

    public CatalogoDVD() {
        catalogo = new ArrayList<>();
    }

    public void agregarDVD(DVD dvd) {
        catalogo.add(dvd);
    }

    public void eliminarDVD(String titulo) {
        catalogo.removeIf(dvd -> dvd.getTitulo().equalsIgnoreCase(titulo));
    }

    public void modificarDVD(String titulo, String nuevoGenero, int nuevaDuracion, boolean tengo, String nuevoComentario) {
        for (DVD dvd : catalogo) {
            if (dvd.getTitulo().equalsIgnoreCase(titulo)) {
                dvd.setGenero(nuevoGenero);
                dvd.setDuracion(nuevaDuracion);
                dvd.setTengo(tengo);
                dvd.setComentario(nuevoComentario);
            }
        }
    }

    public void listarTodos() {
        catalogo.forEach(System.out::println);
    }

    public void listarDVDsQueTengo() {
        catalogo.stream()
                .filter(DVD::isTengo)
                .forEach(System.out::println);
    }

    public void listarDVDsPorDuracion(int minutos) {
        catalogo.stream()
                .filter(dvd -> dvd.getDuracion() < minutos)
                .forEach(System.out::println);
    }


    public void listarDVDsPorGenero(String genero) {
        catalogo.stream()
                .filter(dvd -> dvd.getGenero().equalsIgnoreCase(genero))
                .forEach(System.out::println);
    }

    public void listarDVDsOrdenadosPorTitulo() {
        catalogo.stream()
                .sorted(Comparator.comparing(DVD::getTitulo))
                .forEach(System.out::println);
    }

    public int totalDVDs() {
        return catalogo.size();
    }

    public long totalDVDsQueTengo() {
        return catalogo.stream()
                .filter(DVD::isTengo)
                .count();
    }
}

