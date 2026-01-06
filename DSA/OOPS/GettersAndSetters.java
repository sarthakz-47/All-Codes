package DSA.OOPS;

public class GettersAndSetters {
    public static void main(String[] args) {
        Car s = new Car();
        System.out.println(s.getAge());
        s.setAge(15);
        s.setNumber(1213.2f);
        System.out.println(s.getNumber());
    }
}

class Car {
    private int age = 20;
    private float number = 1012.2f;

    // Getter Method:usually public method which is used to get(read) the value of a
    // private variable:

    public int getAge() {
        return age;
    }

    // Setter Method:usually public method which is used to set(update) the value of
    // a private variable:

    public void setAge(int Age) {
        age = Age;
    }

    // this keyword: it refers to the current object
    // useful when class variables and method parameters have same name
    public void setNumber(float number) {
        this.number = number;
    }

    public float getNumber() {
        return number;
    }
}
