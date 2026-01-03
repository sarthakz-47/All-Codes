package Conditionals;

public class largetOfThree {
    public static void main(String[] args) {
        // Problem: Find largest number from three.
        int a = 10, b = 5, c = 20;
        if (a > b && a > c) {
            System.out.println(a + " is greatest.");
        } else if (b > c) {
            System.out.println(b + " is greatest.");
        } else {
            System.out.println(c + " is greatest.");
        }

    }
}
