package DSA.OOPS;

public class ShallowVsDeepCopy {
    public static void main(String[] args) {
        int[] arr = { 90, 80 };
        Person p1 = new Person("Yogesh", arr);
        Person p2 = p1; // shallow copy

        p2.marks[0] = 100; // changes original object too
        System.out.println(p1.marks[0]); // Output: 100

        Person p3 = new Person(p1); // deep copy

        p3.marks[0] = 100;
        System.out.println(p1.marks[0]); // Output: 90
    }
}

class Person {

    // Shallow copy constructor:
    String name;
    int[] marks;

    Person(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    // Deep copy constructor:
    Person(Person p) {
        this.name = p.name;
        this.marks = p.marks;
    }
}
