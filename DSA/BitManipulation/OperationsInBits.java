package DSA.BitManipulation;

public class OperationsInBits {

    public static int getIthBit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int clearIthBit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static int updateIthBit(int n, int i, int newbit) {
        if (newbit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }
    }

    public static int clearLastIBits(int n, int i) {
        int bitmask = (-1) << i;
        return n & bitmask;
    }

    public static int clearRangeOfBits(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int bitmask = a | b;
        return n & (bitmask);
    }

    public static void powerOf2OrNot(int n) {
        if ((n & (n - 1)) == 0) {
            System.out.println(n + " is power of 2.");
        } else {
            System.out.println(n + " is not power of 2.");
        }
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void checkIthBitSetOrNot(int n, int i) {
        if ((n & (1 << i)) == 0) {
            System.out.println("ith bit is not set.");
        } else {
            System.out.println("ith bit is set.");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int i = 2;
        // int j = 4;
        // int newbit = 1;
        // System.out.println(getIthBit(n, i));
        // System.out.println(setIthBit(n, i));
        // System.out.println(clearIthBit(n, i));
        // System.out.print(updateIthBit(n, i, newbit));
        // System.out.println(clearLastIBits(n, i));
        // System.out.println(clearRangeOfBits(n, i, j));
        // powerOf2OrNot(n);
        // System.out.println(countSetBits(n));
        checkIthBitSetOrNot(n, i);
    }
}
