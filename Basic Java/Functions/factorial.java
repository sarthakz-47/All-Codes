package Functions;

public class factorial {
    // Problem: Find factorial of a given number n

    public static int findFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(findFactorial(n));
    }
}
