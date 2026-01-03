package DSA.Strings;

public class CheckPalindrome {

    public static boolean checkPalinrome(String str) {
        int n = str.length();
        // run a loop from start to mid of the string
        // we need to check till start to mid only
        for (int i = 0; i <= (n / 2); i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                // check if element at 0th index is equal to last index and so on
                return false; // if any of two index not equals then return not palindrome
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "WTFFTW";
        if (checkPalinrome(str)) {
            System.out.print(str + " is a palindrome.");
        } else {
            System.out.print(str + " is not a palindrome.");
        }
    }
}
