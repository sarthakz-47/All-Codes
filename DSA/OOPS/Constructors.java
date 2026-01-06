package DSA.OOPS;

public class Constructors {
    public static void main(String[] args) {
        Yogesh y = new Yogesh();
        System.out.println(y.id);
        System.out.println(y.name);
    }
}

class Yogesh {
    int id;
    String name;

    // Constructor:
    // Must have same name as class:
    Yogesh() {
        id = 101;
        name = "yogesh";
    }
}
