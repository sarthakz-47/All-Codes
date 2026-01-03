package DSA.BitManipulation;

public class PUpperToLowerCase {
    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'z'; ch++) {
            char result = (char) (ch | ' ');
            System.out.print(result);
        }
    }
}
