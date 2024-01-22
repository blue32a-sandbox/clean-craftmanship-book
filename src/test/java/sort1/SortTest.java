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
    }
}
