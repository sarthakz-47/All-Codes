package Functions;

public class decToBin {
    public static int convertDecToBin(int n) {
        int binNum = 0;
        int pow = 0;

        while (n > 0) {
            int remainder = n % 2;
            binNum += remainder * (int) Math.pow(10, pow);
            pow++;
            n /= 2;
        }

        return binNum;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(convertDecToBin(n));
    }
}
