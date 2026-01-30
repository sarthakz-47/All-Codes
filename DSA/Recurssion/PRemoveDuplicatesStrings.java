package DSA.Recurssion;

class removeDuplicates {
    public static String duplicates(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (result.indexOf(c) == -1) {
                result += c;
            }
        }
        return result;
    }

    public static void remove(String str, StringBuilder sb) {
        // Base case: if string becomes empty:
        if (str.isEmpty()) {
            return;
        }

        // work:

        // assign first char everytime:
        char firstChar = str.charAt(0);

        // if first character is not in the stringbuilder then append it:
        if (sb.indexOf(String.valueOf(firstChar)) == -1) {
            sb.append(firstChar);
        }

        // if the character is in the string builder then do not add,recursively call:
        // from the rest of the string which always starts from 1 which do not include
        // current charachter:
        remove(str.substring(1), sb);

    }

    public static void main(String[] args) {
        String str = "sarthak";
        StringBuilder sb = new StringBuilder("");

        System.out.println("before: " + str);
        remove(str, sb);
        System.out.println("after: " + sb);

    }
}
