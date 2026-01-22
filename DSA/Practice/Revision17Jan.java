package DSA.Practice;

class LinearSearch {
    int SearchLinear(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 203, 32, 23 };
        LinearSearch s = new LinearSearch();
        System.out.println(s.SearchLinear(arr, 203));
    }
}

class BinarySearch {
    int SerchBinary(int arr[], int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6 };
        int target = 2;
        BinarySearch b = new BinarySearch();
        System.out.println(b.SerchBinary(arr, target));
    }
}

class BubbleSort {

    void searchBubble(int arr[]) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 10, 1, 4, 20 };
        BubbleSort b = new BubbleSort();
        b.searchBubble(arr);
        b.printArray(arr);
    }
}

class SelectionSort {
    void sortSelection(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minElement = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minElement] > arr[j]) {
                    minElement = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minElement];
            arr[minElement] = temp;
        }
    }

    void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 40, 30, 20 };
        SelectionSort s = new SelectionSort();
        s.sortSelection(arr);
        s.printArray(arr);
    }
}

class InsertionSort {
    void sortInsertion(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 40, 30, 20 };
        InsertionSort i = new InsertionSort();
        i.sortInsertion(arr);
        i.printArray(arr);
    }
}

class CountingSort {

    void sortCounting(int arr[]) {

        int maxElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            maxElement = Math.max(maxElement, arr[i]);
        }

        int count[] = new int[maxElement + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index] = i;
                index++;
                count[i]--;
            }
        }
    }

    void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 40, 30, 20 };
        CountingSort c = new CountingSort();
        c.sortCounting(arr);
        c.printArray(arr);
    }
}

class Arrays {

    // Find largest
    public static int largest(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    // Reverse an array
    public static void reverse(int arr[]) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Print Pairs
    public static void printPairs(int[] arr) {
        int totalPairs = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Toatal Paris: " + totalPairs);
    }

    // Print Subarrays
    public static void printSubarrays(int[] arr) {
        int totalSubarrays = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    totalSubarrays++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays are: " + totalSubarrays);
    }

    // Second largest element
    public static int secondLargest(int arr[]) {
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

    // Remove duplicates from sorted array
    public static int removeDuplicates(int arr[]) {
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                count++;
            }
        }
        return count;
    }

    // Check if array is sorted
    public static boolean checkSorted(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Left rotate array by k places
    public static void leftrotate(int arr[], int k) {
        int n = arr.length;

        k = k % n;
        reverse(arr, 0, k - 1);

        reverse(arr, k, n - 1);

        reverse(arr, 0, n - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Right Rotate array by k places
    public static void rightRotate(int arr[], int k) {
        int n = arr.length;

        k = k % n;
        reverse(arr, 0, n - 1);

        reverse(arr, 0, k - 1);

        reverse(arr, k, n - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 20, 22, 23 };
        // System.out.println(largest(arr));
        // reverse(arr);
        // printPairs(arr);
        // printSubarrays(arr);
        // System.out.println(secondLargest(arr));
        // System.out.println(removeDuplicates(arr));
        // System.out.println(checkSorted(arr));
        // leftrotate(arr, 2);
        rightRotate(arr, 2);
    }
}