package linked_list;

public class ConvertArrayToDLL {
    public DoublyNode convertArrayToDLL (int[] arr) {
        DoublyNode head = new DoublyNode(arr[0]);
        DoublyNode prev = head;
        for (int i = 1; i < arr.length; i++) {
            DoublyNode temp = new DoublyNode(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public DoublyNode insertLLTail(int k, DoublyNode head) {
        DoublyNode tailNode = new DoublyNode(k);
        DoublyNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = tailNode;
        tailNode.prev = temp;
        tailNode.next = null;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        ConvertArrayToDLL arrayToDLL = new ConvertArrayToDLL();
        DoublyNode doublyNode = arrayToDLL.convertArrayToDLL(arr);
        DoublyNode doublyNode1 = arrayToDLL.insertLLTail(10, doublyNode);
        while (doublyNode1 != null) {
            System.out.print(doublyNode1.data + " ------> ");
            doublyNode1 = doublyNode1.next;
        }
    }
}
