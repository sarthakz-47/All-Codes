package Loops;

public class whileLoop {
    public static void main(String[] args) {
        // what is loop? how much types of loops?
        // Loop is the repetitive task block of code which is
        // used to reduce the lines of code
        // there are mainly three types of loops 1)while 2)for 3)do-while

        // in while loop there is a condition, the loop will run again and again till
        // condition is true, once the condition becomes false it gets out from the loop
        int number = 5;
        while (number > 0) {
            number--;
            System.out.print(number + " ");
        }

        // in above example loop runs till number becomes 0 or <0
        // then it stopped printing and get out from the loop
    }
}
