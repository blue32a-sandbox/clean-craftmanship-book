package primeFactors;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

public class PrimeFactorsTest {
    @Test
    public void factors() throws Exception {
        PrimeFactors primeFactors = new PrimeFactors();

        assertThat(primeFactors.factorsOf(1), is(empty()));
        assertThat(primeFactors.factorsOf(2), contains(2));
        assertThat(primeFactors.factorsOf(3), contains(3));
        assertThat(primeFactors.factorsOf(4), contains(2, 2));
        assertThat(primeFactors.factorsOf(5), contains(5));
        assertThat(primeFactors.factorsOf(6), contains(2, 3));
        assertThat(primeFactors.factorsOf(7), contains(7));
        assertThat(primeFactors.factorsOf(8), contains(2, 2, 2));
        assertThat(primeFactors.factorsOf(9), contains(3, 3));
        assertThat(primeFactors.factorsOf(2 * 2 * 3 * 3 * 5 * 7 * 11 * 11 * 13), contains(2, 2, 3, 3, 5, 7, 11, 11, 13));
    }
}
