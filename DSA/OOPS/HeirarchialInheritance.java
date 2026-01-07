package DSA.OOPS;

public class HeirarchialInheritance {
    public static void main(String[] args) {
        Mamals m = new Mamals();
        m.breath();
    }
}

// Heirarchical Inheritance:
// When multiple child classes derived from one base class.

// Parent class:
class AnimalB {

    void eat() {
        System.out.println("eats!");
    }

    void breath() {
        System.out.println("breaths!");
    }
}

// Derived class 1 from parent class:
class Fish extends AnimalB {

    void swim() {
        System.out.println("swims!");
    }

}

// Derived class 2 from parent class:
class Bird extends AnimalB {

    void fly() {
        System.out.println("flyes!");
    }

}

// Derived class 3 from parent class:
class Mamals extends AnimalB {

    void wallk() {
        System.out.println("wallks!");
    }

}
