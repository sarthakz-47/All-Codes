package DSA.Arrays;

public class PLargestElement {

    public static int largestElement(int arr[]) {
        int largest = arr[0]; // lets assume first element of array is largest
        for (int i = 1; i < arr.length; i++) { // loop through the array
            if (largest < arr[i]) { // if assumed element < next element in array
                largest = arr[i]; // just update the largest and assign new largest
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = { 22, 32, 32, 12, 34 };
        System.out.println(largestElement(arr));
    }
}
