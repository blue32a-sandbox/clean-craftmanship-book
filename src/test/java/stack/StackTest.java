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
    public void afterOnePush_isNotEmpty() throws Exception {
        stack.push(0);
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.getSize());
    }
    @Test
    public void afterOnePushAndOnePop_isEmpty() throws Exception {
        stack.push(0);
        stack.pop();
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.getSize());
    }
    @Test
    public void afterTwoPushes_sizeIsTwo() throws Exception {
        stack.push(0);
        stack.push(0);
        assertEquals(2, stack.getSize());
    }
    @Test
    public void poppingEmptyStack_throwsUnderflow() {
        assertThrows(Stack.Underflow.class, () -> stack.pop());
    }
}
