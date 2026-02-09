package stack;

public class StackArray {
    private int[] stackArray;
    private int capacity;
    private int topIndex;

    public StackArray(int size) {
        capacity = size;
        stackArray = new int[capacity];
        topIndex = -1;
    }

    public StackArray() {
        this(1000);
    }

    public void push(int x) {
        if (topIndex >= capacity - 1) {
            System.out.println("Stack Over flow");
        }
        stackArray[++topIndex] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stackArray[topIndex--];
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stackArray[topIndex];
    }

    public boolean isEmpty() {
        return capacity == -1;
    }

    public static void main(String[] args) {

    }
}
