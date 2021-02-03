package dnb.reskill.tom;

import java.util.Scanner;

public class Employee {

    // Instance variables.
    private String id;
    private String name;
    private double salary;

    // Static Scanner, for simple console I/O.
    private static Scanner scanner = new Scanner(System.in);

    // Simple factory method, to create an Employee object directly using console I/O.
    public static Employee createEmployee() {

        Employee emp = new Employee();

        System.out.print("Employee id? " );
        emp.id = scanner.next();

        System.out.print("Employee name: " );
        emp.name = scanner.next();

        System.out.print("Employee salary: " );
        emp.salary = scanner.nextDouble();

        return emp;
    }

    // Get the employee's ID.
    public String getId() {
        return id;
    }

    // Return a textual representation of employee's data.
    @Override
    public String toString() {
        return String.format("[%s] %s, �%.2f", id, name, salary);
    }

    // Is this employee "equal to" another object?
    @Override
    public boolean equals(Object other) {

        if (!(other instanceof Employee)) {
            return false;
        } else {
            Employee otherEmp = (Employee)other;
            return this.toString().equals(otherEmp.toString());
        }
    }
}
