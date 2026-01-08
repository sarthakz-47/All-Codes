package DSA.OOPS;

public class AbstractClass {
    public static void main(String[] args) {

        // Abstraction
        // Omini o = new Omini();
        // Fortuner f = new Fortuner();

        // o.cartype(); // calls Omini's cartype()

        // f.cartype(); // calls Fortuner's cartype()

        OminiX x = new OminiX();
        x.carname();
        // CarA -> Omini -> OminiX Constructor calling pattern

    }
}

// Abstract class
abstract class CarA {

    // Abstract method (no body)
    abstract void cartype();

    // Non-abstract method
    void start() {
        System.out.println("Car starts!");
    }

    CarA() {
        System.out.println("Constructor called");
    }

}

// Child class 1
class Omini extends CarA {

    Omini() {
        System.out.println("Omini constructor called");
    }

    // Must override abstract method
    @Override
    void cartype() {
        System.out.println("Compact Car");
    }

    void carname() {
        System.out.println("Omini");
    }
}

// Child class 2
class Fortuner extends CarA {

    Fortuner() {
        System.out.println("Fortuner constructor called");
    }

    // Must override abstract method
    @Override
    void cartype() {
        System.out.println("SUV");
    }

    void carname() {
        System.out.println("Fortuner Legender");
    }
}

class OminiX extends Omini {
    OminiX() {
        System.out.println("OminiX constructor called.");
    }
}
