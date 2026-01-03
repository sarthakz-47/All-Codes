package DSA.Arrays2D;

public class TransposeOfMatrix {
    public static void function(int[][] arr) {
        int n = arr.length, m = arr[0].length;

        // Create a new 2D array to store the transpose of the original array
        // If the original array has n rows and m columns,
        // the transposed array will have m rows and n columns
        int[][] transpose = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                // Assign the element at position [i][j] in the original array
                // to position [j][i] in the transposed array
                // This swaps rows and columns
                transpose[j][i] = arr[i][j];
            }
        }

        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
        };
        function(arr);
    }
}
