package DSA.Arrays;

public class PSubarraysInArrays {

    public static void printSubarrays(int[] arr) {
        int totalSubarrays = 0;
        for (int i = 0; i < arr.length; i++) { // outer loop for first element to trace
            for (int j = i; j < arr.length; j++) { // inner loop for second and next elemets to trace
                for (int k = i; k <= j; k++) { // second inner loop for storing the values into array
                    System.out.print(arr[k] + " ");
                    totalSubarrays++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays are: " + totalSubarrays);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 8, 5, 24, 7, 25 };
        printSubarrays(arr);
    }
}
