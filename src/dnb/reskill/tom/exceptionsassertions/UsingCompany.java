package dnb.reskill.tom.exceptionsassertions;

import java.util.Collection;

public class UsingCompany {

	public static void main(String[] args) {
		
		// Create a company, no employees initially.
		Company theCompany = new Company("Acme Inc."); 
		
		// Miscellaneous helper variables.
		String id;
		double amount;
		Employee emp;
		Collection<Employee> emps;
		
		// Display menu options in a loop.
		int option = -1;
		do {

			// TODO: Enclose code in a try/catch block, to catch CompanyException exceptions.
			
			System.out.println();
			System.out.println("---------------------------------------------------------");
			System.out.println("1. Hire employee");
			System.out.println("2. Fire employee");
			System.out.println("3. Retire employee");
			System.out.println("4. Give employee a pay rise");
			System.out.println("5. Get an employee");
			System.out.println("6. Get all employees");
			System.out.println("7. Get working employees");
			System.out.println("8. Get retired employees");
			System.out.println("9. Quit");
			
			option = Helper.getInt("\nEnter option => ");
			
			switch (option) {
			
				case 1:
					emp = Employee.createEmployee();
					try {
						theCompany.hireEmployee(emp);
					}catch (CompanyException c){
						System.out.println(c.toString());
						break;
					}
					System.out.printf("Hired %s.\n", emp);
					break;
					
				case 2:
					id  = Helper.getString("Enter id: ");
					try {
						theCompany.fireEmployee(id);
					}catch (CompanyException c){
						System.out.println(c.getMessage());
						break;
					}
					System.out.printf("Fired employee with id %s.\n", id);
					break;
					
				case 3:
					id  = Helper.getString("Enter id: ");
					try {
						theCompany.retireEmployee(id);
					}catch (CompanyException c){
						System.out.println(c.getMessage());
					}
					System.out.printf("Retired employee with id %s.\n", id);
					break;

				case 4:
					id  = Helper.getString("Enter id: ");
					amount = Helper.getDouble("Enter amount: ");
					try {
						theCompany.giveEmployeePayRise(id, amount);
					}catch (Exception r){
						System.out.println(r.getMessage());
						break;
					}
					System.out.printf("Given %.2f pay rise to employee with id %s.\n", amount, id);
					break;

				case 5:
					id  = Helper.getString("Enter id: ");
					emp = theCompany.getEmployee(id);
					if (emp != null) {
						System.out.printf("Employee details: %s.\n", emp);
					} else {
						System.out.printf("No employee with id %s.\n", id);
					}
					break;

				case 6:
					emps = theCompany.getAllEmployees();
					System.out.println("All employees");
					Helper.displayCollection(emps);
					break;

				case 7:
					emps = theCompany.getWorkingEmployees();
					System.out.println("Working employees");
					Helper.displayCollection(emps);
					break;

				case 8:
					emps = theCompany.getRetiredEmployees();
					System.out.println("Retired employees");
					Helper.displayCollection(emps);
					break;

				case 9:
					// This is a valid option, but there's nothing to do here.
					break;
					
				default:
					System.out.println("Invalid option selected.");
			}
					
		} while (option != 9);
	}
}
