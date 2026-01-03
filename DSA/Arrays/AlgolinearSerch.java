public class AlgolinearSerch {

    public static void searchLinear(int[] arr, int target) {
        // What is linear search?
        // linear search is an alogirthm to search the targeted element throughtout the
        // array by visiting and comparing each and every element of array one by one

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(target + " is at position: " + i);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 8, 2, 5, 24, 7 };
        int target = 24;
        searchLinear(arr, target);
    }
}
