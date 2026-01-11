package DSA.OOPS;

public class Interfaces {
    public static void main(String[] args) {

        // AnimalX a = new AnimalX(); // Cannot create objects of Interfaces
        DogX d = new DogX();
        CatX c = new CatX();
        d.sound();
        c.eat();

        Duck du = new Duck();
        du.fly();

        CarX ca = new CarX();
        ca.start();
        VehicleX.honk(); // even though we cannot call the interface objects
    }
}

interface AnimalX {
    // abstract methods by default
    // which dont have any body
    void sound();

    void eat();

}

// like class can be inherited by keyword -> extends
// interfaces can be inherited by keyword -> implements
class DogX implements AnimalX {
    // Must implement abstract method sound()
    public void sound() {
        System.out.println("Bhaw!");
    }

    // Must implement abstract method eat()
    public void eat() {
        System.out.println("eats pedegree!");
    }

}

// another class cat:
class CatX implements AnimalX {

    public void sound() {
        System.out.println("Meow!");
    }

    public void eat() {
        System.out.println("eats fish!");
    }
}

// How to Acheive multiple inhertance:
// First Interface:
interface Flyable {
    int age = 18;

    void fly();
}

// Second Interface:
interface Swimmable {
    void swim();
}

// class duck implementing two interfaces -> Flyable and Swimmable
class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Duck is flying");
    }

    public void swim() {
        System.out.println("Duck is swimming");
    }
}

// Interfaces methods can have body by using keywords like:
// static and default:
interface VehicleX {
    void start();

    default void stop() {
        System.out.println("Vehicle stopped");
    }

    static void honk() {
        System.out.println("Vehicle honks");
    }
}

class CarX implements VehicleX {
    public void start() {
        System.out.println("Car started");
    }
}
