package DSA.Arrays2D;

public class reaname {

    public static int function(int[][] nums) {
        int sum = 0;
        int m = nums[0].length;
        for (int j = 0; j < m; j++) {
            sum += nums[1][j];
        }
        return sum;
    }

    public static void main(String[] args) {
        /*
         * Question 2 :Print out the sum of the numbers inthe second row of the “nums”
         * array.Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
         * Output -> 18
         */

        int[][] nums = {
                { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 },
        };
        System.out.println(function(nums));
    }
}
