package DSA.Arrays2D;

public class largestSmallest {
    public static int largest(int arr[][]) {
        int n = arr.length, m = arr[0].length;
        int largest = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (largest < arr[i][j]) {
                    largest = arr[i][j];
                }
            }
        }
        return largest;
    }

    public static int smallest(int arr[][]) {
        int n = arr.length, m = arr[0].length;
        int smallest = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (smallest > arr[i][j]) {
                    smallest = arr[i][j];
                }
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2 }, { 3, 4 } };
        System.out.println(largest(arr));
        System.out.println(smallest(arr));
    }
}
