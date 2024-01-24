package videoStore;

public class Customer {
    private int days;

    public void addRental(String title , int days) {
        this.days = days;
    }

    public double getRentalFee() {
        double fee = 1.5;
        if (days > 3)
            fee += 1.5 * (days - 3);
        return fee;
    }

    public int getRenterPoints() {
        int points = 1;
        if (days > 3)
            points += (days - 3);
        return points;
    }
}
