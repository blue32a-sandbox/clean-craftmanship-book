package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private Stack stack = new Stack();

    @Test
    public void canCreateStack() throws Exception {
        assertTrue(stack.isEmpty());
    }
    @Test
    public void canPush() throws Exception {
        stack.push(0);
        assertFalse(stack.isEmpty());
    }
}
