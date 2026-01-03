package DSA.BitManipulation;

public class PCountSetBits {
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            // find LSB:
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(countSetBits(n));
    }
}
