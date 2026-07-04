package DSA_Rev;

class DLinkedList {
    // 1.What is Doubly Linked List?
    // A Doubly Linked List is a linear data structure where elements are stored in
    // nodes.

    // 2.Why Doubly Linked List?
    // Unlike Singly Linked List Doubly Linked List has a prev pointer which gives
    // prev node address of the current node.
    // null<-[1]<->[2]<->[3]->null
    // here for ex. for node 2 its next is 3 and prev is 1.

    // 3.How to create a DLL?
    public class Node {
        int data;
        Node next;
        Node prev; // prev node

        Node(int data) {
            this.data = data;
            this.next = null; // initially both next and prev null:
            this.prev = null; // null<-[]->null
        }
    }

    // 4. Head and tail in DLL:
    public Node head;
    public Node tail;
    public int size;

    // 5.How to print DLL?
    public void printDLL() {
        if (head == null) {
            System.out.println("DLL is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // 6.How to add node at the head in the DLL?
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // 7.How to add node at the end in the DLL?
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // 8.How to remove node from the start of the DLL?
    public int removeFirst() {
        if (head == null) {
            System.out.println("DLL is empty.");
            return -1;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    // 9.How to remove node from the end of the DLL?
    public int removeLast() {
        if (head == null) {
            System.out.println("DLL is empty.");
            return -1;
        }

        if (size == 1) {
            int val = tail.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    public static void main(String args[]) {
        DLinkedList dll = new DLinkedList();

        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(3);
        dll.addLast(4);

        dll.printDLL(); // 1<->2<->3<->4<->null
        System.out.println(dll.size); // 4

        dll.removeFirst();
        dll.printDLL(); // 2<->3<->4<->null

        dll.removeLast();
        dll.printDLL(); // 2<->3<->null

        System.out.println(dll.size); // 2
    }
}