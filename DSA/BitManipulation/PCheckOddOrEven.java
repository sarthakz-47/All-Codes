package DSA.BitManipulation;

public class PCheckOddOrEven {
    public static void checkOddEven(int n) {
        if ((n & 1) == 1) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }
    }

    public static void main(String[] args) {
        int n = 88;
        checkOddEven(n);

    }
}
