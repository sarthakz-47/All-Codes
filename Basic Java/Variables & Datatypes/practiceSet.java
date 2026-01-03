import java.util.*;

public class practiceSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Probelem: Input 3 numbers A,B and C and op avg of 3 nos
        System.out.print("Enter three numbers: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        System.out.println("Avrege of " + A + "," + B + " and " + C + " is: " + ((A +
                B + C) / 3));

        // Probelem: Input side of a square and op area of square
        System.out.print("Enter Side of square: ");
        float side = sc.nextFloat();
        System.out.println("Area of square is: " + (side * side));

        // Problem: Enter cost of 3 items pencil,pen and eraser and op total cost adding
        // 18% gst to final cost
        System.out.print("Enter Prices of pencil,pen and eraser: ");
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total_cost = (pen + pencil + eraser);
        float gst = total_cost * 0.18f;
        float final_cost = total_cost + gst;

        System.out.println("final cost before adding gst is is: " + total_cost);
        System.out.println("gst added: " + gst);
        System.out.println("final cost after adding gst is is: " + final_cost);

        sc.close();
    }
}