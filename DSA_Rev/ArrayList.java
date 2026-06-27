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

            // 11. Arraylist Implementation in java:
            /*
             * Internal Working
             * When an ArrayList is created:
             * ArrayList<Integer> list = new ArrayList<>();
             * 
             * Java creates an internal array.
             * Example:
             * [10,20,30]
             * If array becomes full:
             * [10,20,30]
             * and we add:
             * list.add(40);
             * 
             * Java creates a bigger array:
             * [10,20,30,40]
             * Copies old elements into the new array.
             * This is why ArrayList is called Dynamic Array.
             * 
             * Advantages
             * Dynamic size
             * Easy insertion
             * Built-in methods
             * 
             * Disadvantages
             * Extra memory used
             * Shifting required during insertion/removal
             */

            // 12.Multi Dimensional arrayList:
            ArrayList<Integer> list2 = new ArrayList<>();
            list2.add(1);
            list2.add(2);

            ArrayList<Integer> list3 = new ArrayList<>();
            list3.add(3);
            list3.add(4);

            ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
            mainList.add(list2);
            mainList.add(list3);
            System.out.println(mainList);

            for (int i = 0; i < mainList.size(); i++) {
                  ArrayList<Integer> currList = mainList.get(i);
                  for (int j = 0; j < currList.size(); j++) {
                        System.out.print(currList.get(j) + " ");
                  }
                  System.out.println();
            }

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

            // 4.Container With Most Water:
            // 4.1 Brute Force: O(N^2)
            int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
            System.out.println(maxAreaBF(height));
            // 4.2 Optimal Approach: O(N)
            System.out.println(maxAreaOP(height));

            // 5.Pair Sum:
            // 5.1 Brute Force:
            int[] ps = { 1, 2, 3, 4, 5, 6 };
            int target = 5;
            System.out.println(Arrays.toString(pairSumBF(ps, target)));
            // 5.2 Optimal Solution:
            System.out.println(Arrays.toString(pairSumOP(ps, target)));
      }

      public static int maxAreaBF(int[] arr) {
            int n = arr.length;
            int maxArea = 0;
            for (int i = 0; i < n; i++) {
                  for (int j = i + 1; j < n; j++) {
                        int ht = Math.min(arr[i], arr[j]);
                        int wd = j - i;
                        int currArea = ht * wd;
                        maxArea = Math.max(currArea, maxArea);
                  }
            }
            return maxArea;
      }

      public static int maxAreaOP(int arr[]) {
            int n = arr.length;
            int maxArea = 0;
            int start = 0;
            int end = n - 1;

            while (start < end) {
                  int ht = Math.min(arr[start], arr[end]);
                  int wd = end - start;
                  int currArea = ht * wd;
                  maxArea = Math.max(currArea, maxArea);

                  if (arr[end] > arr[start]) {
                        start++;
                  } else {
                        end--;
                  }
            }
            return maxArea;
      }

      public static int[] pairSumBF(int[] ps, int tar) {
            for (int i = 0; i < ps.length; i++) {
                  for (int j = i + 1; j < ps.length; j++) {
                        if (ps[i] + ps[j] == tar) {
                              return new int[] { i, j };
                        }
                  }
            }
            return null;
      }

      public static int[] pairSumOP(int ps[], int tar) {
            int start = 0;
            int end = ps.length - 1;
            while (start < end) {
                  if (ps[start] + ps[end] == tar) {
                        return new int[] { start, end };
                  } else if (ps[start] + ps[end] > tar) {
                        end--;
                  } else {
                        start++;
                  }
            }
            return null;
      }
}