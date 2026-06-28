class Main {
    public static void main(String[] args) {
        int arr[] = { 5, 9, 11, 1, 10 };

        System.out.println(largest(arr));

        rev(arr, 0, arr.length - 1);
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
        System.out.println();

        printP(arr);

        printS(arr);

        System.out.println(secL(arr));

        int a[] = { 1, 2, 3, 4, 5 };
        System.out.println(checkSorted(a));

        int ab[] = { 0, 0, 1, 1, 1, 2, 2, 3, 4 };
        System.out.println(rdup(ab));

        int[] lr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 2;
        // lr(lr,k);
        rr(lr, k);
        for (int nums : lr) {
            System.out.print(nums + " ");
        }
        System.out.println();

        int mvz[] = { 0, 0, 1, 0, 1, 1, 0, 1, 0 };
        // int ans[] = moveBF(mvz);
        moveOP(mvz);
        for (int nums : mvz) {
            System.out.print(nums + " ");
        }
        System.out.println();

        int mn[] = { 1, 3, 4, 5 };
        System.out.println(mn(mn));

        int mco[] = { 1, 0, 1, 1, 0, 1 };
        System.out.println(mco(mco));

        int mss[] = { 2, 3, 5, -2, 7, -4 };
        System.out.println(mssBF(mss));
        System.out.println(mssBS(mss));
        System.out.println(mssOP(mss));

        int[][] sp = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        spiral(sp);
        System.out.println();

        System.out.println(dsBF(sp));
        System.out.println(dsOP(sp));

        ssm(sp, 7);
        System.out.println();

        int bs[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(bbssBF(bs));
        System.out.println(bbssOP(bs));

        int ssr[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(ssr(ssr, 2));
    }

    // 1.Print Largest:
    public static int largest(int arr[]) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    // 2.Reverse array:
    public static void rev(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // 3.print pairs:
    public static void printP(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }

    // 4.print subarrays:
    public static void printS(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    // 5.Second Largest:
    public static int secL(int arr[]) {
        int max1, max2;

        if (arr[0] > arr[1]) {
            max1 = arr[0];
            max2 = arr[1];
        } else {
            max1 = arr[1];
            max2 = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        return max2;
    }

    // 6.array is sorted or not:
    public static boolean checkSorted(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // 7.remove duplicates:
    public static int rdup(int arr[]) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }

    // 8.Left / Right rotate array:
    public static int[] lr(int arr[], int k) {
        k = k % arr.length;
        rev(arr, 0, k - 1);
        rev(arr, k, arr.length - 1);
        rev(arr, 0, arr.length - 1);
        return arr;
    }

    public static int[] rr(int arr[], int k) {
        k = k % arr.length;
        rev(arr, 0, arr.length - 1);
        rev(arr, 0, k - 1);
        rev(arr, k, arr.length - 1);
        return arr;
    }

    // 9.move zeros:
    public static int[] moveBF(int arr[]) {
        int[] temp = new int[arr.length];
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[idx] = arr[i];
                idx++;
            }
        }

        while (idx < temp.length) {
            temp[idx] = 0;
            idx++;
        }

        return temp;
    }

    public static int[] moveOP(int arr[]) {
        int i = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }

        return arr;
    }

    // 10.Missing Number:
    public static int mn(int arr[]) {
        int n = arr.length + 1;
        int currSum = 0;
        int actualSum = n * (n + 1) / 2;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
        }

        return actualSum - currSum;
    }

    // 11.max consucutive ones:
    public static int mco(int arr[]) {
        int count = 0;
        int maxCount = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }
        return maxCount;
    }

    // 12.max subarray sum:
    public static int mssBF(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                }
                maxSum = Math.max(maxSum, currSum);
            }
        }
        return maxSum;
    }

    public static int mssBS(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (i == 0) {
                    currSum = prefix[j];
                } else {
                    currSum = prefix[j] - prefix[i - 1];
                }
                maxSum = Math.max(currSum, maxSum);
            }
        }
        return maxSum;
    }

    public static int mssOP(int arr[]) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            maxSum = Math.max(maxSum, currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }

    // 13.best time to buy sell stocks:
    public static int bbssBF(int arr[]) {
        int profit = 0;
        int maxProfit = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                profit = arr[j] - arr[i];
                maxProfit = Math.max(profit, maxProfit);
            }
        }
        return maxProfit;
    }

    public static int bbssOP(int[] arr) {
        int minPrice = arr[0];
        int profit = 0;
        int maxProfit = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            profit = arr[i] - minPrice;
            maxProfit = Math.max(profit, maxProfit);
            minPrice = Math.min(minPrice, arr[i]);
        }
        return maxProfit;
    }

    // 14.spiral matrix:
    public static void spiral(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
    }

    // 15.digoanl sum:
    public static int dsBF(int arr[][]) {
        int sum = 0;
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == arr[j][i]) {
                    sum += arr[i][j];
                } else if (i != j && i + j == n - 1) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static int dsOP(int arr[][]) {
        int sum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            sum += arr[i][i];
            sum += arr[i][n - i - 1];
        }

        if (n % 2 == 1) {
            sum -= arr[n / 2][n / 2];
        }

        return sum;
    }

    // 16.search in sorted matrix:
    public static void ssm(int arr[][], int key) {
        int n = arr.length;
        int m = arr[0].length;

        int start = 0;
        int end = m - 1;

        while (start < n && end >= 0) {
            if (arr[start][end] == key) {
                System.out.print(start + "," + end);
                return;
            } else if (arr[start][end] < key) {
                start++;
            } else {
                end--;
            }
        }
    }

    // 17.search in sorted rotated array:
    public static int ssr(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[start] <= arr[mid]) {
                if (arr[start] <= key && key < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] < key && key <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
