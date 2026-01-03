package DSA.Strings;

public class ToUpperCase {

    public static String toUpperCase(String name) {
        // first we will create a string builder to store the updated string:
        StringBuilder sb = new StringBuilder("");

        // now as we know first letter is always captial so:
        char ch = Character.toUpperCase(name.charAt(0));
        sb.append(ch);

        // loop through reamining part of string:
        for (int i = 1; i < name.length(); i++) {
            // if curr char is space and we are inside the string like last word then:
            if (name.charAt(i) == ' ' && i < name.length() - 1) {
                // first append the space:
                sb.append(name.charAt(i));
                // then move to starting char of new word:
                i++;
                // and now use .toUpperCase() on curr char:
                char ch2 = Character.toUpperCase(name.charAt(i));
                // simply update the main stringbuilder:
                sb.append(ch2);
            } else {
                // when its not first word of the new word simply append to the string:
                sb.append(name.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String name = "hi im sarthak!";
        System.out.println(toUpperCase(name));
    }
}
