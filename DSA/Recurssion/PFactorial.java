package DSA.Recurssion;

public class PFactorial {
    public static int findFactorial(int n) {
        // Base case:
        if (n == 0) {
            return 1;
        }

        // calculate factorial of n minus 1 :
        int factnm1 = findFactorial(n - 1);

        // now multiply it with the n:
        int fact = n * factnm1;

        return fact;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(findFactorial(n));
    }
}
