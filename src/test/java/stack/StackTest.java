package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    @Test
    public void canCreateStack() throws Exception {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
    }
    @Test
    public void canPush() throws Exception {
        Stack stack = new Stack();
        stack.push(0);
        assertFalse(stack.isEmpty());
    }
}
