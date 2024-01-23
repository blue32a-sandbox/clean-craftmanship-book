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
        assertWrapped("Four", 7, "Four");
        assertWrapped("Four score", 7, "Four\nscore");
        assertWrapped("Four score and seven years ago our", 7, "Four\nscore\nand\nseven\nyears\nago our");
    }
}
