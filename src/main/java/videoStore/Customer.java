package videoStore;

public class Customer {
    private String title;
    private int days;

    public void addRental(String title , int days) {
        this.title = title;
        this.days = days;
    }

    public int getRentalFee() {
        if (title.equals("RegularMovie"))
            return applyGracePeriod(150, 3);
        else
            return 100;
    }

    public int getRenterPoints() {
        return applyGracePeriod(1, 3);
    }

    private int applyGracePeriod(int amount, int grace) {
        if (days > grace)
            return amount + amount * (days - grace);
        return amount;
    }
}
