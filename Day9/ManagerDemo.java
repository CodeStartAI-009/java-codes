// ManagerDemo.java

// Parent class
class Employee {
    // private fields
    private String name;
    private int id;
    private double salary;

    // constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // display method
    public void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

// Child class inherits Employee
class Manager extends Employee {
    private String department;

    // constructor (uses super to call parent constructor)
    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    // getter and setter for department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // display method for Manager
    public void displayManagerDetails() {
        // call parent class display method
        displayEmployee();
        System.out.println("Department: " + department);
    }
}

public class ManagerDemo {
    public static void main(String[] args) {
        // create Manager object
        Manager m1 = new Manager("Alice", 101, 75000.0, "HR");

        // display details
        m1.displayManagerDetails();

        System.out.println("\n--- Updating Details ---");
        // update using setters
        m1.setDepartment("Finance");
        m1.setSalary(80000.0);

        // show updated details
        m1.displayManagerDetails();
    }
}
