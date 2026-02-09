package linked_list;

public class SearchElementOFLL {
    public boolean serachElementInLL(Node head, int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        SearchElementOFLL searchElementOFLL = new SearchElementOFLL();
        System.out.println("SeachElementOfLL ----> " + searchElementOFLL.serachElementInLL(head, 25));
    }
}
