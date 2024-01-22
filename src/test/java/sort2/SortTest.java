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
    }
}
