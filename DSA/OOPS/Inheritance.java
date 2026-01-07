package DSA.OOPS;

public class Inheritance {
    public static void main(String[] args) {
        Crow c = new Crow();
        c.color();
        // even though color() is defined in parent class it is accesible by child class
        // this is called inheritance
    }
}

// Base / Parent class:
class Animal {
    // Basic Properties of Base Class:
    String name;
    int age;

    // Methods of Base class:
    void eat() {
        System.out.println("Animal eats.");
    }

    void color() {
        System.out.println("Black");
    }

}

// Child Class: use extends keyword to get properties inherited from parent
class Crow extends Animal {
    // Properties of child class:
    String color;
    String type;

    void caw() {
        System.out.println("crow cows.");
    }

    void fly() {
        System.out.println("crow flyes.");
    }
}