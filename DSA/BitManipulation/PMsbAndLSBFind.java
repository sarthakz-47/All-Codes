package DSA.BitManipulation;

public class PMsbAndLSBFind {
    public static int lsb(int n) {
        return n & 1;
    }

    public static int msb(int n) {
        int msb = 0;
        for (int i = 31; i >= 0; i--) {
            if ((n & (1 << i)) != 0) {
                msb = 1;
                System.out.println(i); // position of msb
                break;
            }
        }
        return msb;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(lsb(n));
        System.out.println(msb(n));
    }
}
