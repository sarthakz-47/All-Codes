package DSA_Rev;

import java.util.LinkedList;

class SLinkedList {
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
    public static class Node {
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

    // 6.How to add node at start in LL?
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

    // 7.How to add node at the last in LL?
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

    // 8.How to add node in the middle in LL?
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

    // 11.How to remove first node from LL?:
    public int removeFirst() {
        // Step - 1: check if LL is empty:
        if (size == 0) {
            System.out.println("Linked List is empty.");
            return -1;
        }
        // Step - 2: if LL has only one node:
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        // Step - 3: store the value of head node:
        int val = head.data;
        // Step - 4: move head to the next node:
        head = head.next;
        // Step - 5: decrease the size:
        size--;
        // Step - 6: return the removed value:
        return val;
        // TC: O(1)
    }

    // 12.How to remove last node from LL?:
    public int removeLast() {
        // Step - 1: check if LL is empty:
        if (size == 0) {
            System.out.println("Linked List is empty.");
            return -1;
        }
        // Step - 2: if LL has only one node:
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        // Step - 3: create a temporary node to traverse the LL:
        Node temp = head;
        // Step - 4: move temp till the second last node:
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        // Step - 5: store the value of the last node:
        int val = tail.data;
        // Step - 6: make second last node the new tail:
        temp.next = null;
        tail = temp;
        // Step - 7: decrease the size:
        size--;
        // Step - 8: return the removed value:
        return val;
        // TC: O(n)
    }

    // 13.How to search an element in LL?
    public int search(int key) {
        // Step - 1: create a temporary node to traverse the LL:
        Node temp = head;
        // Step - 2: initialize an index counter:
        int idx = 0;
        // Step - 3: traverse the LL until temp becomes null:
        while (temp != null) {
            // Step - 4: check if current node's data matches the key:
            if (temp.data == key) {
                // Step - 5: if found, return its index:
                return idx;
            }
            // Step - 6: move to the next node:
            temp = temp.next;
            // Step - 7: increment the index:
            idx++;
        }
        // Step - 8: if key is not found, return -1:
        return -1;
        // TC: O(n)
    }

    // 14.How to search an element recursively in LL?
    public int helper(Node head, int key) {
        // Step - 1: Base case - if head becomes null,
        // it means the key is not present:
        if (head == null) {
            return -1;
        }
        // Step - 2: If current node contains the key,
        // return index 0:
        if (head.data == key) {
            return 0;
        }
        // Step - 3: Recursively search in the remaining LL:
        int idx = helper(head.next, key);
        // Step - 4: If key is not found in the remaining LL,
        // return -1:
        if (idx == -1) {
            return -1;
        }
        // Step - 5: Otherwise, add 1 to the returned index
        // while backtracking:
        return idx + 1;
    }

    // Step - 6: Call the helper function by passing head:
    public int recSearch(int key) {
        return helper(head, key);
        // TC: O(n) + O(n)
    }

    // 15.How to reverse a LL?
    public void reverse() {

        // Step - 1: create three pointers:
        // prev -> points to previous node (initially null)
        // curr -> points to current node (starts from head)
        // next -> stores the next node temporarily
        Node prev = null;
        Node curr = tail = head;
        Node next;

        // Step - 2: traverse the LL until curr becomes null:
        while (curr != null) {

            // Step - 3: store the next node:
            next = curr.next;

            // Step - 4: reverse the current node's link:
            curr.next = prev;

            // Step - 5: move prev one step ahead:
            prev = curr;

            // Step - 6: move curr one step ahead:
            curr = next;
        }

        // Step - 7: after traversal, prev becomes the new head:
        head = prev;
        // TC: O(n)
        // SC: O(1)
    }

    // 16.How to remove a node form middle?
    public void deleteNthFromEnd(int n) {
        // Step - 1: Find the size of the Linked List:
        int size = 0;
        Node temp = head;
        // Step - 2: Traverse the LL to calculate its size:
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        // Step - 3: If n is equal to size, remove the first node:
        if (n == size) {
            head = head.next;
            return;
        }
        // Step - 4: Find the node just before the node to be deleted from start:
        int i = 1;
        Node prev = head;

        while (i < size - n) {
            prev = prev.next;
            i++;
        }
        // Step - 5: Skip the nth node from the end:
        prev.next = prev.next.next;
        return;
        // TC: O(n)
    }

    // 17.How to check if LL is palindrome or not?
    public Node mid(Node head) {
        // Step - 1: Assign slow and fast pointer to the start of the LL:
        Node slow = head;
        Node fast = head;

        // Step - 2: move the pointers untill fast becomes null in odd or even case:
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step - 3: return the node which is currenly at slow pointer which is a ->
        // middle node of LL:
        return slow;
    }

    public boolean isPalindrome() {
        // Step - 1 : check if LL has single element or empty:
        if (head == null || head.next == null) {
            return true;
        }

        // Step - 2: get the middle element of the LL:
        Node midElement = mid(head);

        // Step - 3: reverse the second part of the LL, from mid to end:
        Node prev = null;
        Node curr = midElement;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step - 4: initialize two pointers to track the data:
        Node left = head;
        Node right = prev;

        // Step - 5: check if the first part and second part is equal or not:
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }
    // 18.How to get size of the LL?
    // 18.1 Maintain a variable which is static in nature (line: 42)
    // 18.2 Whenever you insert node in LL -> size++ (line:)
    // 18.3 Whenever you remove node in LL -> size--
    // 18.4 Else, you can make own fnx (line:273)

    // 19.How to detect cycle in LL?
    public boolean isCycle() {
        // Step - 1: Assign slow and fast pointer to the start of the LL:
        Node slow = head;
        Node fast = head;
        // Step - 2: Move the fast pointer 2x slow pointer, untill fast pointer becomes
        // null:
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // Step - 3: at some point if the fast pointer meets slow pointer then it is a
            // cycle:
            if (fast == slow) {
                return true;
            }
        }
        // Step - 4 : no cycle found:
        return false;
    }

    // 20.How to remove cycle in LL?
    public void removeCycle() {
        // Step - 1: Check wheather there is cycle or not:
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                isCycle = true;
                break;
            }
        }

        // Step - 2: if no cycle found then return:
        if (isCycle) {
            return;
        }

        // Step - 3: if cycle found:
        // Step - 3.1: Find the meeting point of both pointers
        // Step - 3.2: move slow to start of the LL:
        // Step - 3.3: assign a prev value to track the last node of the cycle:
        slow = head;
        Node prev = null;

        // Step - 4: move forward till the slow and fast pointer meets:
        while (slow != fast) {
            // Step - 5: move or assign prev to fast as fast will move forward:
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // Step - 6: now we are on last node of the cycle now make prev next to null:
        prev.next = null;
    }

    // 21.How to sort LL using Merge Sort:
    public Node mergeSort(Node head) {
        // check if no element or only one element:
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getMid(head);
        Node right = mid.next;
        mid.next = null;

        // left & right MS
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(right);

        // merge
        return merge(newLeft, newRight);
    }

    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public Node merge(Node left, Node right) {
        // create a temp LL:
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (left != null && right != null) {
            if (left.data <= right.data) {
                temp.next = left;
                left = left.next;
                temp = temp.next;
            } else {
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
        }

        while (left != null) {
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }

        while (right != null) {
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public void ZigZag() {
        // find mid:
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // reverse second half:
        Node curr = mid.next;
        mid.next = null;

        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;
        // megrge zigzag:
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public static void main(String[] args) {
        SLinkedList ll = new SLinkedList();
        ll.addFirst(10); // 10->null
        ll.addFirst(20); // 20->10->null

        ll.addLast(50); // 20->10->50->null
        ll.addLast(60); // 20->10->50->60->null

        ll.addMid(100, 2); // 20->10->100->50->60->null

        // ll.removeFirst();
        // ll.removeLast();
        ll.printLL();
        System.out.println(ll.search(50));
        System.out.println(ll.recSearch(2));

        // ll.reverse();
        // ll.printLL();
        System.out.println(ll.size);

        SLinkedList ll2 = new SLinkedList();
        ll2.addFirst(1);
        ll2.addLast(2);
        ll2.addLast(2);
        ll2.addLast(1);
        System.out.println(ll2.isPalindrome());

        ll.head = new Node(1);
        ll.head.next = new Node(2);
        ll.head.next.next = new Node(2);
        ll.head.next.next.next = ll.head;
        System.out.println(ll.isCycle());

        // How to create a SLinkedList:
        LinkedList<Integer> LL = new LinkedList<>();
        // How to add nodes in LL:
        LL.addLast(1);
        LL.addLast(2);
        LL.addFirst(3);
        // How to print SLinkedList:
        System.out.println(LL);
        // How to remove nodes in LL:
        LL.removeLast();
        LL.removeFirst();
        System.out.println(LL);
        System.out.println(LL.getLast());
        System.out.println(LL.size());

        // Merge sort:
        SLinkedList ll3 = new SLinkedList();
        ll3.addFirst(5);
        ll3.addFirst(1);
        ll3.addFirst(3);
        ll3.addFirst(4);
        ll3.printLL();
        ll3.head = ll3.mergeSort(ll3.head);
        ll3.printLL();

        SLinkedList ll4 = new SLinkedList();
        ll4.addFirst(6);
        ll4.addFirst(5);
        ll4.addFirst(4);
        ll4.addFirst(3);
        ll4.addFirst(2);
        ll4.addFirst(1);
        ll4.ZigZag();
        ll4.printLL();
    }

}