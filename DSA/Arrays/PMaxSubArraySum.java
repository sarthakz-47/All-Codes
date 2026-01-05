package DSA.Arrays;

public class PMaxSubArraySum {

    public static void bruteForce(int arr[], int n) {
        int maxSum = 0;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                maxSum = 0;
                for (int k = i; k <= j; k++) {
                    maxSum += arr[k];
                }
                if (maxSum > largest) {
                    largest = maxSum;
                }
            }
        }
        System.out.println("Maximum subarray sum is: " + largest);

    }

    public static void prefixArray(int[] arr, int n) {
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        System.out.println("Prefix Array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(prefix[i] + " ");
        }

        int maxSum = 0;
        int largest = Integer.MIN_VALUE;
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                if (start == 0)
                    maxSum = prefix[end];
                else
                    maxSum = prefix[end] - prefix[start - 1];
            }
            if (maxSum > largest) {
                largest = maxSum;
            }
        }
        System.out.println("\nMaximum Subarray sum is: " + largest);
    }

    public static void kdanesAlgo(int arr[], int n) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            if (maxSum < currSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }

        System.out.println("Maximum Subarray sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { -1, -2 };
        int n = arr.length;
        // bruteForce(arr, n);
        // prefixArray(arr, n);
        kdanesAlgo(arr, n);
    }
}
