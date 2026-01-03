package Loops;

public class basicPrimeNo {
    public static void main(String[] args) {
        // what is prime number?
        // prime number is that which is multiple by itself and 1 only
        // for ex 17 which is mulple of 17*1 and 1*17

        int n = 18;
        boolean isprime = true;
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                isprime = false;
            }
        }

        if (isprime == true) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
