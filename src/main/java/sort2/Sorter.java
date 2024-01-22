package sort2;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.*;

public class Sorter {
    public List<Integer> sort(List<Integer> list) {
        if (list.size() <= 1)
            return list;
        else {
            int middle = list.get(0);
            List<Integer> middles = list.stream().filter(x -> x == middle).collect(toList());
            List<Integer> lessers = list.stream().filter(x -> x < middle).collect(toList());
            List<Integer> greaters = list.stream().filter(x -> x > middle).collect(toList());

            List<Integer> result = new ArrayList<>();
            result.addAll(sort(lessers));
            result.addAll(middles);
            result.addAll(sort(greaters));
            return result;
        }
    }
}
