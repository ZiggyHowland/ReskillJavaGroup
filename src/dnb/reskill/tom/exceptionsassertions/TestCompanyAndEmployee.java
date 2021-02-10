package dnb.reskill.tom.exceptionsassertions;

public class TestCompanyAndEmployee {

	public static void main(String[] args) {
		
		// Create a company.
		Company aCompany = new Company("Acme Inc.");

		// Add some employees.
		try {


			aCompany.hireEmployee(new Employee("1", "Amy", 1000));
			aCompany.hireEmployee(new Employee("1", "Ben", 2000));
			aCompany.hireEmployee(new Employee("3", "Cat", 3000));
		}
		catch (CompanyException c){
			System.out.println(c.getMessage());
		}
		// TODO: Write tests (using assert statements) to exercise various aspects of Company and Employee behaviour. For example:
		// Ensure we can get existing employees.
		// Ensure we can't get non-existent employees.
		// Ensure employees can retire.
		// Ensure employees can be fired.
		// Ensure working employees can have a pay rise.
		// Ensure retired employees can not have a pay rise.
	}
}
