import java.util.*;

public class CRUDArrays {

    public static void printOutput(char ch[]) {
        // How to print an array elements?

        // lets consider ch[] array elemetns to be printed
        // we will loop from start to end of the array i.e, 0 -> ch.length

        System.out.println("Elemetns present in array are: ");
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
    }

    public static void takeInput(float values[]) {
        // How to take input in arrays?

        // suppose if we want to take three floating number inputs in array values[]
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three elements: ");
        values[0] = sc.nextFloat();
        values[1] = sc.nextFloat();
        values[2] = sc.nextFloat();

        System.out.println("Entered Elements are (Output): ");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }

        sc.close();
    }

    public static void updateArray(int arr[]) {
        // How to update an array? How to make changes in existing array?
        // lets consider arr[] array in which we have to update all elements to +1

        System.out.println("Elements before updating: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            arr[i]++; // add +1 to each element
        }

        System.out.println("Elements after updating: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void passByRef(int marks[]) {
        // Arrays follows pass by reference in function argumnets
        // Java follows call by value as discussed in back days
        // but if we make changes in helper function using array datatype
        // it will reflect changes in main function after being called

        System.out.println("Elemetns before calling helper function: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        System.out.println("Elemetns after calling helper function: ");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] - 10;
            System.out.print(marks[i] + " ");
        }

    }

    public static void inbuiltFunc(int numbers[]) {
        // <arrayname>.length
        // this is a inbuilt function provided by arrays to find the length of array
        // length of array is nothing but how much elements will fit in it

        System.out.println(numbers.length); // should return 50 in op
    }

    public static void main(String[] args) {
        // How to create an array?
        // there are two methods to create array

        // 1)Pre-defined with values
        int arr[] = { 10, 20, 30 }; // integer type array
        char ch[] = { 'a', 'z', 'x' }; // charachter type array

        // 2)User-defined with size
        int numbers[] = new int[50]; // array of size 50
        float values[] = new float[3]; // which can consist 3 elements
        int marks[] = { 67, 45, 68, 60, 62 };

        printOutput(ch);
        takeInput(values);
        updateArray(arr);
        inbuiltFunc(numbers);
        passByRef(marks);

    }
}
