package DSA.DivideAndConquer;

public class AlgoQuickSort {
    public static void quickSort(int arr[], int si, int ei) {
        // Base case:
        if (si >= ei)
            return;

        // Step 1: Partition the array:
        int pi = partition(arr, si, ei);

        // Step 2: Sort the left part of array:
        quickSort(arr, si, pi - 1);

        // Step 3: Sort the left part of array:
        quickSort(arr, pi + 1, ei);

    }

    public static int partition(int arr[], int si, int ei) {
        // Step 1: Assume pivot as last element of array:
        int pivot = arr[ei];

        // Step 2: Make iterator to change the values:
        int i = si - 1;

        // Step 3: Compare array elements with pivot:
        for (int j = si; j < ei; j++) {
            // if currelement is < pivot then:
            if (arr[j] <= pivot) {
                i++;
                // Swap the values at i and j:
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // if currelement is > pivot then, move pivot to correct location:
        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 9, 4, 6, 5 };
        quickSort(arr, 0, arr.length - 1);

        for (int nums : arr) {
            System.out.print(nums + " ");
        }
    }
}
