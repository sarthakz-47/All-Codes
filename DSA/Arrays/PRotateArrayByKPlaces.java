package DSA.Arrays;

import java.util.Arrays;

public class PRotateArrayByKPlaces {

    public static void rightRotate(int[] nums, int k) {
        int n = nums.length;
        // Handle cases where k >= n
        k = k % n;

        // Step 1: Reverse the whole array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse the remaining elements
        reverse(nums, k, n - 1);
    }

    public static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left]; // Store left value
            nums[left] = nums[right]; // Move right value to left
            nums[right] = temp; // Put stored value to right

            left++; // Move left pointer forward
            right--; // Move right pointer backward
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;

        System.out.println("Original array: " + Arrays.toString(nums));

        // Call rotate directly without creating object
        rightRotate(nums, k);

        System.out.println("Array after rotating by " + k + " places: " + Arrays.toString(nums));
    }

}
