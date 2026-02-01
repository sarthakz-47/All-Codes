package DSA.Recurssion;

public class PBinaryStrings {
    public static void main(String[] args) {
        solution s = new solution();
        System.out.println(s.countStrings(3, 0));
    }
}

class solution {
    public int countStrings(int n, int prev) {
        // Base Case:
        if (n == 0)
            return 1;

        // Work:
        // We have to always place 0 there for any position no restrictions are there on
        // 0, hence set prev to 0:
        int count = countStrings(n - 1, 0);

        // And only if the prev position is 0 then put 1 else do not:
        // hence set prev to 1:
        if (prev == 0) {
            count += countStrings(n - 1, 1);
        }

        return count;
    }
}
