package DSA.Recurssion;

public class PTowerofHanoi {
    public static void main(String[] args) {
        tower t = new tower();
        t.toh(3, 'A', 'C', 'B');
    }
}

class tower {
    public void toh(int n, char A, char C, char B) {

        // Base case:
        if (n == 1) {
            System.out.println("Move disk 1 from " + A + " to " + C);
            return;
        }

        // Work:
        // Step 1: Move (n-1) disks from A (Source) to B (Helper)
        toh(n - 1, A, B, C);

        // Step 2: Move the nth disk from A (source) to C (destination)
        System.out.println("Move disk " + n + " from " + A + " to " + C);

        // Step 3: Move n-1 disks from B (helper) to C (destination)
        toh(n - 1, B, C, A);

    }
}
