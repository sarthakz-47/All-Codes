package Functions;

public class primesInRange {

    public static boolean checkPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        // Problem: Input n from user and print all primes from 2 to n
        int n = 20;
        printPrime(n);
    }
}
