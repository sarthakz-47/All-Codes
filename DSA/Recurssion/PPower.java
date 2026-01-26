package DSA.Recurssion;

public class PPower {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }

        return x * power(x, n - 1);
    }

    public static int powerOpt(int x, int n) {
        if (n == 0)
            return 1;

        int half = power(x, n / 2);
        if (n % 2 == 0)
            return half * half;
        else
            return x * half * half;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 2));
        System.out.println(powerOpt(2, 3));
    }
}
