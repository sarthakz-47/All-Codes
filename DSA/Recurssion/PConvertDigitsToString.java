package DSA.Recurssion;

public class PConvertDigitsToString {
    public static void main(String[] args) {
        int n = 2019;
        digits d = new digits();
        d.printDigits(n);
    }
}

class digits {
    String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public void printDigits(int n) {
        // Base Case:
        if (n == 0) {
            return;
        }

        // Extract Last Digit:
        int lastDigit = n % 10;

        // call for the remeaning value unitll base case hits:
        printDigits(n / 10);

        // return the value at ith position:
        System.out.print(digits[lastDigit] + " ");
    }
}