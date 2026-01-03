package Functions;

public class binomialCoeff {
    // Problem: Find binomial coeff using n and r

    public static int findFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int findBinomialCoeff(int n, int r) {
        int n_fact = findFactorial(n);
        int r_fact = findFactorial(r);
        int nmr = n - r;
        int nmr_fact = findFactorial(nmr);

        return n_fact / (r_fact * (nmr_fact));
    }

    public static void main(String[] args) {
        int n = 5, r = 2;
        System.out.println(findBinomialCoeff(n, r));
    }
}
