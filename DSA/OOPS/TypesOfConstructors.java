package DSA.OOPS;

public class TypesOfConstructors {
    public static void main(String[] args) {
        // 1.Default Constructor:
        // Pen p = new Pen();

        // 2.Parametarized Constructor:
        // This will invoke the parameterized constructor
        Sarthak s = new Sarthak("Sarthak", 13);
        s.display();

        // 3.Copy constructor:
        // This would invoke the copy constructor
        Adarsh a = new Adarsh("adarsh", 20);
        Adarsh a1 = new Adarsh(a);
        System.out.println(a1.age);

    }
}

class Pen {
    // Default Constructor: No parameters passed
    Pen() {
        System.out.println("Default Constructor called...");
    }
}

class Sarthak {
    int age;
    String name;

    // Parameterized constructor: Parameters are passed
    Sarthak(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(age + " " + name);
    }
}

class Adarsh {
    int age;
    String name;

    // Parameterized constructor: Parameters are passed
    Adarsh(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor:
    Adarsh(Adarsh a) {
        this.name = a.name;
        this.age = a.age;
    }

    void display() {
        System.out.println(age + " " + name);
    }
}
