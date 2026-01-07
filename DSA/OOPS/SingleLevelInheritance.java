package DSA.OOPS;

public class SingleLevelInheritance {
    public static void main(String[] args) {
        CrowA c = new CrowA();
        c.sleep();
    }
}

// Single Level Inheritance:
// When single child class derived from one base class.

// Parent Class:
class AnimalA {
    String name;
    int age;

    void eat() {
        System.out.println("Animal eats.");
    }

    void sleep() {
        System.out.println("Animal Sleeps.");
    }
}

// Child Class:
class CrowA extends AnimalA {
    int feathers;
    String color;

    void caws() {
        System.out.println("Crow Caws!");
    }
}
