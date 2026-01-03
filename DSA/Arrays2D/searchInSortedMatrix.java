package DSA.Arrays2D;

public class searchInSortedMatrix {

    public static void SearchInSortedMatrix(int arr[][], int key) {
        // we will define two pointers row and col
        // we have to consider row to 0 and col to m-1
        int row = 0, col = arr[0].length - 1; // topmost right element

        while (row < arr.length && col >= 0) {
            if (key == arr[row][col]) { // now compare key with curr element
                System.out.print("Key found at: " + row + "," + col);
                break;
            } else if (key < arr[row][col]) { // if key is less than the rihghtmost element
                col--; // move to left in sorted part
            } else { // if key is greater than the rightmost element
                row++; // move to downward in sorted part
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };
        int key = 9;
        SearchInSortedMatrix(arr, key);
    }
}
