package sort1;

import java.util.ArrayList;
import java.util.List;

public class Sorter {
    public List<Integer> sort(List<Integer> list) {
        if (list.size() > 1) {
            int firstIndex = 0;
            int secondIndex = 1;
            if (list.get(firstIndex) > list.get(secondIndex)) {
                int first = list.get(firstIndex);
                int second = list.get(secondIndex);
                list.set(firstIndex, second);
                list.set(secondIndex, first);
            }
        }
        return list;
    }
}
