package Operators;

public class unaryOp {
    public static void main(String[] args) {
        // Unary Operator:
        // means the operator which needs only one variable and nothing else
        // there are two types: 1)Increment(++) -> i)Pre(++a) and ii)post(a++)
        // 2)Decreament(--) -> i)Pre(--x) and ii)post(x--)

        // Pre:
        int a = 10;
        int b = a++;
        System.out.println(a);
        System.out.println(b);

        // Post:
        int x = 20;
        int y = ++x;
        System.out.println(x);
        System.out.println(y);
    }
}
