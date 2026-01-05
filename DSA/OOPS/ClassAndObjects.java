package DSA.OOPS;

public class ClassAndObjects {
    public static void main(String[] args) {
        // object creation:
        // object s of class student:
        // This allows you to access the variables (rollno, name, age) and methods
        // (getname(), getage()) of that class.

        Student s = new Student();
        s.getName();
        s.getRollNo();
        s.getAge();
    }
}

// class creation:
class Student {
    // Variables:
    int rollno = 21;
    String name = "Rani";
    int age = 20;

    // Methods:
    void getAge() {
        System.out.print(age + " ");
    }

    void getName() {
        System.out.print(name + " ");
    }

    void getRollNo() {
        System.out.print(rollno + " ");
    }
}
