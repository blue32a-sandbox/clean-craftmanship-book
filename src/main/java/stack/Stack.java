package stack;

public class Stack {
    private int size = 0;
    private int[] elements = new int[2];

    public boolean isEmpty() {
        return size == 0;
    }
    public void push(int element) {
        size++;
        this.elements = element;
    }
    public int pop() {
        if (size == 0)
            throw new Underflow();
        --size;
        return elements;
    }
    public int getSize() {
        return size;
    }
    public class Underflow extends RuntimeException {
    }
}
