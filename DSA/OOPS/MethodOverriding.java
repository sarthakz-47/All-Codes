package DSA.OOPS;

public class MethodOverriding {
    public static void main(String[] args) {
        AnimalD a = new AnimalD();
        a.eat();
        Deer d = new Deer();
        d.eat();
    }
}

class AnimalD {
    // Same function name in parent and child class:
    void eat() {
        System.out.println("eats anything!");
    }
}

class Deer extends AnimalD {
    // Same function name in parent and child class:
    void eat() {
        System.out.println("eats only grass!");
    }
}
