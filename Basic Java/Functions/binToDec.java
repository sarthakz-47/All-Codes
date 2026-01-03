package Functions;

public class binToDec {
    public static int convertBinToDec(int n) {
        int decNum = 0;
        int pow = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            decNum += lastDigit * Math.pow(2, pow);
            pow++;
            n /= 10;
        }
        return decNum;
    }

    public static void main(String[] args) {
        int n = 1010;
        System.out.println(convertBinToDec(n));
    }
}
