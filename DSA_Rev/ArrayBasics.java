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

            // basics of 2D arrays
            // 1.creation:
            int y[][] = { { 1, 2 }, { 3, 4 } };
            int y2[][] = new int[2][2];

            // 2.rows & colmns in 2d arrays:
            int n1 = y.length; // no. of rows
            int m1 = y[0].length; // no. of colms
            System.out.println("rows=" + n1 + " colms=" + m1);

            // 3.printing 2d array:
            for (int i = 0; i < n1; i++) {
                  for (int j = 0; j < m1; j++) {
                        System.out.print(y[i][j] + " ");
                  }
                  System.out.println();
            }
            System.out.println();

            // 4.update in 2d arrays:
            y[0][1] = 100;
            y2[0][0] = 18;
            for (int i = 0; i < n1; i++) {
                  for (int j = 0; j < m1; j++) {
                        System.out.print(y[i][j] + " ");
                  }
                  System.out.println();
            }
            System.out.println();

            // Questions by AC:
            // 1.Spiral matrix: O(n x m)
            int[][] sp = { { 1, 2, 3 },
                        { 4, 5, 6 },
                        { 7, 8, 9 }
            };
            int n2 = sp.length;
            int m2 = sp[0].length;

            int left = 0;
            int top = 0;
            int right = m2 - 1;
            int bottom = n2 - 1;

            while (top <= bottom && left <= right) {
                  for (int i = left; i <= right; i++) {
                        System.out.print(sp[top][i] + " ");
                  }
                  top++;

                  for (int i = top; i <= bottom; i++) {
                        System.out.print(sp[i][right] + " ");
                  }
                  right--;

                  if (top <= bottom) {
                        for (int i = right; i >= left; i--) {
                              System.out.print(sp[bottom][i] + " ");
                        }
                        bottom--;
                  }

                  if (left <= right) {
                        for (int i = bottom; i >= top; i--) {
                              System.out.print(sp[i][left] + " ");
                        }
                        left++;
                  }
            }
            System.out.println();

            // 2.Digonal Sum :
            // 2.1:Brute Force Approach->O(n^2)
            int sum = 0;
            for (int i = 0; i < n2; i++) {
                  for (int j = 0; j < m2; j++) {
                        if (sp[i][j] == sp[j][i]) {
                              sum += sp[i][j];
                        }
                        if ((i + j) == (n2 - 1) && i != j) {
                              sum += sp[i][j];
                        }
                  }
            }
            System.out.println(sum);

            // 2.2:Optimal Approach->O(n)
            sum = 0;
            for (int i = 0; i < n2; i++) {
                  sum += sp[i][i];
                  sum += sp[i][n2 - i - 1];
            }
            if (n2 % 2 == 1) {
                  sum -= sp[n2 / 2][n2 / 2];
            }
            System.out.println(sum);

            // 3.Search in sorted matrix:
            // 3.1 Brute force-> O(n^2)
            int tar = 9;
            for (int i = 0; i < n2; i++) {
                  for (int j = 0; j < m2; j++) {
                        if (tar == sp[i][j]) {
                              System.out.println(i + "," + j);
                              break;
                        }
                  }
            }

            // 3.2 Optimal Approach-> O(logn)
            int row = 0;
            int col = m2 - 1;
            while (row < n2 && col >= 0) {
                  if (tar == sp[row][col]) {
                        System.out.println(row + "," + col);
                        break;
                  } else if (tar > sp[row][col]) {
                        row++;
                  } else {
                        col--;
                  }
            }
            System.out.println();

            // 4.Transpose of the matrix:O(n^2)
            int[][] ex = { { 1, 2, 3 }, { 4, 5, 6 } };
            int n3 = ex.length;
            int m3 = ex[0].length;
            int[][] ans = new int[m3][n3];
            for (int i = 0; i < n3; i++) {
                  for (int j = 0; j < m3; j++) {
                        ans[j][i] = ex[i][j];
                  }
            }
            for (int i = 0; i < m3; i++) {
                  for (int j = 0; j < n3; j++) {
                        System.out.print(ans[i][j] + " ");
                  }
                  System.out.println();
            }
            System.out.println();

            // Questions By SDE sheet: Easy + Med
            // 1.second largest number: O(n)
            int[] numb = { 1, 2, 3, 4, 5 };
            int max1, max2;
            if (numb[0] > numb[1]) {
                  max1 = numb[0];
                  max2 = numb[1];
            } else {
                  max1 = numb[1];
                  max2 = numb[0];
            }
            for (int i = 2; i < numb.length; i++) {
                  if (numb[i] > max1) {
                        max2 = max1;
                        max1 = numb[i];
                  } else if (numb[i] > max2) {
                        max2 = numb[i];
                  }
            }
            System.out.println(max2);

            // 2.Check if array sorted:
            for (int i = 0; i < n - 1; i++) {
                  if (numb[i] > numb[i + 1]) {
                        System.out.println("not sorted");
                        return;
                  }
            }
            System.out.println("Sorted");

            // 3.Remove Duplicates from sorted array:
            // [1,1,2,2,3]->[1,2,3]
            int[] dup = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
            int p = 0;
            for (int j = 1; j < dup.length; j++) {
                  if (dup[p] != dup[j]) {
                        dup[p + 1] = dup[j];
                        p++;
                  }
            }
            System.out.println(p + 1);

            // 4.Left rotate array by k places:
            int k = 3;
            int rt[] = { 1, 2, 3, 4, 5, 6, 7 };
            rotateRight(rt, k);
            for (int nums : rt) {
                  System.out.print(nums + " ");
            }
            System.out.println();

            // 5.Move zeros:
            int gr[] = { 0, 1, 0, 3, 12 };
            int l = 0;
            for (int j = 0; j < gr.length; j++) {
                  if (gr[j] != 0) {
                        int temp = gr[j];
                        gr[j] = gr[l];
                        gr[l] = temp;
                        l++;
                  }
            }
            for (int nums : gr) {
                  System.out.print(nums + " ");
            }
            System.out.println();

            // 6.Missing Number:
            int mn[] = { 7, 5, 3, 4, 1, 2 };
            int mns = mn.length + 1;

            int totalSum = mns * (mns + 1) / 2;
            int currSum1 = 0;
            for (int nums : mn) {
                  currSum1 += nums;
            }

            int missingNumber = totalSum - currSum1;
            System.out.println(missingNumber);

            // 7.Max consucutive ones:
            int mco[] = { 1, 1, 0, 1, 1, 1, 1 };
            int count1 = 0;
            int maxCount = 0;

            for (int i = 0; i < mco.length; i++) {
                  if (mco[i] == 1) {
                        count1++;
                        maxCount = Math.max(count1, maxCount);
                  } else {
                        count1 = 0;
                  }
            }
            System.out.println(maxCount);

            // 8.Single Number:
            int sn[] = { 1, 1, 2, 2, 3, 4, 4 };
            int x1 = 0;
            for (int i = 0; i < sn.length; i++) {
                  x1 = x1 ^ sn[i];
            }
            System.out.println(x1);

            // 9.Container with most water:
            // 9.1 Brute Force: O(N^2)
            int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
            System.out.println(maxAreaBF(height));
            // 9.2 Optimal Approach: O(N)
            System.out.println(maxAreaOP(height));
      }

      public static void reverse(int[] arr, int start, int end) {
            while (start < end) {
                  int temp = arr[start];
                  arr[start] = arr[end];
                  arr[end] = temp;
                  start++;
                  end--;
            }
      }

      public static int[] rotateLeft(int[] rt, int k) {
            k = k % rt.length;
            reverse(rt, 0, k - 1);
            reverse(rt, k, rt.length - 1);
            reverse(rt, 0, rt.length - 1);

            return rt;
      }

      public static int[] rotateRight(int[] rt, int k) {
            k = k % rt.length;
            reverse(rt, 0, rt.length - 1);
            reverse(rt, 0, k - 1);
            reverse(rt, k, rt.length - 1);

            return rt;
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
}