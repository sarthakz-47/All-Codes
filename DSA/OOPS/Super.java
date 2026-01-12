package DSA.OOPS;

public class Super {
    public static void main(String[] args) {
        // 1.Acess Parent Variable:
        Oneplus o = new Oneplus();
        o.printColor();

        // 2.Acess Parent Method:
        DogZ d = new DogZ();
        d.eat();
        d.callParentEatMethod();

        // 3.Acess Parent Constructor:
        DogQ d1 = new DogQ();

        // without super:
        CatQ c = new CatQ();

    }
}

// 1.Acess Parent Variable:
class Smartphone {
    String color = "Black";
}

class Oneplus extends Smartphone {
    String color = "White";

    void printColor() {
        System.out.println(color); // White (child)
        System.out.println(super.color); // Black (parent)
    }
}

// 2. Acess Parent Method:
class AnimalZ {
    void eat() {
        System.out.println("Animal Eating");
    }
}

class DogZ extends AnimalZ {
    @Override
    void eat() {
        System.out.println("Dog Eating");
    }

    void callParentEatMethod() {
        super.eat();
    }
}

// 3.Acess Parent Construcor:
class AnimalQ {
    AnimalQ() {
        System.out.println("Animal Constructor...");
    }
}

class DogQ extends AnimalQ {
    DogQ() {
        super(); // calls Parent constructor
        System.out.println("Dog Constructor...");
    }
}

// without super() it calls parent constructor:
// by dedault in java
class CatQ extends AnimalQ {
    CatQ() {
        System.out.println("Cat Constructor...");
    }
}
