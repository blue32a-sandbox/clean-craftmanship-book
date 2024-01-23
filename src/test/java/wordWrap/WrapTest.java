package wordWrap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WrapTest {
    @Test
    public void testWrap() throws Exception {
        Wrapper wrapper = new Wrapper();
        assertEquals("Four", wrapper.wrap("Four", 7));
        assertEquals("Four\nscore", wrapper.wrap("Four score", 7));
    }
}
