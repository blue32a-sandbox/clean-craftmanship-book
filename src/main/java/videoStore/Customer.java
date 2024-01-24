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

    public class Rental {
        private String title;
        private int days;
        private VideoType type;

        public Rental(String title, int days) {
            this.title = title;
            this.days = days;
            type = VideoRegistry.getType(title);
        }

        public String getTitle() {
            return title;
        }

        public int getDays() {
            return days;
        }

        public VideoType getType() {
            return type;
        }

        public int getFee() {
            int fee = 0;
            if (getType() == REGULAR)
                fee += applyGracePeriod(150, getDays(), 3);
            else
                fee += getDays() * 100;
            return fee;
        }

        public int getPoints() {
            int points = 0;
            if (getType() == REGULAR)
                points += applyGracePeriod(1, getDays(), 3);
            else
                points++;
            return points;
        }

        private static int applyGracePeriod(int amount, int days, int grace) {
            if (days > grace)
                return amount + amount * (days - grace);
            return amount;
        }
    }
}
