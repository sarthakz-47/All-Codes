package Patterns;

public class AdvPatterns {

    // 1.Hollow Rectangle:
    public static void hollowRect(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // 2.Solid Rhombus:
    public static void solidRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // print spaces first:
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // then print stars next:
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    // 3.Hollow Rhombus Pattern:
    public static void hollowRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // print spaces first:
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // then print stars next:
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

    }

    // 4.Butterfly Pattern:
    public static void butterflyPattern(int n) {
        for (int i = 1; i <= n; i++) {

            // 1.print stars:
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // 2.print spaces:
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // 3.print stars again:
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n; i >= 1; i--) {

            // 1.print stars:
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // 2.print spaces:
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // 3.print stars again:
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        // hollowRect(n);
        // solidRhombus(n);
        // hollowRhombus(n);
        // butterflyPattern(n);
    }
}
