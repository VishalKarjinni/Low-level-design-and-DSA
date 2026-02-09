package linked_list;

public class DeleteTail {
    public DoublyNode deleteTail(DoublyNode head) {
        if (head == null && head.next == null) {
            return null;
        }
        DoublyNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp = temp.prev;
        temp.next = null;
        return head;

    }
    public static void main(String[] args) {
        DoublyNode head = new DoublyNode(1);
        head.next = new DoublyNode(2);
        head.next.prev = head;
        head.next.next = new DoublyNode(3);
        head.next.next.prev = head.next;
        DeleteTail deleteTail = new DeleteTail();
        DoublyNode doublyNode = deleteTail.deleteTail(head);
        while (doublyNode != null) {
            System.out.print(doublyNode.data + " ---> ");
            doublyNode = doublyNode.next;
        }
    }
}
