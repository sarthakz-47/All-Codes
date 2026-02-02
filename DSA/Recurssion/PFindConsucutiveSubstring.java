package DSA.Recurssion;

public class PFindConsucutiveSubstring {
    public static void main(String[] args) {
        System.out.println(solutionC.countSubstrings("abcba"));
        String str = "abcba";
        int n = str.length();
        System.out.println(solutionB.countSubstrings(str, 0, n - 1));
    }
}

class solutionB {
    public static int countSubstrings(String str, int si, int ei) {

        // Base Case:
        if (si > ei) {
            return 0;
        }

        // A substring can be formed by only three ways:
        // Step 1: When we remove a char form starting of the string:
        int firstRemoved = countSubstrings(str, si + 1, ei);

        // Step 2: When we remove a char form ending of the string:
        int lastRemoved = countSubstrings(str, si, ei - 1);

        // Step 3: When we remove a char form starting and ending of the string:
        int firstLastRemoved = countSubstrings(str, si + 1, ei - 1);

        // ans will deduct firstLastRemoved because of common pairs occurs:
        int ans = firstRemoved + lastRemoved - firstLastRemoved;

        // if start and end of a substring is same then increament the ans:
        if (str.charAt(si) == str.charAt(ei)) {
            ans++;
        }

        return ans;
    }
}

class solutionC {
    public static int countSubstrings(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }
}