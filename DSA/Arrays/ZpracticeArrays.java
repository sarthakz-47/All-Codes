package DSA.Arrays;

public class ZpracticeArrays {

    public static int largest(int arr[]) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void reverseArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }
    }

    public static void printParis(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println(arr[i] + "," + arr[j]);
            }
            System.out.println();
        }
    }

    public static void printSubarrys(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void subarraySumBrute(int arr[]) {
        int n = arr.length;
        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                maxSum = Math.max(sum, maxSum);
            }
        }

        System.out.print(maxSum);
    }

    public static int maxSubarraySumPrefix(int arr[]) {
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int maxSum = 0;
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (i == 0) {
                    maxSum = prefix[j];
                } else {
                    maxSum = prefix[j] - prefix[i - 1];
                }
            }
            if (largest < maxSum) {
                largest = maxSum;
            }
        }
        return largest;
    }

    public static int kdanesAlgo(int arr[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currsum += arr[i];
            maxsum = Math.max(currsum, maxsum);

            if (currsum < 0) {
                currsum = 0;
            }
        }
        return maxsum;
    }

    public static int trappingRainwater(int arr[]) {
        int n = arr.length;

        int leftmax[] = new int[n];
        leftmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(arr[i], leftmax[i - 1]);
        }

        int rightmax[] = new int[n];
        rightmax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(arr[i], rightmax[i + 1]);
        }

        int trappedwater = 0;
        for (int i = 0; i < n; i++) {
            trappedwater += Math.min(leftmax[i], rightmax[i]) - arr[i];
        }
        return trappedwater;
    }

    public static int trappingRainwaterTwoPointer(int arr[]) {
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

    public static void stocksBrute(int prices[]) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                maxProfit = Math.max(profit, maxProfit);
            }
        }
        System.out.println(maxProfit);
    }

    public static int besttimetobuysellstocks(int arr[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > minprice) {
                int profit = arr[i] - minprice;
                maxprofit = Math.max(profit, maxprofit);
            } else {
                minprice = arr[i];
            }
        }
        return maxprofit;
    }

    public static boolean contaiansduplicate(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int searchinsortedarray(int arr[], int tar) {
        int start = 0, n = arr.length, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == tar)
                return mid;
            // When Left Half Is Sorted:
            if (arr[start] <= arr[mid]) {
                if (arr[start] < tar && tar < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // When Right Hald if sorted:
            else {
                if (arr[mid] < tar && tar < arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void spiral(int sp[][]) {
        int sr = 0, sc = 0;
        int er = sp.length - 1;
        int ec = sp[0].length - 1;

        while (sr <= er && sc <= ec) {
            // top:
            for (int col = sc; col <= ec; col++) {
                System.out.print(sp[sr][col]);
            }
            // right:
            for (int row = sr + 1; row <= er; row++) {
                System.out.print(sp[row][ec]);
            }
            // bottom:
            for (int col = ec - 1; col >= sc; col--) {
                if (sr == er) {
                    break;
                }
                System.out.print(sp[er][col]);
            }
            // left:
            for (int row = er - 1; row >= sr + 1; row--) {
                if (sc == ec) {
                    break;
                }
                System.out.print(sp[row][sc]);
            }

            sr++;
            sc++;
            er--;
            ec--;
        }
    }

    public static int diagonalSum(int dg[][]) {
        int n = dg.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            // primary diagonal
            sum += dg[i][i];

            // secondary diagonal
            if (i != n - 1 - i) { // avoid double count
                sum += dg[i][n - 1 - i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 0, 1, 2, 3, 4, 5, 6 };
        int tar = 0;
        // int key = 5;
        // System.out.println(largest(arr));
        // System.out.println(linearSearch(arr, key));
        // System.out.println(binarySearch(arr, key));
        // reverseArray(arr);
        // printParis(arr);
        // printSubarrys(arr);
        // System.out.println(maxSubarraySumPrefix(arr));
        // System.out.println(kdanesAlgo(arr));
        // System.out.println(trappingRainwater(arr));
        // System.out.println(optimizedTrppedWater(arr));
        // System.out.println(besttimetobuysellstocks(arr));
        // System.out.println(contaiansduplicate(arr));
        System.out.println(searchinsortedarray(arr, tar));
    }
}
