package stack;

public class ArrayQueue {
    int[] arr;
    int start, end;
    int currSize, maxSize;

    public ArrayQueue() {
        start = -1;
        end = -1;
        currSize = 0;
        maxSize = 10;
        arr = new int[maxSize];
    }

    public void push(int x) {
        if (currSize == 0) {
            System.out.println("Queue is Empty");
            return;
        }
        if (end == -1) {
            start = 0;
            end = 0;
        } else {
            end = (end + 1) % maxSize;
        }
        arr[end] = x;
        currSize++;
    }

    public int pop() {
        if (start == -1) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int popped = arr[start];
        if (currSize == 1) {
            start = -1;
            end = -1;
        } else {
            start = (start + 1) % maxSize;
        }
        currSize--;
        return popped;
    }

    public int peek() {
        if (start == -1) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[start];
    }


    public static void main(String[] args) {

    }
}
