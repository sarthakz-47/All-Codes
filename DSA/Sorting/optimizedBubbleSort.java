package DSA.Sorting;

public class optimizedBubbleSort {
    public static void bubbleSort(int arr[], int n) {
        for (int turn = 0; turn < n - 1; turn++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - turn; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }

            }
            if (swapped == false) {
                break;
            }
        }
    }

    public static void printArr(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        int n = arr.length;
        bubbleSort(arr, n);
        printArr(arr, n);
    }
}