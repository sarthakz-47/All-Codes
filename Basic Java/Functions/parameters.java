package Functions;

public class parameters {
    public static int sum(int a, int b) { // Formal Parameters
        // What are parameters now?
        // parameters are input came from main class
        // here a=10 and b=5 are known vaue came from main function we didnt define it
        // here
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println(sum(a, b)); // Actual Parameters or Arguments
    }
}
