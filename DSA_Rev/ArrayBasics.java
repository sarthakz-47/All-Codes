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

            // // // print pairs in array:
            // int[] ex = { 1, 2, 3 };
            // for (int i = 0; i < ex.length; i++) {
            // for (int j = i + 1; j < ex.length; j++) {
            // System.out.print(ex[i] + "," + ex[j]);
            // }
            // System.out.println();
            // }

            // // print subarrays:
            // for (int i = 0; i < ex.length; i++) {
            // for (int j = i; j < ex.length; j++) {
            // for (int k = i; k <= j; k++) {
            // System.out.print(ex[k]);
            // }
            // System.out.println();
            // }
            // System.out.println();
            // }

            // // max subarray sum:
            // // 1.brute force approach: O(n^3)
            // int sm = 0; // {1,2,3}
            // int maxSum = Integer.MIN_VALUE;
            // for (int i = 0; i < ex.length; i++) {
            // for (int j = i; j < ex.length; j++) {
            // sm = 0;
            // for (int k = i; k <= j; k++) {
            // sm += ex[k];
            // }
            // if (sm > maxSum) {
            // maxSum = sm;
            // }
            // }
            // }
            // System.out.print("Max sum is:" + maxSum);

            // // 2.Prefix array apprioach: O(n^2)
            // int numb[] = { -1, -2, -3 };
            // int currSum = 0;
            // int prefix[] = new int[numb.length];
            // prefix[0] = numb[0];
            // for (int i = 1; i < numb.length; i++) {
            // prefix[i] = numb[i] + prefix[i - 1];
            // }

            // for (int i = 0; i < numb.length; i++) {
            // for (int j = i; j < numb.length; j++) {
            // if (i == 0) {
            // currSum = prefix[j];
            // } else {
            // currSum = prefix[j] - prefix[i - 1];
            // }
            // maxSum = Math.max(currSum, maxSum);
            // }

            // }
            // System.out.println();
            // System.out.print(maxSum);

            // // 3.Kdanes algo:
            // int ms = Integer.MIN_VALUE;
            // int cs = 0;

            // for (int i = 0; i < numb.length; i++) {
            // cs += numb[i];
            // ms = Math.max(ms, cs);
            // if (cs < 0) {
            // cs = 0;
            // }
            // }
            // System.out.println("ms kdanes algo: " + ms);

            // int[] prices = { 7, 1, 4, 3, 6, 2 };
            // int n = prices.length;
            // int profit = 0;
            // int maxProfit = 0;
            // int minPrice = prices[0];
            // for (int i = 1; i < n; i++) {
            // profit = prices[i] - minPrice;
            // maxProfit = Math.max(maxProfit, profit);
            // minPrice = Math.min(minPrice, prices[i]);
            // }
            // System.out.println(maxProfit);

            // // Count Sort:
            // int sort[] = { 5, 4, 3 };
            // int max = sort[0];
            // for (int i = 1; i < sort.length; i++) {
            // max = Math.max(max, arr[i]);
            // }

            // int count[] = new int[max + 1];
            // for (int i = 0; i < sort.length; i++) {
            // count[sort[i]]++;
            // }

            // int i = 0;
            // for (int j = 0; j < count.length; j++) {
            // while (count[j] != 0) {
            // sort[i] = j;
            // i++;
            // count[j]--;
            // }
            // }

            // for (int x : sort) {
            // System.out.print(x + " ");
            // }

            // 2D arrays:
            // creation: 2d array of 5 rows and columns:
            int[][] array2d = new int[5][5]; // all zero elements
            int[][] arr2d = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
            // accessing elements:
            int xy = arr2d[0][0];
            System.out.println(xy);
            // updating elements:
            arr2d[0][0] = 100;
            // rows and columns in 2darrays:
            int row = arr2d.length; // gives rows
            int col = arr2d[0].length; // gives colms
            System.out.println(row + " " + col);
            // printing 2d array:
            for (int i = 0; i < arr2d.length; i++) {
                  for (int j = 0; j < arr2d[i].length; j++) {
                        System.out.print(arr2d[i][j] + " ");
                  }
            }
            System.out.println();

            // jagged array: rows can have diff length;
            int jagged[][] = {
                        { 1, 2, 3 },
                        { 4 }
            };
            for (int i = 0; i < jagged.length; i++) {
                  for (int j = 0; j < jagged[i].length; j++) {
                        System.out.print(jagged[i][j] + " ");
                  }
            }
            System.out.println();

      }
}
