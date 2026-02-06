package DSA.DivideAndConquer;

public class AlgoMergeSort {
    public static void mergeSort(int arr[], int si, int ei) {

        // Base case:
        if (si >= ei) {
            return;
        }

        // Step 1: Find mid element:
        int mid = si + (ei - si) / 2;

        // Step 2: Divide the array into two halves:
        // 2.1: Left Halve:
        mergeSort(arr, si, mid);
        // 2.2: Right Halve:
        mergeSort(arr, mid + 1, ei);

        // Step 3: When single element left merge the element:
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        // Step 1: Create a temp array to store the merge result:
        int temp[] = new int[ei - si + 1];

        // Step 2: Create pointers to track the diffent arrays:
        int left = si; // iterator for left part
        int right = mid + 1; // iterator for right part
        int index = 0; // iterator for temp array

        // Step 3: Compare the left and right part and place it in temp array:
        while (left <= mid && right <= ei) {
            if (arr[left] <= arr[right]) {
                temp[index] = arr[left];
                left++;
                index++;
            } else {
                temp[index] = arr[right];
                right++;
                index++;
            }
        }

        // Step 4: if any of one halve exhaust first then,
        // copy all reamining element from another array:

        // 4.1 if right part exhaust first then copy all left part reamining element:
        while (left <= mid) {
            temp[index] = arr[left];
            left++;
            index++;
        }
        // 4.2 if left part exhaust first then copy all right part reamining element:
        while (right <= ei) {
            temp[index] = arr[right];
            right++;
            index++;
        }

        // Step 5: Copy all temp elements to original array:
        for (int k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 4, 3, 5, 2, 1 };
        mergeSort(arr, 0, arr.length - 1);
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
    }
}