package DSA.Strings;

public class StringBuilderBasics {
    public static void main(String[] args) {
        // declaration or creation:
        StringBuilder sb = new StringBuilder("Hello");
        // .append function:
        for (char i = 'a'; i <= 'z'; i++) {
            sb.append(i);
        }
        // printing String Builder:
        for (int i = 0; i < sb.length(); i++) {
            System.out.print(sb.charAt(i) + " ");
        }
    }
}
