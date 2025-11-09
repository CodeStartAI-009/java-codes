// StudentDemo.java

class Student {
    String name;
    int roll;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        // Create object
        Student s1 = new Student();
        s1.name = "Alice";
        s1.roll = 101;

        s1.display();
    }
}
