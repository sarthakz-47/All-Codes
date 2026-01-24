package DSA.Arrays;

class PFindMissingNum {
    // Function to find the missing number from 1 to N
    public int missingNumberBruteForce(int[] a, int N) {
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

    public int missingNumberOptimal(int[] a, int N) {
        // calculate expected sum by sum formula:
        int expectedSum = N * (N + 1) / 2;
        // keep track of actual sum:
        int actualSum = 0;

        // calculate sum of all elements in array:
        for (int i = 0; i < a.length; i++) {
            actualSum += a[i];
        }

        // missing num will be expected sum - actual sum always:
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 4, 5 };
        int N = 5;

        PFindMissingNum obj = new PFindMissingNum();
        int ans1 = obj.missingNumberBruteForce(a, N);
        System.out.println("The missing number is: " + ans1);

        int ans2 = obj.missingNumberOptimal(a, N);
        System.out.println("Missing Number is: " + ans2);

    }
}
