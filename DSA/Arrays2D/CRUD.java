package DSA.Arrays2D;

import java.util.*;

public class CRUD {
    public static void inputArray(int nums[][]) {
        Scanner sc = new Scanner(System.in);

        int row = nums.length;
        int col = nums[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        sc.close();

    }

    public static void outputArray(int nums[][]) {

        int row = nums.length;
        int col = nums[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void updateArray(int arr[][]) {
        arr[1][1] = 100;
    }

    public static void searchArray(int arr[][], int key) {
        int n = arr.length, m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (key == arr[i][j]) {
                    System.out.println("key present at:(" + i + "," + j + ")");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        // Creation of 2D array:
        int arr[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        // or
        int nums[][] = new int[3][3];

        // Insertion:
        System.out.println("Enter Elements in nums[][] array: ");
        inputArray(nums);

        // Output:
        System.out.println("Elemetns in nums[][] array: ");
        outputArray(nums);

        // Update:
        updateArray(arr);
        outputArray(arr);

        // Search:
        int key = 9;
        searchArray(arr, key);
    }
}
