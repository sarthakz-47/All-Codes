package DSA.Arrays2D;

public class findNoOfElements {

    public static int FindNoOfElements(int[][] array, int key) {
        int count = 0;
        int n = array.length, m = array[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] == key) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        /*
         * Question 1 :Print the number of 7’s that are inthe 2d array.
         * Example :Input - int[][] array = { {4,7,8},{8,8,7} };
         * Output -> 2
         */

        int[][] array = {
                { 4, 7, 8 },
                { 8, 8, 7 },
        };
        int key = 7;
        System.out.println(FindNoOfElements(array, key));
    }
}
