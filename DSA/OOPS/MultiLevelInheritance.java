package DSA.OOPS;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sleep();
        d.bark();
    }
}

// Multi Level Inheritance:
// When child class derived from other child class which ichild class is
// derived from parent class- A(Parent)->B(derived class 1)->C(derived class 2)

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

// Child Class: (derived class 1)
class Mamal extends AnimalA {
    int legs;
    String color;

    void speak() {
        System.out.println("Mamal Speaks!");
    }
}

// another child class: (derived class 2)
class Dog extends Mamal {
    int legs;
    String color;

    void bark() {
        System.out.println("Dog Barks!");
    }
}
