package DSA.BitManipulation;

public class PSetRightmostBit {

    public static int setRightmostBit(int n) {
        return n | (n + 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(setRightmostBit(n));
    }
}
