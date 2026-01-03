package DSA.Strings;

import java.util.Arrays;

public class Anagrams {
    public static void checkAnagram(String s1, String s2) {
        // first we will convert the strings into lowercase, which will help to avoid
        // risk of uppercase letters:
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // now anagrams are valid first if there lengths are equal:
        if (s1.length() == s2.length()) {
            // now we have to check each letter of the string one by one
            // for that we will create a char array for string:
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();

            // sort the array:
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            // if sorted char array are same then the strings are anagram:
            boolean result = Arrays.equals(ch1, ch2);
            if (result) {
                System.out.println(s1 + " and " + s2 + " are anagrams of each other.");
            } else {
                System.out.println(s1 + " and " + s2 + " are not anagrams of each other.");
            }
        }
        // when lengths of strings are not equal:
        else {
            System.out.println(s1 + " and " + s2 + " are not anagrams of each other.");
        }

    }

    public static void main(String[] args) {
        /*
         * given two strings s and t, return true if t is an anagram of s, and false
         * otherwise.
         * 
         * Example 1:
         * Input: s = "anagram", t = "nagaram"
         * Output: true
         * 
         * Example 2:
         * Input: s = "rat", t = "car"
         * Output: false
         */
        String s = "race";
        String t = "care";
        checkAnagram(s, t);
    }
}
