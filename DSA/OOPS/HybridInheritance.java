package DSA.OOPS;

public class HybridInheritance {
    public static void main(String[] args) {
        Shark s = new Shark();
        s.eat();
        s.swim();
        Peacock p = new Peacock();
        p.fly();
    }
}

// Parent class:
class AnimalC {

    void eat() {
        System.out.println("eats!");
    }

    void breath() {
        System.out.println("breaths!");
    }

}

// Child Class Fish:
class FishA extends AnimalC {

    void swim() {
        System.out.println("swims!");
    }

}

// Child class Bird:
class BirdA extends AnimalC {

    void fly() {
        System.out.println("flyes!");
    }

}

// Another child class shark which is derived from fish
class Shark extends FishA {

    void size() {
        System.out.println("Big!");
    }

}

// Another child class Tuna which is derived from fish
class Tuna extends FishA {

    void shape() {
        System.out.println("Round!");
    }
}

// Another child class peacock which is derived from bird
class Peacock extends BirdA {

    void color() {
        System.out.println("Purple!");
    }
}