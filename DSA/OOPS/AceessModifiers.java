package DSA.OOPS;

class ClassA {
    private int privateVar = 1;
    int defaultVar = 2; // default
    protected int protectedVar = 3;
    public int publicVar = 4;

    public void printVars() {
        System.out.println("Inside ClassA:");
        System.out.println("privateVar = " + privateVar);
        System.out.println("defaultVar = " + defaultVar);
        System.out.println("protectedVar = " + protectedVar);
        System.out.println("publicVar = " + publicVar);
    }
}

// Subclass of ClassA
class SubClassA extends ClassA {
    void showVars() {
        System.out.println("\nInside SubClassA:");
        // System.out.println(privateVar); // ❌ Not accessible
        System.out.println("defaultVar = " + defaultVar); // ✅ Works (same package)
        System.out.println("protectedVar = " + protectedVar); // ✅ Works
        System.out.println("publicVar = " + publicVar); // ✅ Works
    }
}

// Another class, not a subclass
class OtherClass {
    void showVars() {
        ClassA a = new ClassA();
        System.out.println("\nInside OtherClass:");
        // System.out.println(a.privateVar); // ❌ Not accessible
        System.out.println("defaultVar = " + a.defaultVar); // ✅ Works (same package)
        System.out.println("protectedVar = " + a.protectedVar); // ✅ Works (same package)
        System.out.println("publicVar = " + a.publicVar); // ✅ Works
    }
}

public class AceessModifiers {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.printVars();

        SubClassA sub = new SubClassA();
        sub.showVars();

        OtherClass other = new OtherClass();
        other.showVars();
    }
}
