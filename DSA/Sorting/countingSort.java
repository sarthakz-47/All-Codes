package DSA.Sorting;

public class countingSort {

    public static void sortCounting(int[] arr) {
        int maxElement = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxElement = Math.max(maxElement, arr[i]);
        }

        int[] count = new int[maxElement + 1];
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

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 2, 8, 3, 3, 1 };
        sortCounting(arr);
        printArr(arr);
    }
}
