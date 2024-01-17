package primeFactors;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.collection.IsEmptyCollection.empty;

public class PrimeFactorsTest {
    @Test
    public void factors() throws Exception {
        PrimeFactors primeFactors = new PrimeFactors();

        assertThat(primeFactors.factorsOf(1), is(empty()));
    }
}
