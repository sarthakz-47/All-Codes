package Problems;

public class GCD {
    public static void giveGCD(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        giveGCD(a, b);
    }
}
