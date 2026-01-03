package DSA.Sorting;

public class insertionSort {

    public static void sortInsertion(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int currElement = arr[i];
            int prevElement = i - 1;

            while (prevElement >= 0 && arr[prevElement] > currElement) {
                arr[prevElement + 1] = arr[prevElement];
                prevElement--;
            }

            arr[prevElement + 1] = currElement;

        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        sortInsertion(arr);
        printArr(arr);

    }
}
