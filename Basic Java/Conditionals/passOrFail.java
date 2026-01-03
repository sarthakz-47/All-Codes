package Conditionals;

public class passOrFail {
    public static void main(String[] args) {
        // Problem: take three inputs as marks of three subjects and decide pass or fail
        // according to conditions
        // if marks >= 33 -> pass
        // if marks <33 -> fail

        int sub1 = 30;
        int sub2 = 40;
        int sub3 = 20;
        float avreage = (sub1 + sub2 + sub3) / 3;
        System.out.println("avreage: " + avreage);
        if (avreage >= 33) {
            System.out.println("pass!");
        } else {
            System.out.println("fail!");
        }
    }
}
