package Conditionals;

import java.util.*;

public class calculatorUsingSwtich {
    public static void main(String[] args) {
        // Problem: Build a simple calculator using switch
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to 991-EsPlus");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Divison");
        System.out.println("Enter Operation to perform: ");
        int input = sc.nextInt();

        System.out.println("Enter two operands: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        switch (input) {
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("enter valid input!");
        }
        sc.close();
    }
}
