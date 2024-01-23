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
    }
}
