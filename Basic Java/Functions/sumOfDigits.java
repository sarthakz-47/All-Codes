package Functions;

public class sumOfDigits {
    public static int calculateDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 132;
        System.out.println(calculateDigits(n));
    }
}
