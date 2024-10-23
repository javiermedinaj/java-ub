package dvd;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CatalogoCD {
    private List<CD> catalogo;

    public CatalogoCD() {
        catalogo = new ArrayList<>();
    }

    // Añadir un CD al catálogo
    public void agregarCD(CD cd) {
        catalogo.add(cd);
    }

    // Eliminar un CD por título de álbum
    public void eliminarCD(String tituloAlbum) {
        catalogo.removeIf(cd -> cd.getTituloAlbum().equalsIgnoreCase(tituloAlbum));
    }

    // Modificar un CD por título de álbum
    public void modificarCD(String tituloAlbum, String nuevoInterprete, int nuevaCantidadTemas, int nuevaDuracion, boolean tengo, String nuevoComentario, String nuevoGenero) {
        for (CD cd : catalogo) {
            if (cd.getTituloAlbum().equalsIgnoreCase(tituloAlbum)) {
                cd.setInterprete(nuevoInterprete);
                cd.setCantidadTemas(nuevaCantidadTemas);
                cd.setDuracion(nuevaDuracion);
                cd.setTengo(tengo);
                cd.setComentario(nuevoComentario);
                cd.setGenero(nuevoGenero);
            }
        }
    }

    // Listar todos los CDs
    public void listarTodos() {
        catalogo.forEach(System.out::println);
    }

    // Listar los CDs que tengo
    public void listarCDsQueTengo() {
        catalogo.stream()
                .filter(CD::isTengo)
                .forEach(System.out::println);
    }

    // Listar CDs por intérprete
    public void listarCDsPorInterprete(String interprete) {
        catalogo.stream()
                .filter(cd -> cd.getInterprete().equalsIgnoreCase(interprete))
                .forEach(System.out::println);
    }
//
//    // Listar CDs ordenados por título
//    public void listarCDsOrdenadosPorTitulo() {
//        catalogo.stream()
//                .sorted(Comparator.comparing(CD::getTituloAlbum))
//                .forEach(System.out::println);
//    }
//
//    // Informar la cantidad total de CDs
//    public int totalCDs() {
//        return catalogo.size();
//    }
//
//    // Informar la cantidad de CDs que tengo
//    public long totalCDsQueTengo() {
//        return catalogo.stream()
//                .filter(CD::isTengo)
//                .count();
//    }
}