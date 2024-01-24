package videoStore;

public class RegularMovie extends Movie {
    public RegularMovie(String title) {
        super(title);
    }

    public int getFee(int days, Rental rental) {
        return applyGracePeriod(150, days, 3);
    }

    public int getPoints(int days, Rental rental) {
        return applyGracePeriod(1, days, 3);
    }
}
