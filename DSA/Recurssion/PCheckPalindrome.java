package DSA.Recurssion;

public class PCheckPalindrome {
    public static boolean isPalindrome(String s, int start, int end) {
        // base case:
        if (start >= end) {
            return true;
        }

        // check condition:
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // recursive call:
        return isPalindrome(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(isPalindrome(s, 0, s.length() - 1));
    }
}
