package DSA_Rev;

import java.util.*;

public class Sorting {
    // from 0 to n-1 + 0 to n-i-1
    public static void bubbleSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // from 0 to n-1 + from i+1 to n
    public static void selectionSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int minEle = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minEle] > arr[j]) {
                    minEle = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minEle];
            arr[minEle] = temp;
        }
    }

    // from 0 to n + while j>=0 and arr[j] > minEle
    public static void insertionSort(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            int minEle = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > minEle) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = minEle;
        }
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start >= end)
            return;

        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    public static void merge(int arr[], int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int lptr = start;
        int rptr = mid + 1;
        int idx = 0;
        while (lptr <= mid && rptr <= end) {
            if (arr[lptr] <= arr[rptr]) {
                temp[idx] = arr[lptr];
                lptr++;
                idx++;
            } else {
                temp[idx] = arr[rptr];
                rptr++;
                idx++;
            }
        }
        while (lptr <= mid) {
            temp[idx] = arr[lptr];
            lptr++;
            idx++;
        }
        while (rptr <= end) {
            temp[idx] = arr[rptr];
            rptr++;
            idx++;
        }

        for (int k = 0, i = start; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 11, 3, 9, 2, 1 };
        int n = arr.length;

        // bubbleSort(arr, n);
        // selectionSort(arr, n);

        // insertionSort(arr, n);
        mergeSort(arr, 0, n - 1);
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
    }

}
