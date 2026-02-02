package DSA.Recurssion;

public class PFindConsucutiveSubstring {
    public static void main(String[] args) {
        System.out.println(solutionC.countSubstrings("abcba"));
    }
}

class solutionB {

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