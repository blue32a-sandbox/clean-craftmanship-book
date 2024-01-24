package videoStore;

public class ChildrensMovie extends Movie {
    public ChildrensMovie(String title) {
        super(title);
    }

    public int getFee(int days, Rental rental) {
        return days * 100;
    }

    public int getPoints(int days, Rental rental) {
        return 1;
    }
}
