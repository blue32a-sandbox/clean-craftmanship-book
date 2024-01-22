package sort2;

import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortTest {
    @Test
    public void testSort() throws Exception {
        Sorter sorter = new Sorter();
        assertEquals(asList(), sorter.sort(asList()));
        assertEquals(asList(1), sorter.sort(asList(1)));
        assertEquals(asList(1, 2), sorter.sort(asList(1, 2)));
        assertEquals(asList(1, 2), sorter.sort(asList(2, 1)));
        assertEquals(asList(1, 2, 3), sorter.sort(asList(1, 2, 3)));
        assertEquals(asList(1, 2, 3), sorter.sort(asList(2, 1, 3)));
        assertEquals(asList(1, 2, 3), sorter.sort(asList(1, 3, 2)));
        assertEquals(asList(1, 2, 3), sorter.sort(asList(3, 2, 1)));
        assertEquals(asList(1, 2, 3), sorter.sort(asList(2, 3, 1)));
        assertEquals(asList(1, 2, 3), sorter.sort(asList(3, 1, 2)));
        assertEquals(asList(1, 2, 3, 4), sorter.sort(asList(1, 2, 3, 4)));
        assertEquals(asList(1, 2, 3, 4), sorter.sort(asList(2, 1, 3, 4)));
        assertEquals(asList(1, 2, 3, 4), sorter.sort(asList(4, 3, 2, 1)));
    }
}
