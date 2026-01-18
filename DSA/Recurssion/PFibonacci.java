package DSA.Recurssion;

public class PFibonacci {
    public static int fibo(int n) {
        // base case for fibonacci series:
        if (n == 0 || n == 1)
            return 1;

        // calculate n-1 th term:
        int f1 = fibo(n - 1);

        // calculate n-2 th term:
        int f2 = fibo(n - 2);

        // calculate nth fibonaci term:
        return f1 + f2;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(fibo(n));
    }
}
