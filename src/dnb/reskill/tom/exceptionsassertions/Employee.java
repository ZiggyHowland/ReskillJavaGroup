package dnb.reskill.tom.exceptionsassertions;

import java.util.Scanner;

public class Employee {

	// Instance variables.
	private String id;
	private String name;
	private double salary;
	private boolean retired = false;
	
	// Constructor.
	public Employee(String id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// Factory method, to create an Employee object directly using console I/O.
	public static Employee createEmployee() {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Employee id? " );
		String id = scanner.next();
		
		System.out.print("Employee name: " );
		String name = scanner.next();
		
		System.out.print("Employee salary: " );
		double salary = scanner.nextDouble();
		
		return new Employee(id, name, salary);
	}
	
	// Get the employee's id.
	public String getId() {
		return id;
	}
	
	// Get the employee's salary.
	public double getSalary() {
		return salary;
	}
	
	// Get the employee's retirement status.
	public boolean isRetired() {
		return retired;
	}
	
	// Retire the employee.
	public void retire() {
		retired = true;
	}
	
	// Give the employee a pay rise.
	public double payRise(double amount) {
		
		// Done: Throw an IllegalArgumentException if the amount is negative.

		// Done: Throw an IllegalStateException if the employee is retired.
		if (amount<0)
			throw new RuntimeException("Error: amount is negative");
		if(isRetired())
			throw new RuntimeException(("Error: Employee is retired"));
		salary += amount;
		return salary;
	}
	
	// Return a textual representation of employee's data.
	@Override
	public String toString() {

		if (retired) {
			return String.format("[%s] %s is retired", id, name);
		} else {
			return String.format("[%s] %s earns �%.2f", id, name, salary);
		}			
	}
}
