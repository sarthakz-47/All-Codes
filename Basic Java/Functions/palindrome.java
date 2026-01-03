package Functions;

public class palindrome {

    public static int reverse(int n) {
        int reverse = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n /= 10;

        }
        return reverse;
    }

    public static boolean checkPalindrome(int n) {
        if (reverse(n) == n) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 101;
        System.out.println(reverse(n));
        System.out.println(checkPalindrome(n));
    }
}
