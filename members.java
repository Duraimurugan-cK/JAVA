class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;
    Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }
    void printSalary() {
        System.out.println("Salary: $" + salary);
    }
}
class Employee extends Member {
    String specialization;
    Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
    @Override
    void printSalary() {
        super.printSalary();
        System.out.println("Specialization: " + specialization);
    }
}
class Manager extends Member {
    String department;
    Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
    @Override
    void printSalary() {
        super.printSalary();
        System.out.println("Department: " + department);
    }
}
public class members {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 25, "1234567890", "1234 Elm St", 5000.0, "Software Developer");
        Manager manager = new Manager("Jane", 35, "9876543210", "5678 Oak St", 8000.0, "HR");
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        employee.printSalary();
        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        manager.printSalary();
    }
}
