package DSA.BitManipulation;

public class PIsolateLowestSetBit {
    public static int isolateBit(int x) {
        return x & (~x);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(isolateBit(n));
    }
}
