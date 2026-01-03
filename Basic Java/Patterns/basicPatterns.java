package Patterns;

public class basicPatterns {
    // 1.Filled Rectangle Pattern:
    public static void rectangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 2.Left-Bottom Pyramid:
    public static void LBpyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i - j >= 0) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    // 3. Right-Top Pyramid:
    public static void RTpryramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i - j <= 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // 4.Right-Bottom pyramid:
    public static void RBpryramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j >= n + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // 5.Left-Top Pyramid:
    public static void LTpryramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j <= n + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // 6.Count Pattern:
    public static void countPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i - j >= 0) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    // 7. Floyds Pattern:
    public static void floydsTraingle(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i - j >= 0) {
                    System.out.print(count);
                    count++;
                }
            }
            System.out.println();
        }
    }

    // 8.Character Pattern:
    public static void charPattern(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i - j >= 0) {
                    System.out.print(ch);
                    ch++;
                }
            }
            System.out.println();
        }
    }

    // 9. Zero-One Pattern:
    public static void zeroOne(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("0");
                else
                    System.out.print("1");
            }
            System.out.println();
        }
    }

    // 10.X pattern:
    public static void xPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || (i + j) == n + 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 3;
        // rectangle(n);
        // LBpyramid(n);
        // RTpryramid(n);
        // RBpryramid(n);
        // LTpryramid(n);
        // countPattern(n);
        // floydsTraingle(n);
        // charPattern(n);
        // zeroOne(n);
        xPattern(n);
    }
}
