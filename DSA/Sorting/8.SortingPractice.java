package DSA.Sorting;

class SortingPractice {

    // 1.Bubble Sort: O(n) if swapped var is used else O(n^2)
    public static void bubble(int[] arr, int n) {
        boolean swapped = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        if (!swapped) {
            return;
        }
    }

    // 2.Selection Sort: TC:O(n^2)
    public static void selection(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    // 3.Insertion Sort: TC:O(n^2)
    public static void insertion(int[] arr, int n) {
        for (int i = 1; i <= n - 1; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;
        }
    }

    // 4: Count Sort: TC:O(n+k) SC:O(k) where k = largest element
    public static void count(int arr[], int n) {
        int largest = arr[0];
        for (int i = 1; i < n; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        int idx = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[idx] = i;
                idx++;
                count[i]--;
            }
        }
    }

    // 5.Merge Sort: TC:O(nlogn) SC:O(n)
    public static void mergeSort(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int arr[], int low, int mid, int high) {
        int temp[] = new int[high - low + 1];
        int idx = 0;
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                temp[idx] = arr[left];
                idx++;
                left++;
            } else {
                temp[idx] = arr[right];
                idx++;
                right++;
            }
        }

        while (left <= mid) {
            temp[idx] = arr[left];
            idx++;
            left++;

        }

        while (right <= high) {
            temp[idx] = arr[right];
            idx++;
            right++;
        }

        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }

    // 6.Quick Sort: TC:O(nlogn) SC:O(1)
    public static void quickSort(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }

        int pi = partition(arr, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                // swap:
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[high];
        arr[high] = arr[i];
        arr[i] = temp;

        return i;
    }

    // *Main method:
    public static void main(String[] args) {
        int arr[] = { 7, 4, 8, 11, 2, 3 };
        int n = arr.length;
        // bubble(arr,n);
        // selection(arr,n);
        // insertion(arr,n);
        // count(arr,n);
        // mergeSort(arr,0,n-1);
        quickSort(arr, 0, n - 1);
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
    }
}
