package Loops;

public class sumOfNnaturalNos {
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;
        int n = 10;
        while (count <= n) {
            sum += count;
            count++;
            System.out.print(sum + " ");
        }
        System.out.println("final sum is: " + sum);
    }
}