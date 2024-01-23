package wordWrap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WrapTest {
    private Wrapper wrapper = new Wrapper();

    private void assertWrapped(String s, int width, String expected) {
        assertEquals(expected, wrapper.wrap(s, width));
    }

    @Test
    public void testWrap() throws Exception {
        assertWrapped("", 1, "");
        assertWrapped("x", 1, "x");
        assertWrapped("xx", 1, "x\nx");
        assertWrapped("xx", 2, "xx");
        assertWrapped("xxx", 1, "x\nx\nx");
        assertWrapped("xxx", 2, "xx\nx");
        assertWrapped("xxx", 3, "xxx");
        assertWrapped("x x", 1, "x\nx");
        assertWrapped("x x", 2, "x\nx");
        assertWrapped("x x", 3, "x x");
        assertWrapped("x x x", 1, "x\nx\nx");
        assertWrapped("x x x", 2, "x\nx\nx");
        assertWrapped("x x x", 3, "x x\nx");
        assertWrapped("x x x", 4, "x x\nx");
        assertWrapped("x x x", 5, "x x x");
        assertWrapped("xx xx", 1, "x\nx\nx\nx");
        assertWrapped("xx xx", 2, "xx\nxx");
        assertWrapped("xx xx", 3, "xx\nxx");
    }
}
