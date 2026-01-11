package DSA.OOPS;

public class Static {
    public static void main(String[] args) {
        // for static variable:
        StudentX s = new StudentX();
        StudentX s1 = new StudentX();
        s.name = "Sarthak";
        s1.name = "Sonali";
        // call class directly because static variable is there
        StudentX.schoolCode = 101;
        // schoolCode is shared by both s and s1.
        s.printDetails();
        s1.printDetails();

        // for static method:
        int result = findSquare.square(5);
        System.out.println(result);
    }
}

// 1.Static Variables:
class StudentX {

    String name; // Instance Variable
    static int schoolCode; // static variable

    void printDetails() {
        System.out.println(name + "," + schoolCode);
    }

}

// 2. Static Method:
class findSquare {
    int n;

    // static method
    static int square(int n) {
        return n * n;
    }

}
