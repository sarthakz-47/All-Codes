package DSA.Strings;

public class LargestString {
    public static void largestString(String str[]) {
        String largest = str[0]; // let us assume largest string is first string
        for (int i = 1; i < str.length; i++) { // move from 1 to n-1
            if (largest.compareTo(str[i]) < 0) { // compare largest with next string
                largest = str[i]; // if current string is greater than largest, in which .compareTo() returns -ve
            } // upatate largest string to current string
        }
        System.out.println(largest);
    }

    public static void main(String[] args) {
        String str[] = { "apple", "mango", "ball" };
        largestString(str);
    }
}
