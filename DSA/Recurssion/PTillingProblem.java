package DSA.Recurssion;

class PTillingProblem {
    public static int fittedTiles(int n) {
        // Base case:
        if (n == 0 || n == 1) {
            return 1;
        }

        // work / recursive call:
        // we have two choices:
        // 1) to place the tiles vertically
        // 2) to place tileshorizontally

        // 1.when we place a tile vertically we have to fill rest (n-1) space
        int verticleTiles = fittedTiles(n - 1);
        // 2. when we place a tile horizontally we have to fill rest (n-2) space
        int horizontalTiles = fittedTiles(n - 2);

        // we have to return all possible choices for n:
        return verticleTiles + horizontalTiles;

    }

    public static void main(String[] args) {
        System.out.println(fittedTiles(3));
    }
}
