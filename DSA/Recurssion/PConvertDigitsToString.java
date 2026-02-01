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
        if (n == 0) {
            return;
        }

        int lastDigit = n % 10;
        printDigits(n / 10);
        System.out.print(digits[lastDigit] + " ");
    }
}