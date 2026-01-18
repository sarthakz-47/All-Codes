package DSA.Recurssion;

public class Pprint1toN {
    public static void printInc(int n) {
        // Base case where to stop:
        if (n == 0) {
            return;
        }
        // here first call the function:
        printInc(n - 1);
        // then print the output:
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        printInc(n);
    }
}
