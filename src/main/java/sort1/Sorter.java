package sort1;

import java.util.ArrayList;
import java.util.List;

public class Sorter {
    public List<Integer> sort(List<Integer> list) {
        if (list.size() > 1) {
            if (list.get(0) > list.get(1)) {
                int first = list.get(0);
                int second = list.get(1);
                list.set(0, second);
                list.set(1, first);
            }
        }
        return list;
    }
}
