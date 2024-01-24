package videoStore;

import static videoStore.VideoRegistry.VideoType.*;

public class Customer {
    private String title;
    private int days;

    public void addRental(String title , int days) {
        this.title = title;
        this.days = days;
    }

    public int getRentalFee() {
        if (VideoRegistry.getType(title) == REGULAR)
            return applyGracePeriod(150, 3);
        else
            return 100 * days;
    }

    public int getRenterPoints() {
        if (VideoRegistry.getType(title) == REGULAR)
            return applyGracePeriod(1, 3);
        else
            return 1;
    }

    private int applyGracePeriod(int amount, int grace) {
        if (days > grace)
            return amount + amount * (days - grace);
        return amount;
    }
}
