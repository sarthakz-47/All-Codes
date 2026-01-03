package DSA.BitManipulation;

public class PPowerOfTwo {
    public static void checkIfPowerOfTwo(int n) {
        if ((n & (n - 1)) == 0) {
            System.out.println(n + " is power of 2.");
        } else {
            System.out.println(n + " is not power of 2.");

        }
    }

    public static void main(String[] args) {
        int n = 16;
        checkIfPowerOfTwo(n);
    }
}
