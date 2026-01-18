package DSA.Recurssion;

public class PprintNto1 {
    public static void printNto1(int n) {

        // Base case where recursive function should stop:
        if (n == 0) {
            // go outside the function
            return;
        }

        // simply print the number:
        System.out.print(n + " ");

        // and call the number 1 less than n:
        printNto1(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        printNto1(n);
    }
}
