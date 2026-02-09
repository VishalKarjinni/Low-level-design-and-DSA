package stack;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStack {
    Queue<Integer> q = new LinkedList<>();

    public void push(int x) {
        int s = q.size();
        q.add(x);
        for (int i = 0; i < s; i++) {
            q.add(q.poll());
        }
    }

    public int pop() {
        int x = q.peek();
        q.poll();
        return x;
    }

    public int top() {
        return q.peek();
    }

    public boolean isEmpty() {
        return q.isEmpty();
    }

    public static void main(String[] args) {

    }
}
