package stack;

public class Stack {
    private int size = 0;
    private int element;
    public boolean isEmpty() {
        return size == 0;
    }
    public void push(int element) {
        size++;
        this.element = element;
    }
    public int pop() {
        if (size == 0)
            throw new Underflow();
        --size;
        return element;
    }
    public int getSize() {
        return size;
    }
    public class Underflow extends RuntimeException {
    }
}
