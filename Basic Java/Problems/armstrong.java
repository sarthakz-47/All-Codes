package Problems;

public class armstrong {

    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static int calculateCube(int n) {
        int digits = countDigits(n);
        int cube = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            cube += Math.pow(lastdigit, digits);
            n /= 10;
        }
        return cube;
    }

    public static boolean checkArmstrong(int n) {
        if (calculateCube(n) == n) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 153;
        // System.out.println(countDigits(n));
        // System.out.println(calculateCube(n));
        System.out.println(checkArmstrong(n));
    }
}
