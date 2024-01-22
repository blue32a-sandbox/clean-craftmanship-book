package sort1;

import org.junit.jupiter.api.Test;

import static java.util.Arrays.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortTest {
    @Test
    public void sorted() throws Exception {
        Sorter sorter = new Sorter();
        assertEquals(asList(), sorter.sort(asList()));
        assertEquals(asList(1), sorter.sort(asList(1)));
        assertEquals(asList(1, 2), sorter.sort(asList(1, 2)));
        assertEquals(asList(1, 2), sorter.sort(asList(2, 1)));
        assertEquals(asList(1, 2, 3), sorter.sort(asList(1, 2, 3)));
        assertEquals(asList(1, 2, 3), sorter.sort(asList(2, 1, 3)));
        assertEquals(asList(1, 2, 3), sorter.sort(asList(1, 3, 2)));
        assertEquals(asList(1, 2, 3), sorter.sort(asList(3, 2, 1)));
        assertEquals(
                asList(1, 1, 2, 3, 3, 3, 4, 5, 5, 5, 6, 7, 8, 9, 9, 9),
                sorter.sort(asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9, 3)));
    }
}
