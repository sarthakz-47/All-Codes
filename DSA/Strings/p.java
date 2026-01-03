package DSA.Strings;

public class p {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hi");

        // Thread 1 and Thread 2 both modify sb at same time
        sb.append("A");
        sb.append("B");
        System.out.println(sb);

        StringBuffer sb2 = new StringBuffer("Hi");

        // Only one thread can modify at a time
        sb2.append("A");
        sb2.append("B");
        System.out.println(sb2);
    }
}
