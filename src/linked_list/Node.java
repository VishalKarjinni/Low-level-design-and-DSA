package linked_list;

public class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node (int data) {
        this.data = data;
        this.next = null;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        Node y = new Node(arr[0]);
        System.out.println(y + " print memory of the reference");

        System.out.println("Print data of linked list, " + y.data);
    }
}
