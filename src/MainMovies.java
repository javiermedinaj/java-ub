public class MainMovies {
    public static void main(String[] args) {
        Catalogue catalogue = new Catalogue();
        Dvd dvd1 = new Dvd("The Godfather", "Crime", 175, true, "Classic", "Francis Ford Coppola");
        Dvd dvd2 = new Dvd("The Shawshank Redemption", "Drama", 142, true, "Classic", "Frank Darabont");
        Dvd dvd3 = new Dvd("The Dark Knight", "Action", 152, true, "Classic", "Christopher Nolan");
        Dvd dvd4 = new Dvd("12 Angry Men", "Drama", 96, true, "Classic", "Sidney Lumet");

        catalogue.addDvd(dvd1);
        catalogue.addDvd(dvd2);
        catalogue.addDvd(dvd3);
        catalogue.addDvd(dvd4);
        catalogue.listDvd();
        System.out.println("List of DVDs: \n");
        catalogue.removeDvdByTitle("The Godfather");
        System.out.println("\nList of DVDs after removing The Godfather: \n");
        catalogue.listDvd();


//        System.out.println("List of DVDs:");
//        catalogue.listDvd();

//        System.out.println("List of DVDs by genre:");
//        catalogue.listDvdByGenre("Drama");

        System.out.println("\nList of DVDs by director: Christopher Nolan");
        catalogue.listDvdByDirector("Christopher Nolan");
        System.out.println("\n");
//        System.out.println("List of DVDs by duration less than 150 minutes:");
//        catalogue.listDvdByDuration(150);

//        System.out.println("List of DVDs owned:");
//        catalogue.listDvdOwned();

//        System.out.println("List of DVDs sorted by title:");
//        catalogue.listDvdSortedByTitle();

        System.out.println("Quantity of DVDs: " + catalogue.quantityDvd() + " DVDs");
        System.out.println("Quantity of DVDs owned: " + catalogue.quantityDvdOwned() + " DVDs");


    }
}