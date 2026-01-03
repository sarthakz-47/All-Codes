package DSA.Strings;

public class ShortestPath {

    public static float findShortestPath(String str) {
        int x = 0, y = 0; // intially we are at the origin where x=0,y=0
        float shortestPath = 0;
        for (int i = 0; i < str.length(); i++) { // go through each direction
            char n = str.charAt(i);
            if (n == 'E')
                x++; // if east then x++
            else if (n == 'W')
                x--; // if west then x--
            else if (n == 'N')
                y++; // if north then y++
            else
                y--; // if south then y--

            // now calculate (sqrt(x2-x1)^2 + (y2-y1)^2)
            // here x1 and y1 = 0 hence calculate only x2^2 and y2^2
            int x2_square = x * x;
            int y2_square = y * y;

            shortestPath = (float) Math.sqrt(x2_square + y2_square);
        }
        return shortestPath;
    }

    public static void main(String[] args) {
        String str = "WNEENESENNNN";
        System.out.println(findShortestPath(str));
    }
}