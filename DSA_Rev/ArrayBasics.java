// Online Java Compiler
// Use this editor to write, compile and run your Java code online
package DSA_Rev;

// import java.util.*;
class Main {

      public static int passByValue(int n) {
            return n * n;
      }

      public static void passByRef(int arr[]) {
            arr[1] = 200;
      }

      public static void main(String[] args) {
            // basics of 1D arrays
            // 1.creation:
            int[] arr = { 1, 3, 5, 4, 5 };
            int[] arr1 = new int[5];

            // 2.length fnx in array:
            int n = arr.length;
            System.out.println(n);

            // 3.printing array:
            for (int i = 0; i < arr.length; i++) {
                  System.out.print(arr[i] + " ");
            }
            System.out.println();
            for (int nums : arr1) {
                  System.out.print(nums + " ");
            }
            System.out.println();

            // 4.update in arrays:
            arr[2] = 100;
            for (int nums : arr) {
                  System.out.print(nums + " ");
            }
            System.out.println();

            // 5.input from user:
            // Scanner sc = new Scanner(System.in);
            // int length = 5;
            // int[] nums = new int[length];
            // for(int i=0;i<length;i++){
            // System.out.print("Enter Element: ");
            // nums[i] = sc.nextInt();
            // }
            // for(int x: nums){
            // System.out.print(x+" ");
            // }
            // System.out.println();

            // 6.arrays as function arguments:
            // normal pass by refernce fnxs:
            int a = 100;
            passByValue(a); // reference of the val
            System.out.println(a); // op:100

            // pass by value
            int arr2[] = { 1, 2, 3 };
            passByRef(arr2); // value is copied
            for (int nums : arr2) { // op: 1 200 3
                  System.out.print(nums + " ");
            }
            System.out.println();

            // 7.Searching in arrays:
            // 7.1 Linear Searching: O(n)
            int[] arr3 = { 100, 200, 300, 400 };
            int target = 300;
            for (int i = 0; i < arr3.length; i++) {
                  if (arr3[i] == target) {
                        System.out.println(i);
                        break;
                  }
            }

            // 7.2 Binary Search: O(logn)
            int low = 0;
            int high = arr3.length - 1;
            while (low <= high) {
                  int mid = low + (high - low) / 2;
                  if (target == arr3[mid]) {
                        System.out.println(mid);
                        break;
                  } else if (target > arr3[mid]) {
                        low = mid + 1;
                  } else {
                        high = mid - 1;
                  }
            }

            // 8.Sorting in arrays:
            // 8.1: Bubble Sort -> O(n^2)
            int arr4[] = { 1, 5, 3, 2, 4 };
            for (int i = 0; i < arr4.length - 1; i++) {
                  for (int j = 0; j < arr4.length - i - 1; j++) {
                        if (arr4[j] > arr4[j + 1]) {
                              int temp = arr4[j];
                              arr4[j] = arr4[j + 1];
                              arr4[j + 1] = temp;
                        }
                  }
            }
            for (int nums : arr4) {
                  System.out.print(nums + " ");
            }
            System.out.println();

            // 8.2: Selection Sort -> O(n^2)
            int arr5[] = { 500, 100, 200 };
            for (int i = 0; i < arr5.length - 1; i++) {
                  int minIdx = i;
                  for (int j = i + 1; j < arr5.length; j++) {
                        if (arr5[minIdx] > arr5[j]) {
                              minIdx = j;
                        }
                  }
                  int temp = arr5[i];
                  arr5[i] = arr5[minIdx];
                  arr5[minIdx] = temp;
            }
            for (int nums : arr5) {
                  System.out.print(nums + " ");
            }
            System.out.println();

            // 8.3: Insertion Sort-> O(n^2)
            int arr6[] = { -1, 8, 0, -2, 3 };
            for (int i = 1; i < arr6.length; i++) {
                  int minEle = arr6[i];
                  int j = i - 1;
                  while (j >= 0 && arr6[j] > minEle) {
                        arr6[j + 1] = arr6[j];
                        j--;
                  }
                  arr6[j + 1] = minEle;
            }
            for (int nums : arr6) {
                  System.out.print(nums + " ");
            }
            System.out.println();

            // 8.4:Count Sort->O(n+k) + O(n+k)
            // n->no of elements in array
            // k->max no in array

            int maximum = 0;
            for (int nums : arr4) {
                  maximum = Math.max(maximum, nums);
            }
            int[] count = new int[maximum + 1];
            for (int i = 0; i < arr4.length; i++) {
                  count[arr4[i]]++;
            }

            int x = 0;
            for (int i = 0; i < count.length; i++) {
                  while (count[i] > 0) {
                        arr4[x] = i;
                        x++;
                        count[i]--;
                  }
            }
            for (int nums : arr4) {
                  System.out.print(nums + " ");
            }
            System.out.println();

            // Questions by AC:
            // 1.largest in array: O(n)
            int[] uni = { 1, 2, 5, 3, 4 };
            int max = arr[0];
            for (int i = 0; i < uni.length; i++) {
                  if (uni[i] > max) {
                        max = uni[i];
                  }
            }
            System.out.println(max);

            // 2.reverse array: O(n)
            int start = 0;
            int end = uni.length - 1;
            while (start < end) {
                  int temp = uni[start];
                  uni[start] = uni[end];
                  uni[end] = temp;
                  start++;
                  end--;
            }
            for (int nums : uni) {
                  System.out.print(nums + " ");
            }
            System.out.println();

            // 3.print pairs: O(n^2)
            for (int i = 0; i < uni.length; i++) {
                  for (int j = i + 1; j < uni.length; j++) {
                        System.out.print("(" + uni[i] + "," + uni[j] + ")");
                  }
                  System.out.println();
            }

            // 4.print subarrays: O(n^3)
            for (int i = 0; i < uni.length; i++) {
                  for (int j = i; j < uni.length; j++) {
                        for (int k = i; k <= j; k++) {
                              System.out.print(uni[k]);
                        }
                        System.out.println();
                  }
                  System.out.println();
            }

            // 5.Max Subarray sum
            // 5.1: Brute Force: O(n^3)
            int maxSum = Integer.MIN_VALUE;
            int currSum = 0;
            for (int i = 0; i < uni.length; i++) {
                  for (int j = i; j < uni.length; j++) {
                        currSum = 0;
                        for (int k = i; k <= j; k++) {
                              currSum += uni[k];
                              maxSum = Math.max(currSum, maxSum);
                        }
                  }
            }
            System.out.println(maxSum);

            // 5.2: Prefix sum: O(n^2) + O(n)
            int[] prefix = new int[uni.length];
            prefix[0] = uni[0];
            for (int i = 1; i < uni.length; i++) {
                  prefix[i] = uni[i] + prefix[i - 1];
            }
            for (int i = 0; i < uni.length; i++) {
                  for (int j = i; j < uni.length; j++) {
                        if (i == 0) {
                              currSum = prefix[j];
                        } else {
                              currSum = prefix[j] - prefix[i - 1];
                        }
                        maxSum = Math.max(currSum, maxSum);
                  }
            }
            System.out.println(maxSum);

            // 5.3 Kdane's Algorithm: O(n)
            for (int i = 0; i < uni.length; i++) {
                  currSum += uni[i];
                  maxSum = Math.max(currSum, maxSum);
                  if (currSum < 0) {
                        currSum = 0;
                  }
            }
            System.out.println(maxSum);

            // 6.Best time to buy and Sell Stocks:
            // 6.1: Brute force approach -> O(n^2)
            int[] prices = { 7, 1, 4, 5, 6, 2 };
            int maxProfit = Integer.MIN_VALUE;
            int profit = 0;
            for (int i = 0; i < prices.length; i++) {
                  for (int j = i + 1; j < prices.length; j++) {
                        profit = prices[j] - prices[i];
                        maxProfit = Math.max(profit, maxProfit);
                  }
            }
            System.out.println(maxProfit);

            // 6.2: Optimal approach-> O(n)
            int minPrice = prices[0];
            for (int i = 1; i < prices.length; i++) {
                  profit = prices[i] - minPrice;
                  maxProfit = Math.max(profit, maxProfit);
                  minPrice = Math.min(minPrice, prices[i]);
            }
            System.out.println(maxProfit);
      }
}
