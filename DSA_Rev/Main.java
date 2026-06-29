package DSA_Rev;

class LinkedList {
    // 1.What is Linked List?
    // A Linked List is a linear data structure where elements are stored in nodes.

    // 2.What isn nodes in LL?
    // Each node contains:
    // Data
    // Address (reference) of the next node

    // 3.Why LL?
    // Unlike arrays:
    // Memory is not contiguous.
    // Size can grow dynamically.
    // Insertion/deletion is easier.
    // data data data
    // ---- -> ------ -> ----- -> null
    // next(ref) next (ref) next(ref)

    // 4.How to create a Node in LL?
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // When we write:
    // Node n = new Node(5);
    // it becomes:
    // +--------+
    // | data=5 |
    // | next --|----> null
    // +--------+

    // 5.Head and Tail in LL?
    Node head;
    Node tail;
    int size; // (ps: line: 125)
    // initially:
    // head -> null && tail -> null when LL is empty.

    // 6.How to add elements at start in LL?
    public void addFirst(int data) {
        // Step - 1 : create a new node:
        Node newNode = new Node(data);
        size++;
        // Step - 2: check if LL is empty:
        if (head == null) {
            // Step 3: if yes, then assign head and tail to newNode and return:
            head = tail = newNode;
            return;
        }
        // Step - 4: if no, then assign newNode's next points to head:
        newNode.next = head;
        // Step - 5: now, assign head to newNode
        head = newNode;
        // TC: O(1)
    }

    // 7.How to add elements at the last in LL?
    public void addLast(int data) {
        // Step - 1 : create a new node:
        Node newNode = new Node(data);
        size++;
        // Step - 2: check if LL is empty:
        if (head == null) {
            // Step 3: if yes, then assign head and tail to newNode and return:
            head = tail = newNode;
            return;
        }
        // Step - 3: if no, then assign current tail's next to the newNode:
        tail.next = newNode;
        // Step - 4: now, assign tail to newNode:
        tail = newNode;
    }

    // 8.How to add in the middle in LL?
    public void addMid(int data, int idx) {

        // Step - * : if index is 0, insert at beginning:
        if (idx == 0) {
            addFirst(data);
            return;
        }
        // Step - 1: create a new node:
        Node newNode = new Node(data);
        size++;
        // Step - 2: create a temporary node to traverse the LL:
        Node temp = head;
        // Step - 3: initialize a counter:
        int i = 0;

        // Step - 4: move temp until it reaches the node before the given index:
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // Step - 5: make newNode point to the next node of temp:
        newNode.next = temp.next;
        // Step - 6: make temp point to the newNode:
        temp.next = newNode;
        // TC: O(n)
    }

    // 9.How to print LL?
    public void printLL() {
        // Step - 1: create a temp node to traverse through the LL:
        Node temp = head;
        // Step - 2: check if LL is empty:
        if (temp == null) {
            System.out.println("Linked List is Empty.");
            return;
        }
        // Step - 3: if not, untill temp becomes null:
        while (temp != null) {
            // Step - 4: print data at temp node:
            System.out.print(temp.data + "->");
            // Step - 5: move temp node points to next node:
            temp = temp.next;
        }
        System.out.println("null");
    }

    // 11.Remove First in LL:
    // 12.Remoce Last in LL:
    // 13.How to get size of the LL?
    // 13.1 Maintain a variable which is static in nature (line: 42)
    // 13.2 Whenever you insert node in LL -> size++ (line:)
    // 13.3 Whenever you remove node in LL -> size--
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(10); // 10->null
        ll.addFirst(20); // 20->10->null

        ll.addLast(50); // 20->10->50->null
        ll.addLast(60); // 20->10->50->60->null

        ll.addMid(100, 2); // 20->10->100->50->60->null
        ll.printLL();
        System.out.println(ll.size);
    }

}