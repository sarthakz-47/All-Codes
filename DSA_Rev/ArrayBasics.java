package DSA_Rev;

class ArrayBasics {
      public static void main(String[] args) {
            // // how to create?
            // int[] arr = { 1, 2, 3, 4, 5 };
            // int[] nums = new int[3];

            // // how to print?
            // for (int i = 0; i < arr.length; i++) {
            // System.out.print(arr[i] + " ");
            // }
            // System.out.println();
            // for (int x : nums) {
            // System.out.print(x);
            // }
            // System.out.println();

            // // how to update?
            // arr[2] = 10;
            // for (int i = 0; i < arr.length; i++) {
            // System.out.print(arr[i] + " ");
            // }
            // System.out.println();

            // // how to get largest/smallest element from array?
            // int[] lar = { 12, 4, 5, 3, 11 };
            // int largest = lar[0];
            // for (int i = 1; i < lar.length; i++) {
            // if (largest < lar[i]) {
            // largest = lar[i];
            // }
            // }
            // System.out.print(largest);
            // System.out.println();

            // // how to get sum of elements in array?
            // int sum = 0;
            // for (int i = 0; i < lar.length; i++) {
            // sum += lar[i];
            // }
            // System.out.print(sum);
            // System.out.println();

            // // how to revrese a array?
            // int start = 0;
            // int end = lar.length - 1;
            // while (start <= end) {
            // int temp = lar[start];
            // lar[start] = lar[end];
            // lar[end] = temp;
            // start++;
            // end--;
            // }
            // for (int num : lar) {
            // System.out.print(num + " ");
            // }
            // System.out.println();

            // // how to search in arrays?
            // // linear search: goes one by one O(n)
            // int tar = 5;
            // for (int i = 0; i < arr.length; i++) {
            // if (tar == arr[i]) {
            // System.out.print("element found at index : " + i);
            // }
            // }
            // System.out.println();

            // // binary search: goes by halfing the array O(logn)
            // int st, en, target;
            // target = 1;
            // st = 0;
            // en = arr.length - 1;
            // while (st <= en) {
            // int mid = (st + en) / 2;
            // if (target == arr[mid]) {
            // System.out.println("element found at index: " + mid);
            // break;
            // } else if (tar < arr[mid]) {
            // en = mid - 1;
            // } else {
            // st = mid + 1;
            // }
            // }

            // // print pairs in array:
            int[] ex = { 1, 2, 3, 4 };
            // for (int i = 0; i < ex.length; i++) {
            // for (int j = i + 1; j < ex.length; j++) {
            // System.out.print(ex[i] + "," + ex[j]);
            // }
            // System.out.println();
            // }

            // print subarrays:
            for (int i = 0; i < ex.length; i++) {
                  for (int j = 0; j < ex.length; j++) {
                        for (int k = i; k <= j; k++) {
                              System.out.print(ex[k]);
                        }
                        System.out.println();
                  }
                  System.out.println();
            }
      }
}
