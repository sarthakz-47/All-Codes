package DSA.Sorting;

class AlgoQuickSort {
    public static void quickSort(int arr[], int low, int high) {
        // Base case:
        if (low < high)
            return;

        // Step 1: Partition the array:
        int partitionIdx = partition(arr, low, high);

        // Step 2: Sort the left part of array:
        quickSort(arr, low, partitionIdx - 1);

        // Step 3: Sort the left part of array:
        quickSort(arr, partitionIdx + 1, high);

    }

    public static int partition(int arr[], int low, int high) {
        // Step 1: Assume partitionIdx as last element of array:
        int partitionIdx = arr[high];

        // Step 2: Make iterator to change the values:
        int i = low - 1;

        // Step 3: Compare array elements with partitionIdx:
        for (int j = low; j < high; j++) {
            // if currelement is < partitionIdx then:
            if (arr[j] < partitionIdx) {
                i++;
                // Swap the values at i and j:
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // if currelement is > partitionIdx then, move partitionIdx to correct
        // location:
        i++;
        int temp = arr[high];
        arr[high] = arr[i];
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
