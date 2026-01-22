package DSA.Arrays;

class Solution {
    // Function to find the missing number from 1 to N
    public int missingNumber(int[] a, int N) {
        // Check each number from 1 to N
        for (int i = 1; i <= N; i++) {
            boolean found = false;

            // Check if i exists in the array using linear search
            for (int j = 0; j < N - 1; j++) {
                if (a[j] == i) {
                    found = true;
                    break;
                }
            }

            // If not found, return it as the missing number
            if (!found)
                return i;
        }

        // This line should not be reached
        return -1;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 4, 5 };
        int N = 5;

        Solution obj = new Solution();
        int ans = obj.missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }
}
