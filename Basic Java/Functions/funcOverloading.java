package Functions;

public class funcOverloading {
    // function overloading using parameters->

    // function to calculate sum of 2 numbers->
    public static int sum(int a, int b) {
        return a + b;
    }

    // function to calculate sum of 3 numbers->
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // function overloading using datatypes->

    // function to calculate prod of 2 integer numbers->
    public static int prod(int x, int y) {
        return x * y;
    }

    // function to calulate prod of 2 floating numbers->
    public static float prod(float x, float y) {
        return x * y;
    }

    public static void main(String[] args) {
        System.out.println("**Using Parameters**");
        System.out.println(sum(3, 2));
        System.out.println(sum(1, 2, 3));
        System.out.println("**Using Datatypes**");
        System.out.println(prod(3, 2));
        System.out.println(prod(1.5f, 2.0f));
    }

    // Function overloading is used to do a single work using same name of the
    // function
    // differ by either parameters or datatypes
}
