package linked_list;

public class InsertHead {
    public Node insertHead(int data, Node next) {
        return new Node(data, next);
    }

    public void printListNode(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        InsertHead newNode = new InsertHead();

        Node head = new Node(2);
        head.next = new Node(4);

        Node newHead = newNode.insertHead(6, head);
        newNode.printListNode(newHead);
    }
}
