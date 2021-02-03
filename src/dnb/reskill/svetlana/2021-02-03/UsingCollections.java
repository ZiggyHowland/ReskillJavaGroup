package student.collectionsgenerics;


import java.util.*;

public class UsingCollections {

	public static void main(String[] args) {
		
		// Work with a list of Strings.
		manageFootballTeams();
		
		// Work with a LinkedList of Doubles.
		 manageSalaries();
		
		// Work with a TreeMap of Employees.
		 manageEmployees();
	}

	
	// Work with a list of Strings.
	public static void manageFootballTeams() {

		// TODO: Declare a list to hold football teams (i.e. Strings).
		//       You can create either an ArrayList or a LinkedList.
		ArrayList<String> footballTeams = new ArrayList<>();

		
		// Miscellaneous helper variables.
		String team;
		int index;
		
		// Display menu options in a loop.
		int option = -1;
		do {
			
			try {
				System.out.println();
				System.out.println("---------------------------------------------------------");
				System.out.println("Options for managing a list of football teams (Strings)"  );
				System.out.println("---------------------------------------------------------");
				System.out.println("1. Append team");
				System.out.println("2. Add team at index");
				System.out.println("3. Set team at index");
				System.out.println("4. Remove team at index");
				System.out.println("5. Remove specified team");
				System.out.println("6. List all teams");
				System.out.println("7. Quit");
				
				option = Helper.getInt("\nEnter option => ");
				
				switch (option) {
				
					case 1:
						team = Helper.getString("Enter team: ");
						// TODO: Append team to list, and display success/failure message.
						//       Display a success/failure message.

						if (!validTeam(team)) {
							System.out.println("Nothing to add. ");
						} else {
							footballTeams.add(team);
							System.out.printf("%s was added to the list\n",team);
						}

						break;
						
					case 2:
						team  = Helper.getString("Enter team: ");
						index = Helper.getInt("Enter index: ");
						// TODO: If index is within range, add team at specified index in list.
						//       Note, you ARE allowed to add an item at one-beyond-the-end of the list (similar effect to appending). 
						//       Display a success/failure message.

						if ((validTeam(team)) && isValidIndex(index, footballTeams)) {
							footballTeams.add(index,team);
							System.out.printf("%s was added to the list with index %d\n", team, index);
						} else {
							System.out.println("No team to add or wrong index");
						}
						break;
						
					case 3:
						team  = Helper.getString("Enter team: ");
						index = Helper.getInt("Enter index: ");
						// TODO: If index is within range, set team at specified index in list.
						//       Display a success/failure message.

						if (validTeam(team) && isValidIndex(index, footballTeams)){
							String t = footballTeams.get(index);
							footballTeams.set(index, team);
							System.out.printf("%s was changed to %s \n",t,team);
						} else{
							System.out.println("Opertaion failed");
						}
						break;
					
					case 4:
						index = Helper.getInt("Enter index: ");
						// TODO: If index is within range, remove team at specified index in list.
						//       Display a success/failure message.
						if (isValidIndex(index, footballTeams)){
							String removed = footballTeams.remove(index);
							System.out.printf("%s was removed from the list", removed);

					} else {
							System.out.println("Wrong index");
						}
						break;
						
					case 5:
						team = Helper.getString("Enter team: ");
						// TODO: Remove team from list.
						//       Display a success/failure message.
						if (footballTeams.contains(team)){
							System.out.printf("%s is removed from the list \n", team);
							footballTeams.remove(team);

						} else {
							System.out.println("There is no such team in the list");
						}
						break;
						
					case 6:
						// TODO: Display all items in list.
						if(!footballTeams.isEmpty()){
							for(String t: footballTeams){
								System.out.println(t);
							}
						}else{
							System.out.println("The list is empty");
						}


						break;

					case 7:
						// This is a valid option, but there's nothing to do here.
						break;
						
					default:
						System.out.println("Invalid option selected.");
				}

			} catch (Exception ex) {
				System.out.printf("Exception occurred: %s.\n", ex.getMessage());
			}
					
		} while (option != 7);
	}


	// Work with a LinkedList of Doubles.
	public static void manageSalaries() {

		// TODO: Declare a LinkedList to hold salaries (i.e. Doubles).
		LinkedList<Double> salaries = new LinkedList<>();

		
		// Miscellaneous helper variables.
		double salary;
		
		// Display menu options in a loop.
		int option = -1;
		do {
			
			try {
				System.out.println();
				System.out.println("---------------------------------------------------------");
				System.out.println("Options for managing a LinkedList of salaries (Doubles)  ");
				System.out.println("---------------------------------------------------------");
				System.out.println("1. Push salary");
				System.out.println("2. Pop salary");
				System.out.println("3. Add first ");
				System.out.println("4. Add last");
				System.out.println("5. Peek first and last");
				System.out.println("6. List all salaries");
				System.out.println("7. Quit");
				
				option = Helper.getInt("\nEnter option => ");
				
				switch (option) {
				
					case 1:
						salary = Helper.getDouble("Enter salary: ");
						// TODO: Push salary into linked list.
						//       Display a success/failure message.
						if (salary < 0) {
							System.out.println("Salary cannot be lower that 0");
							break;
						} else {
							salaries.push(salary);
							System.out.println(salary + " was pushed to the list.");
						}

						break;
						
					case 2:
						// TODO: Pop salary off linked list.
						//       Display a success/failure message.

						if (!salaries.isEmpty()){
						Double s = salaries.pop();
							System.out.println("The popped salary: " +s);

						} else{
								System.out.println("The list is empty");
							}

						break;
						
					case 3:
						salary = Helper.getDouble("Enter salary: ");
						// TODO: Add salary at the start of the linked list.
						//       Display a success/failure message.
						if (salary > 0){
							salaries.addFirst(salary);
							System.out.println(salary + " was added at the beginning of the list");
						} else{
							System.out.println("Salary cannot be negative");
						}

						break;
					
					case 4:
						salary = Helper.getDouble("Enter salary: ");
						// TODO: Add salary at the end of the linked list.
						//       Display a success/failure message.
						if (salary < 0){
							System.out.println("Salary cannot be lower 0");
							break;
						} else {
							if (salaries.offer(salary)){
								System.out.println( salary + " was added to at the end of this list");
							}else{
								System.out.println("Could not add this salary");
							}
						}
						break;
						
					case 5:
						// TODO: If linked list isn't empty, peek at the first and last entries.
						//       If linked list IS empty, display a suitable message.
						if (salaries.isEmpty()){
							System.out.println("The list is empty");

						} else{
							Double first = salaries.peekFirst();
							Double last = salaries.peekLast();
							System.out.println("The first entry is " + first +" and the last one is " + last);
						}
						break;
						
					case 6:
						// TODO: Display all items in linked list.
						if (!salaries.isEmpty()){
							System.out.println("the salary list: ");
							for(Double s: salaries){
								System.out.println(s);
							}
						}else {
							System.out.println("The list is empty");
						}
						break;

					case 7:
						// This is a valid option, but there's nothing to do here.
						break;
						
					default:
						System.out.println("Invalid option selected.");
				}

			} catch (Exception ex) {
				System.out.printf("Exception occurred: %s.\n", ex.getMessage());
			}
					
		} while (option != 7);
	}


	// Work with a TreeMap of Employees.
	public static void manageEmployees() {

		// TODO: Declare a TreeMap to hold Employees (keyed by employee id).
		TreeMap<String,Employee> employees = new TreeMap<>();

		
		// Miscellaneous helper variables.
		Employee emp;
		String id;
		
		// Display menu options in a loop.
		int option = -1;
		do {
			
			try {
				System.out.println();
				System.out.println("---------------------------------------------------------");
				System.out.println("Options for managing a TreeMap of Employees (keyed by ID)");
				System.out.println("---------------------------------------------------------");
				System.out.println("1. Put employee");
				System.out.println("2. Remove employee for id");
				System.out.println("3. Is id present?");
				System.out.println("4. Is employee present?");
				System.out.println("5. Display first and last entries");
				System.out.println("6. Display all employees");
				System.out.println("7. Quit");
				
				option = Helper.getInt("\nEnter option => ");
				
				switch (option) {
				
					case 1:
						emp = Employee.createEmployee();
						// TODO: Put employee into map.
						//       Display a success/failure message.

						if(emp == null){
							System.out.println("No employee to add");
						} else {
							employees.put(emp.getId(), emp);
							System.out.printf("%s was added \n", emp);
						}
						break;
						
					case 2:
						id  = Helper.getString("Enter id: ");
						// TODO: Remove employee with specified id.
						//       Display a success/failure message.

						if(employees.isEmpty()){
							System.out.println("The dictionary is empty");
							break;
						}
						if (!employees.containsKey(id)){
						System.out.println("Such element is not found in the dictionary");
						} else{
							Employee e = employees.remove(id);
							System.out.printf("%s was removed from the dictionary", e);
						}

						break;
						
					case 3:
						id = Helper.getString("Enter id: ");
						// TODO: Display message indicating whether the map contains the specified id.
						if(employees.containsKey(id)){
							System.out.println("This id is in the map");
						} else{
							System.out.println("Such key is not found");
						}
						break;

					case 4:
						emp = Employee.createEmployee();
						// TODO: Display message indicating whether the map contains an employee with the specified values.
						if (employees.containsValue(emp)){
							System.out.println("This employee is  registered");
						} else{
							System.out.println("Such employee is not registered");
						}
						break;

					case 5:
						// TODO: If map isn't empty, display the key/value for the first entry and for the last entry.
						//       If map IS empty, display a suitable message.
						if(employees.isEmpty()){
							System.out.println("The map is empty");
						} else{
							Map.Entry<String, Employee> first = employees.firstEntry();
							Map.Entry<String, Employee> last = employees.lastEntry();
							System.out.println("The first entry: " + first);
							System.out.println("The last entry: " + last);
						}
						break;

					case 6:
						// TODO: Display all employee objects (i.e. values) in map.
						if (employees.isEmpty()){
							System.out.println("The map is empty");
						} else{
							Collection<Employee> e = employees.values();
							for(Employee empl: e){
								System.out.println(empl);
							}
						}
						break;

					case 7:
						// This is a valid option, but there's nothing to do here.
						break;
						
					default:
						System.out.println("Invalid option selected.");
				}

			} catch (Exception ex) {
				System.out.printf("Exception occurred: %s.\n", ex.getMessage());
			}
					
		} while (option != 7);
	}

	public static boolean validTeam(String team){
		return !team.isEmpty() && !team.isEmpty();
	}
	public static boolean isValidIndex(int index, ArrayList list){
		return index >= 0 && index < list.size();

	}
}
