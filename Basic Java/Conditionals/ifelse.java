package Conditionals;

public class ifelse {
    public static void main(String[] args) {
        // What is If-Else?
        // it is an conditional statement which is used to execute the required part
        // only
        // if-> runs only when condition inside it is true
        // else-> runs when conditon is false

        int age = 20;
        if (age >= 18 && age <= 50) {
            System.out.println("you are a young man!");
        } else {
            System.out.println("you are not young enough.");
        }
    }
}
