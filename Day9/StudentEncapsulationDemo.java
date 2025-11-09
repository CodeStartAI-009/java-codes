// StudentEncapsulationDemo.java

class Student {
    private String name;
    private int roll;

    // Constructor
    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
    }
}

public class StudentEncapsulationDemo {
    public static void main(String[] args) {
        Student s1 = new Student("David", 104);
        s1.display();

        // Use setter to modify private data
        s1.setName("Daniel");
        s1.setRoll(105);

        // Use getter to retrieve data
        System.out.println("Updated Name: " + s1.getName());
        System.out.println("Updated Roll: " + s1.getRoll());
    }
}
