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
    // 13.best time to buy sell stocks:
    // 14.spiral matrix:
    // 15.digoanl sum:
    // 16.search in sorted matrix:
    // 17.search in sorted rotated array:

}
