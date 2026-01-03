public class PSecondLargest {
    public static int secondLargest(int arr[], int n) {
        int max1, max2;
        if (arr[0] > arr[1]) {
            max1 = arr[0];
            max2 = arr[1];
        } else {
            max1 = arr[1];
            max2 = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        return max2;

    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 1, 2, 7, 0 };
        int n = arr.length;
        System.out.println(secondLargest(arr, n));
    }
}
