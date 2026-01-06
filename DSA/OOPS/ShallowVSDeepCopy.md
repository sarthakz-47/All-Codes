1. Shallow Copy
A shallow copy creates a new array, but the elements inside still reference the same objects. That means changes to the objects inside the new array also affect the original array.

Example:
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

public class ShallowCopyExample {
    public static void main(String[] args) {
        Person[] original = { new Person("Alice"), new Person("Bob") };

        // Shallow copy using clone
        Person[] shallowCopy = original.clone();

        // Change the name of the first person in shallowCopy
        shallowCopy[0].name = "Charlie";

        // Check original array
        System.out.println(original[0].name); // Output: Charlie
    }
}
✅ Observation: Changing shallowCopy[0].name also changed original[0].name because both arrays point to the same Person objects.

2. Deep Copy
A deep copy creates a new array and new objects inside. Changes to the new array do not affect the original array.

Example:
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    // Copy constructor for deep copy
    Person(Person other) {
        this.name = other.name;
    }
}

public class DeepCopyExample {
    public static void main(String[] args) {
        Person[] original = { new Person("Alice"), new Person("Bob") };

        // Deep copy
        Person[] deepCopy = new Person[original.length];
        for (int i = 0; i < original.length; i++) {
            deepCopy[i] = new Person(original[i]); // create new objects
        }

        // Change the name of the first person in deepCopy
        deepCopy[0].name = "Charlie";

        // Check original array
        System.out.println(original[0].name); // Output: Alice
    }
}
✅ Observation: Now, changing deepCopy[0].name does not affect the original array because each element is a new Person object.