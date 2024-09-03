public class MainMarket {
    public static void main(String[] args) {
        // Crear artículos utilizando el constructor con parámetros
        MarketItem item1 = new MarketItem("Manzanas", 1.99, 50);
        MarketItem item2 = new MarketItem("Leche", 0.99, 100);
        MarketItem item3 = new MarketItem("Pan", 2.50, 30);

        // Mostrar la información de los artículos
        System.out.println("Artículo 1:");
        item1.mostrarArticulo();

        System.out.println("\nArtículo 2:");
        item2.mostrarArticulo();

        System.out.println("\nArtículo 3:");
        item3.mostrarArticulo();
    }
}
