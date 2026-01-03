package Conditionals;

public class ternaryOp {
    public static void main(String[] args) {
        // What is Ternary Operator?
        // it is also a conditon checker where it have diffrent syntax
        // but same mechanism as if-else statements
        // Syntax-> variable = condition ? result1 : result2;

        int age = 20;
        String vote = (age >= 18) ? "Eligible for voting" : "Not Eligible for voting";
        System.out.println(vote);

        // if condition is true then it returns first result
        // if not it returns second result
    }
}
