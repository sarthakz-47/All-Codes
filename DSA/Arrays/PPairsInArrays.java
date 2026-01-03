public class PPairsInArrays {

    static void printPairs(int[] arr) {
        int totalPairs = 0;

        for (int i = 0; i < arr.length; i++) { // outer loop through each element
            for (int j = i + 1; j < arr.length; j++) { // inner loop starting from next element from outer loop
                System.out.print("(" + arr[i] + "," + arr[j] + ")"); // just print all the possible pairs
                totalPairs++; // upadre total pairs count
            }
            System.out.println();
        }
        System.out.println("Toatal Paris: " + totalPairs);
    }

    public static void main(String[] args) {
        int arr[] = { 8, 2, 5, 24, 7, 25 };
        printPairs(arr);
    }
}
