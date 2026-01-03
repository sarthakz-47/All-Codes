import java.util.*;

public class input {
    public static void main(String[] args) {

        // How to take Input from user?
        // for that we need to import a package named java.util.* or java.util.Scanner
        // this class enables all inbuilt features in java
        // along with that we need to create an object in our actual code which will
        // call that package and use the utilities here is the line to include:
        // Scanner sc = new Scanner(System.in);

        Scanner sc = new Scanner(System.in);
        // now to take input there are diff methods are there to take input
        int num1 = sc.nextInt(); // used to store int input from user
        float num2 = sc.nextFloat(); // used to store float input from user
        sc.nextLine();
        String name = sc.nextLine(); // used to store string input from user
        long num3 = sc.nextLong(); // used to store long input from user
        Double num4 = sc.nextDouble(); // used to store Double input from user
        char symbol = sc.next().charAt(0); // used to store char input from user

        System.out.println("int input: " + num1);
        System.out.println("float input: " + num2);
        System.out.println("long input: " + num3);
        System.out.println("double input: " + num4);
        System.out.println("char input: " + symbol);
        System.out.println("string input: " + name);

        // make sure you close the scanner using:
        sc.close();

    }
}
