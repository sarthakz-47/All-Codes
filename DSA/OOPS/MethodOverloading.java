package DSA.OOPS;

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.sum(2, 2));
        System.out.println(c.sum(2f, 2f));
        System.out.println(c.sum(2, 2, 2));
    }
}

// Method Overloading:
// defining multiple methods with the same name in the same class,
// but with different parameter lists.
class Calculator {
    // sum -> method with const name
    // 2 int parameters:
    int sum(int a, int b) {
        return a + b;
    }

    // 2 float parameters:
    float sum(float a, float b) {
        return a + b;
    }

    // 3 int parameters:
    int sum(int a, int b, int c) {
        return a + b + c;
    }
}