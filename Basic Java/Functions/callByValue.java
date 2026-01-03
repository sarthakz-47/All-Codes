package Functions;

public class callByValue {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("**Inside swap Function**");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);

        System.out.println("**Inside Main Function**");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }

    // When you pass a variable to a function,
    // Java passes a copy of the variable’s value.
    // And JAVA strictly follows Call by value.
}
