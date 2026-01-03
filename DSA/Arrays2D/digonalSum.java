package DSA.Arrays2D;

public class digonalSum {
    public static int PrintSum(int arr[][]) {
        int sum = 0, n = arr.length, m = arr[0].length;
        // traverse tgrough the array:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // condition for primary digonal
                if (i == j) {
                    sum += arr[i][j];
                }
                // condition for secondary digonal
                else if (i + j == n - 1) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
        // O(n^2) <- Time Complexity
    }

    public static int optimizedDigonalSum(int arr[][]) {
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            // for primary digonal simply add element at same index numbers:
            sum += arr[i][i]; // denotes i == j

            // for secondary digonal:
            // previously i + j = n - 1 was condition for non digonal
            // putting i on rhs we get n - 1 - i
            if (i != n - 1 - i) { // denotes when i is not equal to j
                sum += arr[i][n - 1 - i];
            }
        }
        return sum;
        // O(n) <- Time Complexity
    }

    public static void main(String[] args) {
        /*
         * Given a square matrix mat, return the sum of the matrix diagonals.
         * Only include the sum of all the elements on the primary diagonal and all the
         * elements on the secondary diagonal that are not part of the primary diagonal.
         * Example 1:
         * Input: mat = [[1,2,3],
         * [4,5,6],
         * [7,8,9]]
         * Output: 25
         * Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
         * Notice that element mat[1][1] = 5 is counted only once.
         * 
         * Example 2:
         * Input: mat = [[1,1,1,1],
         * [1,1,1,1],
         * [1,1,1,1],
         * [1,1,1,1]]
         * Output: 8
         * 
         * Example 3:
         * Input: mat = [[5]]
         * Output: 5
         */
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(PrintSum(arr));
        System.out.println(optimizedDigonalSum(arr));
    }
}
