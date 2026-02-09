package linked_list;

public class DoublyNode {
    int data;
    DoublyNode next;
    DoublyNode prev;

    public DoublyNode (int data, DoublyNode next,DoublyNode prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public DoublyNode (int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        DoublyNode doublyNode = new DoublyNode(arr[0]);
        System.out.println("Double LinkList is created, " + doublyNode.data);
    }
}
