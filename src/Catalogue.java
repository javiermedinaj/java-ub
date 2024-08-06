import java.util.ArrayList;
import java.util.Comparator;

public class Catalogue {
    private ArrayList<Dvd> dvdLists;

    public Catalogue() {
        dvdLists = new ArrayList<Dvd>();
    }

    public void addDvd(Dvd dvd) {
        dvdLists.add(dvd);
    }

    public void removeDvdByTitle(String title) {
        dvdLists.removeIf(dvd -> dvd.getTitle().equals(title));
    }

    public void updateDvdByTitle(String title, String newTitle, String newGenre, int newDuration, boolean newIsAvailable, String newComment, String newDirector) {
        for (Dvd dvd : dvdLists) {
            if (dvd.getTitle().equals(title)) {
                dvd.setTitle(newTitle);
                dvd.setGenre(newGenre);
                dvd.setDuration(newDuration);
                dvd.setIsAvailable(newIsAvailable);
                dvd.setComment(newComment);
                dvd.setDirector(newDirector);
                break;
            }
        }
    }

    public void listDvd() {
        for (Dvd dvd : dvdLists) {
            System.out.println(dvd.getTitle());
        }
    }

    public void listDvdByGenre(String genre) {
        for (Dvd dvd : dvdLists) {
            if (dvd.getGenre().equals(genre)) {
                System.out.println(dvd.getTitle());
            }
        }
    }

    public void listDvdByDirector(String director) {
        for (Dvd dvd : dvdLists) {
            if (dvd.getDirector().equals(director)) {
                System.out.println(dvd.getTitle());
            }
        }
    }

    public void listDvdByDuration(int maxDuration) {
        for (Dvd dvd : dvdLists) {
            if (dvd.getDuration() < maxDuration) {
                System.out.println(dvd.getTitle());
            }
        }
    }

    public void listDvdOwned() {
        for (Dvd dvd : dvdLists) {
            if (dvd.getIsAvailable()) {
                System.out.println(dvd.getTitle());
            }
        }
    }

    public void listDvdSortedByTitle() {
        dvdLists.stream()
                .sorted(Comparator.comparing(Dvd::getTitle))
                .forEach(dvd -> System.out.println(dvd.getTitle()));
    }

    public int quantityDvd() {
        return dvdLists.size();
    }

    public int quantityDvdOwned() {
        return (int) dvdLists.stream().filter(Dvd::getIsAvailable).count();
    }
}