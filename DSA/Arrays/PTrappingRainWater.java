package DSA.Arrays;

public class PTrappingRainWater {
    public static void trappedWater(int arr[], int n) {

        int leftMax[] = new int[n];
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }

        int rightMax[] = new int[n];
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }

        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - arr[i];
        }
        System.out.println("Trapped Water is: " + trappedWater);

    }

    public static int optimizedTrppedWater(int arr[]) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int leftmax = 0, rightmax = 0;
        int trappedwater = 0;

        while (left < right) {
            leftmax = Math.max(arr[left], leftmax);
            rightmax = Math.max(arr[right], rightmax);

            if (leftmax < rightmax) {
                trappedwater += leftmax - arr[left];
                left++;
            } else {
                trappedwater += rightmax - arr[right];
                right--;
            }
        }
        return trappedwater;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 1, 0, 2, 6 };
        int n = arr.length;
        trappedWater(arr, n);
        System.out.println(optimizedTrppedWater(arr));
    }
}
