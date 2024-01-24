package videoStore;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static videoStore.VideoRegistry.VideoType.*;

public class CustomerTest {
    private Customer customer;

    @BeforeAll
    public static void loadRegistry() {
        VideoRegistry.addMovie("RegularMovie", REGULAR);
        VideoRegistry.addMovie("ChildrensMovie", CHILDRENS);
    }

    @BeforeEach
    public void setUp() throws Exception {
        customer = new Customer();
    }

    private void assertFeeAndPoints(int fee, int points) {
        assertEquals(fee, customer.getRentalFee(), 0.001);
        assertEquals(points, customer.getRenterPoints());
    }

    @Test
    public void RegularMovie_OneDay() throws Exception {
        customer.addRental("RegularMovie", 1);
        assertFeeAndPoints(150, 1);
    }

    @Test
    public void RegularMovie_SecondDayFree() throws Exception {
        customer.addRental("RegularMovie", 2);
        assertFeeAndPoints(150, 1);
    }

    @Test
    public void RegularMovie_ThirdDayFree() throws Exception {
        customer.addRental("RegularMovie", 3);
        assertFeeAndPoints(150, 1);
    }

    @Test
    public void RegularMovie_FourDays() throws Exception {
        customer.addRental("RegularMovie", 4);
        assertFeeAndPoints(300, 2);
    }

    @Test
    public void ChildrensMovie_OneDay() throws Exception {
        customer.addRental("ChildrensMovie", 1);
        assertFeeAndPoints(100, 1);
    }

    @Test
    public void ChildrensMovie_FourDays() throws Exception {
        customer.addRental("ChildrensMovie", 4);
        assertFeeAndPoints(400, 1);
    }

    @Test
    public void OneRegularOneChildrens_FourDays() throws Exception {
        customer.addRental("RegularMovie", 4); // $3+2p
        customer.addRental("ChildrensMovie", 4); // $4+1p

        assertFeeAndPoints(700, 3);
    }
}
