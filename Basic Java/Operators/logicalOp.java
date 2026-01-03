package Operators;

public class logicalOp {
    public static void main(String[] args) {
        // Logical Operators:
        // includes AND(&&), OR(||) and NOT(!) operators
        // again used to check various conditions of the program
        int a = 10;
        int b = 5;

        System.out.println(a > b && b > a); // returns true if both conditions are true, else false
        System.out.println(a > b || b > a); // returns true if any one condition is true, else false
        System.out.println(!(a > b)); // converts true->false and vice-versa
    }
}
