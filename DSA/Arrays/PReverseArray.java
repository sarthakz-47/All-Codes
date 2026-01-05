package DSA.Arrays;

public class PReverseArray {

    public static void arrayReverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        System.out.println("Array before reversing: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        while (start < end) { // go until start < end
            int temp = arr[start]; // swap start with temp
            arr[start] = arr[end]; // swap end with start
            arr[end] = temp; // swap temp with end

            start++; // imp to update start and move forward
            end--; // and end should move backwards
        }

        System.out.println("Array after reversing: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 8, 5, 24, 7, 25 };
        arrayReverse(arr);
    }
}
