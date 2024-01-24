package videoStore;

public class Rental {
    private int days;
    private Movie movie;

    public Rental(String title, int days) {
        this.days = days;
        movie = VideoRegistry.getMovie(title);
    }

    public String getTitle() {
        return movie.getTitle();
    }

    public int getFee() {
        return movie.getFee(days, this);
    }

    public int getPoints() {
        return movie.getPoints(days, this);
    }
}
