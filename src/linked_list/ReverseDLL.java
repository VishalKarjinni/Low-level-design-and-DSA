package linked_list;

public class ReverseDLL {
    public DoublyNode reverseDLL(DoublyNode head) {
        if (head == null) {
            return null;
        }

        DoublyNode current = head;
        DoublyNode last = null;
        while (current != null) {
            DoublyNode temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            last = current;
            current = temp;
        }
        return last;
    }

    public DoublyNode convertArr2DLL(int[] arr) {

        // Creating the head of the DLL using the first array element
        DoublyNode head = new DoublyNode(arr[0]);

        // Initializing previous pointer to head
        DoublyNode prev = head;

        // Loop through rest of the array to construct DLL
        for (int i = 1; i < arr.length; i++) {

            // Create new node with current value, null next, and prev back pointer
            DoublyNode temp = new DoublyNode(arr[i], null, prev);

            // Connect previous node's next to this new node
            prev.next = temp;

            // Move prev to this new node
            prev = temp;
        }

        // Return the head of the constructed DLL
        return head;
    }

    public void printDLL(DoublyNode head) {

        // Traverse till end
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ReverseDLL reverseDLL = new ReverseDLL();
        DoublyNode doublyNode = reverseDLL.convertArr2DLL(arr);
        reverseDLL.printDLL(doublyNode);
        DoublyNode doublyNode1 = reverseDLL.reverseDLL(doublyNode);
        reverseDLL.printDLL(doublyNode1);
    }
}
