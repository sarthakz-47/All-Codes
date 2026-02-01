package DSA.Recurssion;

public class PFriendsPairing {
    public static void main(String[] args) {
        solution s = new solution();
        System.out.println(s.countFriendsPairings(4));
    }
}

class solution {
    public int countFriendsPairings(int n) {
        // Base Case:
        if (n == 0 || n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        // Work:
        // Here also two choices are there so:
        // 1.Stay single: then we have to make choices for n - 1 other candidates
        int single = countFriendsPairings(n - 1);
        // 2.Make a pair: here if we make a pair we need to make choices for other n - 2
        // other choices
        // but the twist is to make a pair we have n-1 choices hence we have to call
        // (n-1)*(n-2)
        int pair = (n - 1) * countFriendsPairings(n - 2);
        return single + pair;
    }
}
