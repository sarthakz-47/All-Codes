public class PArraySortedOrNot {
    public static boolean sortedornot(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {

            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 2 };
        System.out.println(sortedornot(arr));

    }
}
