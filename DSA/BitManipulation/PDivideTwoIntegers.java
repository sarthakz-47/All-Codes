package DSA.BitManipulation;

public class PDivideTwoIntegers {

    public static int divideTwoNumbers(int numerator, int denominator) {

        // Base Cases:
        // if nr == dr then ans = 1;
        if (numerator == denominator)
            return 1;
        // if nr = -2^31 and dr = -1 then ans = 2^31
        if (numerator == Integer.MIN_VALUE && denominator == -1)
            return Integer.MAX_VALUE;
        // if nr == 1 then simply return the numerator
        if (denominator == 1)
            return numerator;

        // variable to store the sign of the ans:
        boolean ispositive = true;

        // condiditions when sign can be negetive:
        if (numerator >= 0 && denominator < 0)
            ispositive = false;
        if (numerator < 0 && denominator >= 0) {
            ispositive = false;
        }

        // we will at first consider nr and dr as positive:
        long n = numerator;
        long d = denominator;

        n = Math.abs(n);
        d = Math.abs(d);

        // store ans and sum values:
        int ans = 0, sum = 0;

        // We know division is basically:
        // numerator ÷ denominator = how many times denominator fits into numerator
        // numerator ÷ denominator=how many times denominator fits into numerator
        // So we are trying to count how many times we can add d to itself before
        // exceeding n.

        // sum + d <= n → “Can we add another d without going over n?”
        // If yes, we continue; if no, stop.
        while (sum + d <= n) {
            ans++; // We found one more complete 'denominator' in numerator
            sum += d; // Add denominator to the total sum so far
        }

        // handel overflow conditions:
        if (ans > Integer.MAX_VALUE && ispositive) {
            return Integer.MAX_VALUE;
        }
        if (ans > Integer.MAX_VALUE && !ispositive) {
            return Integer.MIN_VALUE;
        }

        // return the ans by taking care of sign:
        if (ispositive) {
            return (int) ans;
        } else {
            return (int) (-1) * ans;
        }
    }

    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 3;
        System.out.println(divideTwoNumbers(numerator, denominator));

    }
}
