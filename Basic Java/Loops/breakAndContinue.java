package Loops;

public class breakAndContinue {
    public static void main(String[] args) {
        // break statement:
        // this break is used when we have to go outside the loop after certain condtion
        // becomes true

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // Continue Statement:
        // this continue statement is used when we have to jump a iteration for a
        // speecefic condition when it becomes true

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.print(i + " ");
        }

    }
}
