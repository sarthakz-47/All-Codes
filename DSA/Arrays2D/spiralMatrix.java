package DSA.Arrays2D;

public class spiralMatrix {

    public static void printSpiralMatrix(int matrix[][]) {
        // define the boundaries at the start:
        int n = matrix.length, m = matrix[0].length;
        int startRow = 0, startCol = 0;
        int endRow = n - 1;
        int endCol = m - 1;

        // we have considered <= in both cases beacuse we dont want to miss out that
        // single element in odd x odd matrix
        while (startRow <= endRow && startCol <= endCol) {
            // First print top boundary:
            // here row is constant and col is variable so:
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // Now print right boundary:
            // now do not consider topmost right element
            // now here col is const and row is variable
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // Now print bottom boundary:
            // in this we not needed to print rightmost bottom element
            // and here row is const and col is variables
            for (int j = endCol - 1; j >= startCol; j--) {
                // we have to add these conditions to not print the same cell again and again
                // in odd x odd these problems occurs
                // so when startrow and endrow are same just break the loop.
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // Now print left boundary:
            // in this we not needed common part so
            // and in this also col is const and row is variable
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                // we have to add these conditions to not print the same cell again and again
                // in odd x odd these problems occurs
                // so when startcol and endcol are same just break the loop.
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            // after all printing now we have to move inside the matrix so:
            // decrease/increase all pointers by one:
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }

    public static void main(String[] args) {
        // 54.Spiral Matrix
        // Given an m x n matrix, return all elements of the matrix in spiral order.

        // Example 1:
        // Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
        // Output: [1,2,3,6,9,8,7,4,5]

        // Example 2:
        // Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
        // Output: [1,2,3,4,8,12,11,10,9,5,6,7]

        // Constraints:
        // m == matrix.length
        // n == matrix[i].length
        // 1 <= m, n <= 10
        // -100 <= matrix[i][j] <= 100
        int matrix[][] = { { 1, 2, 3, 40, 50 },
                { 4, 5, 6, 20, 25 },
                { 7, 8, 9, 30, 35 } };
        printSpiralMatrix(matrix);

    }
}
