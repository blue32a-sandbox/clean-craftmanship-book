package videoStore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
    private Customer customer;

    @BeforeEach
    public void setUp() throws Exception {
        customer = new Customer();
    }

    private void assertFeeAndPoints(double fee, int points) {
        assertEquals(fee, customer.getRentalFee(), 0.001);
        assertEquals(points, customer.getRenterPoints());
    }

    @Test
    public void RegularMovie_OneDay() throws Exception {
        customer.addRental("RegularMovie", 1);
        assertFeeAndPoints(1.5, 1);
    }
}
