package Loops;

public class printReverseOfNum {
    public static void main(String[] args) {
        int num = 321;
        while (num > 0) {
            int lastdigit = num % 10;
            System.out.print(lastdigit);
            num /= 10;
        }
    }
}
