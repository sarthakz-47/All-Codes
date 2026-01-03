package Functions;

public class optimizedPrimeNo {
    public static boolean checkPrime(int n) {
        // In basic or brute force approch of finding prime number
        // concept is that a number is prime if and only if it is divisible by 1 or that
        // number n
        // for that we run a loop from 2 to n-1 and check if n%1,2,3..n becomes true

        boolean isprime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isprime = false;
            }
        }
        return isprime;
    }

    public static boolean optimizedCheckPrime(int n) {
        /*
         * In optimized approach of finding prime number we run loop from 2 to underoot
         * why underoot n?
         * becasue if we find a pair existing for a n number then we have to find untill
         * half of n only
         * for example:
         * Think of factors of 36 as pairs:
         * 1 × 36
         * 2 × 18
         * 3 × 12
         * 4 × 9
         * 6 × 6
         * Notice something?
         * After 6(underoot of 36), the pairs start repeating (in reverse).
         * So no need to check past 6.
         * Every factor bigger than 6 has a partner smaller than 6.
         * 
         * Check if 15 is prime:
         * Basic (check until 14):
         * Test: 2,3,4,5,6,…,14 → lots of work
         * Optimized (check until √15):
         * √15 ≈ 3.8 → check only 2,3
         * 2 doesn’t divide
         * 3 does divide → not prime
         * Done!
         */
        boolean isprime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isprime = false;
            }
        }
        return isprime;
    }

    public static void main(String[] args) {
        int n = 101;
        // System.out.println(checkPrime(n));
        System.out.println((optimizedCheckPrime(n)));
    }
}
