package DSA.OOPS;

import java.util.Scanner;

class PracticeQuestions {
    public static void main(String[] args) {
        // Q.1
        Student s = new Student();
        // fill here correct opt:
        s.name = "aman";
        System.out.println(s.name);

        // Q.5
        VehicleW obj1 = new CarW();
        obj1.print();

        VehicleW obj2 = new VehicleW();
        obj2.print();

        // Q.6
        VehicleR obj3 = new CarR();
        // obj3.print1(); ERROR

        VehicleR obj4 = new VehicleR();
        obj4.print();

        // Q.7
        System.out.println(Book.count);
        Book b1 = new Book(150);
        Book b2 = new Book(250);
        System.out.println(Book.count);

        Zar z = new Electric();
        String result = z.drive();
        System.out.println(result);
    }
}

// Q.1 Find out correct statement to assign name to object
// a.s->name = "aman"
// b.Student.name = "aman"
// c. s.name = "aman"
class Student {
    String name;
    int marks;
}

// Q.2 Which variables can the class Student acess in the following code?
// a.name ✓
// b.marks ✓
// c. rollNumber ✗
// d.schoolName ✗

class Person extends Student {
    int rollNumber;
    String schoolName;
}

// because parent class cannot acess child class members directly
// but child class can acess parent class variables and self also

// Q.3 Which of the following modifiers are not allowed in front of class?
// a.private ✗
// b.protected ✗
// c. public ✓
// d.default ✓

// because if we make a class private or protected then we cannot create objects
// of that private or protected class in main method, it is simply unsuable

// Q.4 Which of the following is a correct statement?
class vheicle {
}

class Car extends vheicle {
}
// a.Car c = new Car() ✓
// b.vheicle v = new Vheicle() ✓
// c.Car c = new vheicle() ✗
// d.vheicle c = new car() ✓

// because parent refernce = child object -> allowed
// child refernce = prent object -> not allowed
// reference = left side and object = right side

// Q.5 What will be output of this code?
class VehicleW {
    void print() {
        System.out.println("Base Class");
    }
}

class CarW extends VehicleW {
    @Override
    void print() {
        System.out.println("Derived Class");
    }
}

// first prints derived class and then prints base class
// because here print() function is overrided method hence first car objects
// print methods runs and then vehicle class runs

// Q.6 What will be output of this code?
class VehicleR {
    void print() {
        System.out.println("Base Class");
    }
}

class CarR extends VehicleR {
    void print1() {
        System.out.println("Derived Class");
    }
}

// Program does not compile, no output
// because obj3 is a vheicle refernce and print1() exists only in CarR
// Compiler checks for refernce type, not object type

// Q.7 What will be the output of this code?
// a.Error ✗
// b. 0 2 ✓
// c. 1 2 ✗
// d. 2 2 ✗
class Book {
    int price;
    static int count;

    public Book(int price) {
        this.price = price;
        count++;
    }
}

// because here at first line Book.count is initally 0 then print 0
// in second line we are calling the Book constructor,setting the price to 150
// in this line price will be = 150 and count will be 1
// in third line we are calling the Book constructor and setting the price 250
// in this line price will be = 250 and count will be 2
// and in last printing line the count will be increased to 2 hence 0 2

// Q.8 Which line has error?
class Test {
    static int marks;

    void setMarks(int marks) {
        this.marks = marks; // Line 1
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.setMarks(94); // line 2
        System.out.println(Test.marks); // Line 3
    }

    // no error
}

// Q.9 What will be the output of the following code?
class TestA {
    static int a = 10;
    static int b;

    static void changeB() {
        b = a * 3;
    }

    public static void main(String[] args) {
        TestA t1 = new TestA();
        t1.changeB();
        System.out.println(TestA.a + TestA.b);
    }
}

// Q.9 Print the sum,difference and product of two complex numbers by creating a
// class named 'Complex' with separate methods for each operation whose real and
// imaginary parts are entered by the user.

class Complex {

    int real, imag;

    Complex(int r, int i) {
        this.real = r;
        this.imag = i;
    }

    void sum(Complex c) {
        System.out.println("Sum = " + (real + c.real) + " + " + (imag + c.imag) + "i");
    }

    void difference(Complex c) {
        System.out.println("Difference = " + (real - c.real) + " + " + (imag - c.imag) + "i");
    }

    void product(Complex c) {
        int r = real * c.real - imag * c.imag;
        int i = real * c.real + imag * c.imag;
        System.out.println("Product = " + r + " + " + i + "i");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real and imaginary part of first complex number: ");
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();

        System.out.print("Enter real and imaginary part of second complex number: ");
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        c1.sum(c2);
        c1.difference(c2);
        c1.product(c2);
    }
}

// Q.10 What will be the output for this program?

class Automobile {
    private String drive() {
        return "Driving vheicle";
    }
}

class Zar extends Automobile {
    protected String drive() {
        return "Driving Zar";
    }
}

class Electric extends Zar {
    @Override
    public final String drive() {
        return "Driving Electric car";
    }
}
