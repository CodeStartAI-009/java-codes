// EmployeeInheritanceDemo.java

// Parent class
class Person {
    String name;
    int age;

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class inherits from Person
class Employee extends Person {
    int empId;
    double salary;

    void displayEmployee() {
        displayPerson(); // call parent method
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeInheritanceDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Emma";
        emp.age = 30;
        emp.empId = 1001;
        emp.salary = 55000.0;

        emp.displayEmployee();
    }
}
