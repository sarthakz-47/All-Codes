package Loops;

public class whilePrintOnetoN {
    public static void main(String[] args) {
        // Problem: Print numbers from 1 to N using while loop
        int count = 1;
        int N = 100;
        while (count <= N) {
            System.out.print(count + " ");
            count++;
        }
    }

}
