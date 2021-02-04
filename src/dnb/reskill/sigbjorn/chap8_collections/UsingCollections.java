package dnb.reskill.sigbjorn.chap8_collections;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeMap;

public class UsingCollections {

	public static void main(String[] args) {
		
		// Work with a list of Strings.
		//manageFootballTeams(); // OK
		
		// Work with a LinkedList of Doubles.
		//manageSalaries();
		
		// Work with a TreeMap of Employees.
		manageEmployees();
	}

	
	// Work with a list of Strings.
	public static void manageFootballTeams() {

		// TODO: Declare a list to hold football teams (i.e. Strings).
		//       You can create either an ArrayList or a LinkedList.
		ArrayList<String> teams = new ArrayList<>();
		
		// TODO: (SH) if giving a char as input on index request, code run into an infinite loop
		// ANDY: Best approach is to just read a string from the user, then try to Integer.ParseInt() and catch any FormatExceptions inside your code.
		
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
						if (teams.add(team)) {
							outputListStatus(teams, String.format("Team '%s' added successfully.", team));
						}
						else {
							outputListStatus(teams, String.format("Failed adding team '%s' to your list", team));
						}
						break;

					case 2:
						team  = Helper.getString("Enter team: ");
						index = Helper.getInt("Enter index: ");
						// TODO: If index is within range, add team at specified index in list.
						//       Note, you ARE allowed to add an item at one-beyond-the-end of the list (similar effect to appending). 
						//       Display a success/failure message.
						try {
							teams.add(index, team);
							outputListStatus(teams, String.format("Team '%s' is added to index %d of the list.\n", team, index));
						}
						catch (IndexOutOfBoundsException e) {
							outputListStatus(teams, "Sorry, your suggested index is out of range");
						}
						catch (Exception e) {
							System.err.printf("Something unexpected happened on add()." + e.getMessage());
						}
						break;
						
					case 3:
						team  = Helper.getString("Enter team: ");
						index = Helper.getInt("Enter index: ");
						// TODO: If index is within range, set team at specified index in list.
						//       Display a success/failure message.
						try {
							teams.set(index, team);
							outputListStatus(teams, "set() success at index " + index);
						}
						catch (IndexOutOfBoundsException e) {
							outputListStatus(teams, "Sorry, your suggested index is out of range.");
						}
						catch (Exception e) {
							System.err.printf("Something unexpected happened on set()." + e.getMessage());
						}
						break;
					
					case 4:
						index = Helper.getInt("Enter index: ");
						// TODO: If index is within range, remove team at specified index in list.
						//       Display a success/failure message.
						try {
							teams.remove(index);
							outputListStatus(teams, "Successfully removed item at index " + index);
						}
						catch (IndexOutOfBoundsException e) {
							outputListStatus(teams, "Cannot remove item. Index out of bounds.");
						}
						catch (Exception e) {
							System.err.println(e.getMessage());
						}
						break;
						
					case 5:
						team = Helper.getString("Enter team: ");
						// TODO: Remove team from list.
						//       Display a success/failure message.
						index = teams.indexOf(team);
						if (index >= 0) {
							try {
								// TODO: (SH) 02.02.2021 Make work with any combination of upper and lowercase
								// ANDY: You would have to convert your string to lowercase (or uppercase) and compare each string in the arralist, also in lowercase (or uppercase)
								//       Or store 2 copies of every string - the real value plus the lowercase (or uppercase) value. That's what I do in my website.
								teams.remove(index);
								outputListStatus(teams, String.format("Successfully removed '%s' from the list.", team));
							}
							catch (Exception e) {
								System.err.println(e.getMessage());
							}
						}
						break;
						
					case 6:
						// TODO: Display all items in list.
						outputListStatus(teams, "Here you go; this is your list:");
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

	private static void outputListStatus(ArrayList<String> teams, String message) {
		System.out.println(message);
		outputListStatus(teams);
	}

	private static void outputListStatus(ArrayList<String> teams) {
		System.out.printf("Your list now contains %d elements\n" +
				"and has an index from 0 to %d. Your list:\n", teams.size(), teams.size()-1);
		for ( String t : teams ) {
			System.out.printf("%d: %s\n", teams.indexOf(t), t); //, t.toUpperCase());
		}
	}

	// Work with a LinkedList of Doubles.
	public static void manageSalaries() {

		// TODO: Declare a LinkedList to hold salaries (i.e. Doubles).
		LinkedList<Double> salaries = new LinkedList<>(); // Must be Double (not double) since collections do not accept primitive types
		// Initialize with a few salaries
		salaries.add(350000.0);
		salaries.add(420000.0);
		salaries.add(510000.0);

		
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
						salaries.push(salary);
						printLinkedListStatus(salaries, "Push successful"); // Exceptions will be caught by the catch
						break;
						
					case 2:
						// TODO: Pop salary off linked list.
						//       Display a success/failure message.
						Double popped = salaries.pop();
						printLinkedListStatus(salaries, String.format("Top element, salary %.1f removed from stack.", popped) );
						break;
						
					case 3:
						salary = Helper.getDouble("Enter salary: ");
						// TODO: Add salary at the start of the linked list.
						//       Display a success/failure message.
						salaries.addFirst(salary);
						printLinkedListStatus(salaries, String.format("Salary %f added first in the list.", salary));
						break;
					
					case 4:
						salary = Helper.getDouble("Enter salary: ");
						// TODO: Add salary at the end of the linked list.
						//       Display a success/failure message.
						salaries.addLast(salary);
						printLinkedListStatus(salaries, String.format("Salary %f added to the end of the list.", salary));
						break;
						
					case 5:
						// TODO: If linked list isn't empty, peek at the first and last entries.
						//       If linked list IS empty, display a suitable message.
						if (!salaries.isEmpty()) {
							printLinkedListStatus(salaries, String.format("%.1f is first entry of your list. %.1f is the last entry.", salaries.peek(), salaries.peekLast()));
						}
						else {
							System.out.println("Your list is empty. Operation not accepted.");
						}
						break;
						
					case 6:
						// TODO: Display all items in linked list.
						printLinkedListStatus(salaries, "Your list right now. Enjoy!");
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

	private static void printLinkedListStatus(LinkedList<Double> list, String header ) {
		System.out.println(header);
		System.out.println(list);
	}


	// Work with a TreeMap of Employees.
	public static void manageEmployees() {

		// TODO: Declare a TreeMap to hold Employees (keyed by employee id).
		TreeMap<String, Employee> employeeTreeMap = new TreeMap<>();


		
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
						employeeTreeMap.put(emp.getId(), emp);
						printTreeMapStatus(employeeTreeMap, "Success adding a new employee to map"); // Exceptions will be caught
						break;
						
					case 2:
						id  = Helper.getString("Enter id: ");
						// TODO: Remove employee with specified id.
						//       Display a success/failure message.
						if (employeeTreeMap.containsKey(id)) {
							emp = employeeTreeMap.remove(id);
							printTreeMapStatus(employeeTreeMap, String.format("Success removing %s from map.", emp.toString()));
						}
						else {
							printTreeMapStatus(employeeTreeMap, String.format("ID %s does not exist in map. Cannot be removed.", id));
						}
						break;
						
					case 3:
						id = Helper.getString("Enter id: ");
						// TODO: Display message indicating whether the map contains the specified id.
						if (employeeTreeMap.containsKey(id)) {
							printTreeMapStatus(employeeTreeMap, String.format("ID %s exist in map.", id));
						}
						else {
							printTreeMapStatus(employeeTreeMap, String.format("ID %s does not exist in map.", id));
						}
						break;

					case 4:
						emp = Employee.createEmployee();
						boolean add = false;
						// TODO: Display message indicating whether the map contains an employee with the specified values.
						if (employeeTreeMap.containsKey(emp.getId())) {
							// ANDY: You should encapsulate this test somehow in the Employee class. Too much for the client to do itself.
							if (emp.equals(employeeTreeMap.get(emp.getId()))) {
								printTreeMapStatus(employeeTreeMap, "Equal employee already exist.");
								break;
							}
						}
						printTreeMapStatus(employeeTreeMap, "No equal employee found in map.");
						break;

					case 5:
						// TODO: If map isn't empty, display the key/value for the first entry and for the last entry.
						//       If map IS empty, display a suitable message.
						if (!employeeTreeMap.isEmpty()) {
							printTreeMapStatus(employeeTreeMap, String.format("First entry: %s \nLast entry: %s", employeeTreeMap.firstEntry(), employeeTreeMap.lastEntry()));
						}
						else {
							printTreeMapStatus(employeeTreeMap, "Map is empty. Operation not supported.");
						}
						break;

					case 6:
						// TODO: Display all employee objects (i.e. values) in map.
						printTreeMapStatus(employeeTreeMap, "Enjoy the presence of your map.");
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

	private static void printTreeMapStatus(TreeMap<String, Employee> map, String header ) {
		System.out.println(header);
		System.out.println(map);
	}


}
