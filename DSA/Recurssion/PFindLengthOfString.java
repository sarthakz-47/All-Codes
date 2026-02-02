package DSA.Recurssion;

public class PFindLengthOfString {
    public static void main(String[] args) {
        solutionA a = new solutionA();
        System.out.println(a.length(0, "sarthak"));
    }
}

class solutionA {
    public int length(int i, String str) {
        // Base case:
        if (i == str.length()) {
            return 0;
        }
        return 1 + length(i + 1, str);
    }
}