package DSA.Sorting;

public class x {

    // Primitive type example
    public static void changeA(int a) {
        a = 10;
        System.out.println("Inside changeA: a = " + a);
    }

    // Array example
    public static void changeB(int arr[]) {
        arr[2] = 20;
        System.out.print("Inside changeB: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a = 20;
        int arr[] = { 13, 32, 21 };

        System.out.println("Before changeA: a = " + a);
        changeA(a);
        System.out.println("After changeA: a = " + a);

        System.out.print("Before changeB: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        changeB(arr);

        System.out.print("After changeB: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
