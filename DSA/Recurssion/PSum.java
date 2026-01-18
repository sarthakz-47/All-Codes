package DSA.Recurssion;

public class PSum {
    public static int sum(int n) {
        // intialize sum with zero:
        int sum = 0;

        // Base case:
        if (n == 0) {
            return 0;
        }

        // calculate n-1 and add it to sum:
        sum = n + sum(n - 1);
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }
}
