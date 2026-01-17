package DSA.Arrays;

public class PMoveZerosToEnd {
    // Given an array of integers, move all 0s to the end without changing the
    // relative order of non-zero elements.
    // Example:
    // Input: [0, 1, 0, 3, 12]
    // Output: [1, 3, 12, 0, 0]

    // brute force approach:
    // TC: O(n)
    // SC: O(n)* -> extra space used
    public static void bruteForceMoveZerosToEnd(int arr[]) {
        // Step 1: Create a new array of same size
        int n = arr.length;
        int[] result = new int[n];
        int index = 0;

        // Step 2: Copy all non zero elements to the new array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                result[index++] = arr[i];
            }
        }

        // Step 3: Now for reamining indexes fill all the positions with 0
        while (index < n) {
            result[index++] = 0;
        }

        // Step 4: Print the resulting array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    // Optimized approach:
    // TC: O(n)
    // SC: O(1)* -> No extra space used
    public static void optimizedMoveZerosToEnd(int arr[]) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // swap postions:
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;

                index++;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 23, 21, 23, 0, 21, 20, 0, 22, 02, 0, 2, 0, 2, 0 };
        bruteForceMoveZerosToEnd(arr);
        System.out.println();
        optimizedMoveZerosToEnd(arr);
    }
}
