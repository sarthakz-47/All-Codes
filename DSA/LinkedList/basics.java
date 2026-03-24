// Online Java Compiler
// Use this editor to write, compile and run your Java code online
package DSA.LinkedList;

class Main {
    // 1: LL node structure:
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // 2:Head & Tail & size in LL:
    // 2.1: Head means first node of the LL:
    Node head = null;
    // 2.2: Tail means last node whose next is null in the LL:
    Node tail = null;
    // 2.3: size calculates nodes in LL:
    int size = 0;

    // 3. Add first in LL:
    public void addFirst(int data) {
        // Step 1: Create a new to be added node always:
        Node newNode = new Node(data);

        // condition: when my LL is empty:
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        // Step 2: Make the next pointer of newNode pointing to head:
        newNode.next = head;

        // Step 3: Update the old head with newNode:
        head = newNode;

        // Step 4: increase the size of the LL:
        size++;
    }

    // 4. Add last in LL:
    public void addLast(int data) {
        // Step 1: Create a new to be added node always:
        Node newNode = new Node(data);

        // condition: when my LL is empty:
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        // Step 2: Make the next pointer of last node pointing to newNode:
        tail.next = newNode;

        // Step 3: Update the old tail with newNode;
        tail = newNode;

        // Step 4: increase the size of the LL:
        size++;
    }

    public void print() {
        // Step 1: create a temp node to traverse through the LL:
        Node temp = head;

        // Step 2: print the data in LL untill temp becomes null:
        while (temp != null) {
            // Step 3: print the data stored in temp.data:
            System.out.print(temp.data + "->");
            // Step 4: move the temp pointer to next element:
            temp = temp.next;
        }

        // print null if nothing is in LL:
        System.out.print("null");

    }

    public void add(int idx, int data) {
        // condtion: if we want to insert at first idx:
        if (idx == 0) {
            addFirst(data);
            return;
        }

        // Step 1: create a new node to be added in LL:
        Node newNode = new Node(data);

        // Step 2: create a temp node to traverse through the LL:
        Node temp = head;
        int i = 0;

        // Step 3: we need one node before the inserting pos(if tar is i=2 then stop at
        // i=1 because we have to insert node at 1->newNode->2):
        while (i < idx - 1) {
            // simply move forword:
            temp = temp.next;
            i++;
        }

        // Step 4: point the next of newNode to next poineter of temp node:
        newNode.next = temp.next;

        // Step 5: now point the temp nodes next pointer to newNode:
        temp.next = newNode;

        // Step 6: increase the size of the LL:
        size++;
    }

    public int removeFirst() {
        // condition: if no nodes are there in LL:
        if (size == 0) {
            System.out.print("LL is empty!");
            return Integer.MIN_VALUE;
        }
        // condition: when there is only one node in LL:
        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        // Step 1: create a val variable to store data at head:
        int val = head.data;

        // Step 2: move the head to next node:
        head = head.next;

        // Step 3: increase the size of the LL:
        size--;

        // Step 4: return the data stored at head:
        return val;
    }

    public int removeLast() {
        // condition: if no nodes are there in LL:
        if (size == 0) {
            System.out.print("LL is empty!");
            return Integer.MIN_VALUE;
        }
        // condition: when there is only one node in LL:
        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        // Step 1:create a temp node to traverse through the LL:
        Node temp = head;

        // Step 2: move temp node till the second last node of the LL:
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }

        // when we reach at second last node:
        // Step 3: store the value at last node:
        int val = tail.data;

        // Step 4: make the second last node pointing to null:
        temp.next = null;

        // Step 5: update the tail from last node to second last node:
        tail = temp;

        // Step 6: update the size:
        size--;

        return val;
    }

    public int searchIterative(int key) {

        // Step 1: make a temp node to traverse through the LL:
        int idx = 0;
        Node temp = head;

        // Step 2: traverse through LL untill temp becomes null or LL becomes empty:
        while (temp != null) {
            // condition: if key matches curr temp.data then return idx of curr temp node:
            if (key == temp.data) {
                return idx;
            }
            // else: move the temp node to next position:
            temp = temp.next;
            idx++;
        }

        return -1;
    }

    public static void main(String[] args) {
        Main ll = new Main();
        ll.addFirst(1);
        ll.addLast(2);
        ll.add(1, 3);

        System.out.print("Linked List: ");
        ll.print();
        System.out.println();

        // System.out.print("Size of the LL: "+ll.size);
        // System.out.println();

        // System.out.println("first removed node: "+ll.removeFirst());
        // System.out.print("LL after removing first node: ");
        // ll.print();
        // System.out.println();

        // System.out.println("last removed node: "+ll.removeLast());
        // System.out.print("LL after removing last node: ");
        // ll.print();
        // System.out.println();

        int key = 3;
        System.out.println(key + " node found at idx: " + ll.searchIterative(key));
    }
}