import java.util.*;

public class inputQuestions {
    public static void main(String[] args) {

        // Problem: Take 2 numbers from user and print sum of two numbers.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        System.out.print("Sum is: " + (number1 + number2));
        sc.close();

        // Problem: Take 2 numbers from user and print product of two numbers.
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc1.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc1.nextInt();
        System.out.print("Product is: " + (num1 * num2));
        sc1.close();

        // Problem: Find area of circle.
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        float Radius = sc2.nextFloat();
        float pi = 3.14f;
        System.out.print("Area of circle is: " + (pi * Radius * Radius));
        sc2.close();
    }
}
