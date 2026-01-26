package DSA.Recurssion;

public class PFirstOccurence {
    public static int firstOccr(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccr(arr, i + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 4 };
        System.out.println(firstOccr(arr, 0, 4));

    }
}
