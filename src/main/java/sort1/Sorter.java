package sort1;

import java.util.ArrayList;
import java.util.List;

public class Sorter {
    public List<Integer> sort(List<Integer> list) {
        if (list.size() > 1) {
            for (int limit = list.size() - 1; limit > 0; limit--) {
                for (int firstIndex = 0; firstIndex < limit; firstIndex++) {
                    int secondIndex = firstIndex + 1;
                    if (list.get(firstIndex) > list.get(secondIndex)) {
                        int first = list.get(firstIndex);
                        int second = list.get(secondIndex);
                        list.set(firstIndex, second);
                        list.set(secondIndex, first);
                    }
                }
            }
        }
        return list;
    }
}
