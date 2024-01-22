package sort2;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.*;

public class Sorter {
    public List<Integer> sort(List<Integer> list) {
        List<Integer> result = new ArrayList<>();

        if (list.size() == 0)
            return result;
        else {
            int middle = list.get(0);
            List<Integer> middles = list.stream().filter(x -> x == middle).collect(toList());
            List<Integer> lessers = list.stream().filter(x -> x < middle).collect(toList());
            List<Integer> greaters = list.stream().filter(x -> x > middle).collect(toList());

            result.addAll(sort(lessers));
            result.addAll(middles);
            result.addAll(sort(greaters));
            return result;
        }
    }
}
