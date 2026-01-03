package DSA.Sorting;

public class selectionSort {

    public static void sortSelection(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minElement = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minElement] > arr[j]) {
                    minElement = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minElement];
            arr[minElement] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        sortSelection(arr);
        printArr(arr);
    }
}
