package DSA_Rev;

import java.util.*;

class Main {
      public static void main(String[] args) {
            // 1.What is ArrayList?
            // An ArrayList is a class in Java that stores multiple elements in a dynamic
            // array.
            // Array-> fixed size
            // ArrayList->Dynamic size
            // Array-> Primitive data types can be stored
            // ArrayList-> cannot store primitive data

            // 2.How to define ArrayList:
            // ArrayList<dataType> name = new ArrayList<>();
            ArrayList<Integer> list = new ArrayList<>();
            // ArrayList<Float> list2 = new ArrayList<>();
            // ArrayList<Boolean> list3 = new ArrayList<>();
            // ArrayList<String> list4 = new ArrayList<>();

            // 3.How to get size of the ArrayList:
            // .size() method -O(1)
            System.out.println(list.size()); // intially 0

            // 4.How to add element in ArrayList: .add() method
            // 4.1 Add at the end - O(1)
            list.add(1);
            list.add(2);
            // 4.2 Add at specefic index - O(n)
            list.add(2, 100);
            list.add(99);
            list.add(40);
            System.out.println(list);

            // 5.How to get element from arrayList: .get() method - O(1)
            int ele = list.get(2);
            System.out.println(ele);

            // 6.How to remove element from the arrayList: .remove() method - O(n)
            list.remove(2);
            System.out.println(list);

            // 7.How to replace an element from the arrayList: .set() method - O(n)
            list.set(1, 200);
            System.out.println(list);

            // 8.How to check wheather element present in arrayList or not: .contains()
            // method - O(n)
            boolean ele2 = list.contains(100);
            boolean ele3 = list.contains(200);
            System.out.println(ele2 + " " + ele3);

            // 9.How to print elements from the arrayList:
            for (int i = 0; i < list.size(); i++) {
                  System.out.print(list.get(i) + " ");
            }
            System.out.println();

            // 10.How to sort arrayList: Collections classs-> Collections.sort();
            // 10.1 Acending Sorting: O(nlogn)
            Collections.sort(list);
            System.out.println(list);
            // 10.2 Decending Sorting: O(nlogn)
            Collections.sort(list, Collections.reverseOrder());
            System.out.println(list);

            // Questions by AC:
            // 1.print reverse of the arraylist: O(n) + O(1)
            ArrayList<Integer> revrese = new ArrayList<>();
            revrese.add(1);
            revrese.add(2);
            revrese.add(4);
            revrese.add(8);
            revrese.add(16);
            for (int i = revrese.size() - 1; i >= 0; i--) {
                  System.out.print(revrese.get(i) + " ");
            }
            System.out.println();

            // 2.largest number in arrayList: O(n) + O(1)
            int largest = revrese.get(0);
            for (int i = 0; i < revrese.size(); i++) {
                  if (largest < revrese.get(i)) {
                        largest = revrese.get(i);
                  }
            }
            System.out.println(largest);

            // 3.swap two numbers - O(1) + O(1)
            ArrayList<Integer> swap = new ArrayList<>();
            swap.add(10);
            swap.add(20);
            swap.add(30);
            swap.add(40);
            int idx1 = 1;
            int idx2 = 3;

            int temp = swap.get(idx1);
            swap.set(idx1, swap.get(idx2));
            swap.set(idx2, temp);

            System.out.println(swap);
            System.out.println();

            // 10.How to sort arrayList: Collections classs-> Collections.sort();
            // 10.1 Acending Sorting: O(nlogn)
            Collections.sort(list);
            System.out.println(list);
            // 10.2 Decending Sorting: O(nlogn)
            Collections.sort(list, Collections.reverseOrder());
            System.out.println(list);

            // Questions by AC:
            // 1.print reverse of the arraylist: O(n) + O(1)
            ArrayList<Integer> revrese2 = new ArrayList<>();
            revrese.add(1);
            revrese.add(2);
            revrese.add(4);
            revrese.add(8);
            revrese.add(16);
            for (int i = revrese2.size() - 1; i >= 0; i--) {
                  System.out.print(revrese2.get(i) + " ");
            }
            System.out.println();

      }
}