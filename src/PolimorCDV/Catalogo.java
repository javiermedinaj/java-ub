package PolimorCDV;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Item> catalogo;

    public Catalogo() {
        catalogo = new ArrayList<>();
    }

    public void agregarItem(Item item) {
        catalogo.add(item);
    }

    public void eliminarItem(String titulo) {
        catalogo.removeIf(item -> item.getTitulo().equalsIgnoreCase(titulo));
    }

    public Item buscarItem(String titulo) {
        return catalogo.stream()
                .filter(item -> item.getTitulo().equalsIgnoreCase(titulo))
                .findFirst()
                .orElse(null);
    }

    public void listarTodos() {
        catalogo.forEach(System.out::println);
    }

    public void listarItemsQueTengo() {
        catalogo.stream()
                .filter(Item::isTengo)
                .forEach(System.out::println);
    }
}