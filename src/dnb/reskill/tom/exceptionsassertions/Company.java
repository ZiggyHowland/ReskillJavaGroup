package dnb.reskill.tom.exceptionsassertions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeMap;

public class Company {

	// Instance variables.
	private String companyName;
	private TreeMap<String, Employee> employees = new TreeMap<>();
	
	
	// Constructor.
	public Company(String companyName) {
		this.companyName = companyName;
	}
	
	
	// Hire employee (i.e. add to company).
	public void hireEmployee(Employee emp) {
		
		String id = emp.getId();
		
		// TODO: Enhance this code to throw a CompanyException 
		//       if the company already has an employee with the specified id. 
		employees.put(id, emp);
	}


	// Fire employee (i.e. remove employee from company).
	public void fireEmployee(String id) {
		
		// TODO: Enhance this code to throw a CompanyException 
		//       if the company doesn't contain an employee with the specified id. 
		employees.remove(id);
	}


	// Retire employee (but keep their info).
	public void retireEmployee(String id) {
		
		Employee emp = employees.get(id);
		
		// TODO: Enhance this code to throw a CompanyException 
		//       if the company doesn't contain an employee with the specified id. 
		emp.retire();
	}


	// Give employee a pay rise.
	public void giveEmployeePayRise(String id, double amount) {
		
		Employee emp = employees.get(id);
		
		// TODO: Enhance this code to throw a CompanyException 
		//       if the company doesn't contain an employee with the specified id. 
		// TODO: Also enhance this code to throw a CompanyException 
		//       if the employee's payRise() method throws a low-level exception. 

		try{emp.payRise(amount);}
		catch (RuntimeException r){
			System.out.println(r);
		}
	}


	// Get an employee. Returns null if employee not found.
	public Employee getEmployee(String id) {
		return employees.get(id);
	}

	
	// Get all employees (including retired employees).
	public Collection<Employee> getAllEmployees() {
		return employees.values();
	}

	
	// Get working employees.
	public Collection<Employee> getWorkingEmployees() {
		
		Collection<Employee> workingEmployees = new ArrayList<>();
		
		for (Employee emp: employees.values()) {
			if (!emp.isRetired()) {
				workingEmployees.add(emp);
			}
		}
		return workingEmployees;
	}

	
	// Get retired employees.
	public Collection<Employee> getRetiredEmployees() {
		
		Collection<Employee> retiredEmployees = new ArrayList<>();
		
		for (Employee emp: employees.values()) {
			if (emp.isRetired()) {
				retiredEmployees.add(emp);
			}
		}
		return retiredEmployees;
	}

	
	// Return a textual representation of company's data.
	@Override
	public String toString() {
		return String.format("Company [%s] has/had %d registered employee.", companyName, employees.size());
	}
}
