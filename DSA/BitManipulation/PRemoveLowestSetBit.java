package DSA.BitManipulation;

public class PRemoveLowestSetBit {
    public static int removeLastBit(int x) {
        return x & (x - 1);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(removeLastBit(n));
    }
}
