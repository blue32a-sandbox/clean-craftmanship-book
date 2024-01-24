package videoStore;

import java.util.ArrayList;
import java.util.List;

import static videoStore.VideoRegistry.*;
import static videoStore.VideoRegistry.VideoType.*;

public class Customer {
    private List<Rental> rentals = new ArrayList<>();

    public void addRental(String title , int days) {
        rentals.add(new Rental(title, days));
    }

    public int getRentalFee() {
        int fee = 0;
        for (Rental rental : rentals) {
            fee += feeFor(rental);
        }
        return fee;
    }

    private int feeFor(Rental rental) {
        int fee = 0;
        if (getType(rental.title) == REGULAR)
            fee += applyGracePeriod(150, rental.days, 3);
        else
            fee += rental.days * 100;
        return fee;
    }

    public int getRenterPoints() {
        int points = 0;
        for (Rental rental : rentals) {
            points += pointsFor(rental);
        }
        return points;
    }

    private int pointsFor(Rental rental) {
        int points = 0;
        if (getType(rental.title) == REGULAR)
            points += applyGracePeriod(1, rental.days, 3);
        else
            points++;
        return points;
    }

    private int applyGracePeriod(int amount, int days, int grace) {
        if (days > grace)
            return amount + amount * (days - grace);
        return amount;
    }

    public class Rental {
        public String title;
        public int days;
        public VideoType type;

        public Rental(String title, int days) {
            this.title = title;
            this.days = days;
            type = VideoRegistry.getType(title);
        }
    }
}
