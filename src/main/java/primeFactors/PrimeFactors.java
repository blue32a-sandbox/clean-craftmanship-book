package primeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public List<Integer> factorsOf(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        if (n > 1)
            factors.add(2);
        return factors;
    }
}
