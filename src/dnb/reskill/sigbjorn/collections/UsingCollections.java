package dnb.reskill.sigbjorn.collections;


import java.util.ArrayList;

public class UsingCollections {

	public static void main(String[] args) {
		
		// Work with a list of Strings.
		manageFootballTeams();
		
		// Work with a LinkedList of Doubles.
		// manageSalaries();
		
		// Work with a TreeMap of Employees.
		// manageEmployees();
	}

	
	// Work with a list of Strings.
	public static void manageFootballTeams() {

		// TODO: Declare a list to hold football teams (i.e. Strings).
		//       You can create either an ArrayList or a LinkedList.
		ArrayList<String> teams = new ArrayList<>();

		
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
								// TODO: 02.02.2021 Make work with any combination of upper and lowercase
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
						break;
						
					case 2:
						// TODO: Pop salary off linked list.
						//       Display a success/failure message.
						break;
						
					case 3:
						salary = Helper.getDouble("Enter salary: ");
						// TODO: Add salary at the start of the linked list.
						//       Display a success/failure message.
						break;
					
					case 4:
						salary = Helper.getDouble("Enter salary: ");
						// TODO: Add salary at the end of the linked list.
						//       Display a success/failure message.
						break;
						
					case 5:
						// TODO: If linked list isn't empty, peek at the first and last entries.
						//       If linked list IS empty, display a suitable message.
						break;
						
					case 6:
						// TODO: Display all items in linked list.
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
						break;
						
					case 2:
						id  = Helper.getString("Enter id: ");
						// TODO: Remove employee with specified id.
						//       Display a success/failure message.
						break;
						
					case 3:
						id = Helper.getString("Enter id: ");
						// TODO: Display message indicating whether the map contains the specified id.
						break;

					case 4:
						emp = Employee.createEmployee();
						// TODO: Display message indicating whether the map contains an employee with the specified values.
						break;

					case 5:
						// TODO: If map isn't empty, display the key/value for the first entry and for the last entry.
						//       If map IS empty, display a suitable message.
						break;

					case 6:
						// TODO: Display all employee objects (i.e. values) in map.
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
}
