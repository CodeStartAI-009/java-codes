// StudentConstructorDemo.java

class Student {
    String name;
    int roll;

    // Constructor
    Student(String n, int r) {
        name = n;
        roll = r;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
    }
}

public class StudentConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Bob", 102);
        Student s2 = new Student("Charlie", 103);

        s1.display();
        s2.display();
    }
}
