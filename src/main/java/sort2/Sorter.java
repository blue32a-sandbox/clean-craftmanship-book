package sort2;

import java.util.List;

import static java.util.Arrays.asList;

public class Sorter {
    public List<Integer> sort(List<Integer> list) {
        if (list.size() <= 1)
            return list;
        else {
            int first = list.get(0);
            int second = list.get(1);
            if (first > second)
                return asList(second, first);
            else
                return asList(first, second);
        }
    }
}
