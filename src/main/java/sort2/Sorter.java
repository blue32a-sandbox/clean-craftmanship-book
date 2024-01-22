package sort2;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

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
            int first = list.get(0);
            int middle = list.get(1);
            int last = list.get(2);
            List<Integer> lessers = new ArrayList<>();
            List<Integer> greaters = new ArrayList<>();

            if (first < middle)
                lessers.add(first);
            if (last < middle)
                lessers.add(last);
            if (first > middle)
                greaters.add(first);
            if (last > middle)
                greaters.add(last);

            List<Integer> result = new ArrayList<>();
            result.addAll(lessers);
            result.add(middle);
            result.addAll(greaters);
            return result;
        }
    }
}
