package sort2;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.*;

public class Sorter {
    public List<Integer> sort(List<Integer> list) {
        if (list.size() <= 1)
            return list;
        else if (list.size() == 2) {
            int first = list.get(0);
            int second = list.get(1);
            if (first > second)
                return asList(second, first);
            else
                return asList(first, second);
        }
        else {
            int middle = list.get(0);
            List<Integer> lessers = list.stream().filter(x -> x < middle).collect(toList());
            List<Integer> greaters = list.stream().filter(x -> x > middle).collect(toList());

            List<Integer> result = new ArrayList<>();
            result.addAll(sort(lessers));
            result.add(middle);
            result.addAll(sort(greaters));
            return result;
        }
    }
}
