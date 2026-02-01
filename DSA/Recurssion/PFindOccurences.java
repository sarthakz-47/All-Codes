package DSA.Recurssion;

public class PFindOccurences {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int key = 2;
        occurence o = new occurence();
        o.findOccurences(arr, key, 0);
    }
}

class occurence {
    public void findOccurences(int arr[], int key, int idx) {
        // Base Case:
        if (idx >= arr.length) {
            return;
        }
        // Work:
        if (arr[idx] == key) {
            System.out.print(idx + " ");
        }

        // recursively call:
        findOccurences(arr, key, idx + 1);
    }
}
