package stack;

public class Stack {
    private boolean empty = true;
    public boolean isEmpty() {
        return empty;
    }
    public void push(int element) {
        empty = false;
    }
}
