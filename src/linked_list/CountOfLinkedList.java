package linked_list;

public class CountOfLinkedList {
    public int countOfLinkedList(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        // Create Solution object
        CountOfLinkedList count = new CountOfLinkedList();
        System.out.println("Count of LinkedList, Size()--> " + count.countOfLinkedList(head));
    }
}
