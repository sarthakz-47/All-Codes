package DSA.Arrays;

public class AlgobinarySearch {

    public static void searchBinary(int arr[], int target) {
        // binary search means we split array into two halves
        // left side small elements than mid element
        // right side large elements than mid element
        // which will reduce time complexity of the process beacause now we not need to
        // visit each and every element
        // if the taget < mid seach in left and if not seach in right

        int start = 0; // assume as starting element index of array
        int end = arr.length - 1; // assume as last elements index of the array

        while (start <= end) {
            // Step 1: Calculate middle element
            int mid = (start + end) / 2;
            // Step 2: Compare that middle element is equal to target?
            if (arr[mid] == target) {
                // if yes then print the index
                System.out.println(target + " present at index: " + mid);
            }
            // Step 3: if no then check that target is lager than middle element?
            if (arr[mid] < target) {
                // if yes then search in right part of array
                start = mid + 1;
            }
            // Step 4: still no? then check in left part of array
            else {
                end = mid - 1;
            }
            // and repeat again and again :)
        }

    }

    public static void main(String[] args) {

        // **Binary search only works on sorted arrays**
        int arr[] = { 2, 5, 7, 8, 24 };
        int target = 24;
        searchBinary(arr, target);

    }
}
