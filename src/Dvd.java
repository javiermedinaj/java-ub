public class Dvd {
    private String title;
    private String genre;
    private int duration;
    private boolean isAvailable;
    private String comment;
    private String director;

    public Dvd(String title, String genre, int duration, boolean isAvailable, String comment, String director) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.isAvailable = isAvailable;
        this.comment = comment;
        this.director = director;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public String getComment() {
        return comment;
    }

    public String getDirector() {
        return director;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}