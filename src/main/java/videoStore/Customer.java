package videoStore;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private List<Rental> rentals = new ArrayList<>();

    public void addRental(String title , int days) {
        rentals.add(new Rental(title, days));
    }

    public int getRentalFee() {
        int fee = 0;
        for (Rental rental : rentals) {
            fee += rental.getFee();
        }
        return fee;
    }

    public int getRenterPoints() {
        int points = 0;
        for (Rental rental : rentals) {
            points += rental.getPoints();
        }
        return points;
    }
}
