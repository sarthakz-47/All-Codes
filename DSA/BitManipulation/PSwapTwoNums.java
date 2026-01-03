package DSA.BitManipulation;

public class PSwapTwoNums {
    public static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b; // (a ^ b) ^ b == a
        a = a ^ b; // (a ^ b) ^ a
        System.out.println("after: ");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }

    public static void main(String[] args) {
        int a = 5, b = 6;
        System.out.println("before: ");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        swap(a, b);
    }
}
