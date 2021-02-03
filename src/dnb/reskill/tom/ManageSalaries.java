package dnb.reskill.tom;

import com.sun.source.tree.Tree;
import jdk.jshell.SourceCodeAnalysis;
import jdk.jshell.spi.ExecutionControlProvider;

import java.util.LinkedList;
import java.util.TreeMap;

public class ManageSalaries {
    // Work with a LinkedList of Doubles.
    public static void manageSalaries() {

        // Done: Declare a LinkedList to hold salaries (i.e. Doubles).
        LinkedList<Double> salariesList = new LinkedList<Double>();


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
                        // Done: Push salary into linked list.
                        //       Display a success/failure message.
                        if (salariesList.add(salary))
                            Helper.listAddSuccess(true);
                        else
                            Helper.listAddSuccess(false);
                        break;

                    case 2:
                        // Done: Pop salary off linked list.
                        //       Display a success/failure message.
                        //different methods of removing
                        salary = Helper.getDouble("Enter Salary to remove");

                        if (salariesList.remove(salary))
                            Helper.listAddSuccess(true);
                        else
                            Helper.listAddSuccess(false);

                        break;

                    case 3:
                        salary = Helper.getDouble("Enter salary: ");
                        // Done: Add salary at the start of the linked list.
                        //       Display a success/failure message.
                        salariesList.add(1,salary);
                        break;

                    case 4:
                        salary = Helper.getDouble("Enter salary: ");
                        // Done: Add salary at the end of the linked list.
                        //       Display a success/failure message.
                        salariesList.addLast(salary);
                        break;

                    case 5:
                        // done: If linked list isn't empty, peek at the first and last entries.
                        //       If linked list IS empty, display a suitable message.
                        if(!salariesList.isEmpty()){
                            System.out.println("first salary: " + salariesList.getFirst());
                            System.out.println("last Salary: " + salariesList.getLast());
                        }
                        else
                            System.out.println("List of salaries is empty");
                        break;

                    case 6:
                        // Done: Display all items in linked list.
                        System.out.println("Salary list: " + salariesList.toString());
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

        /*Exercise 3:  Using a TreeMap
In this exercise, you'll use a TreeMap to manage a collection of Employee objects. To get started, take a look at the Employee class in Employee.java and note the following points:
•	Each employee has an ID (string), a name, and a salary.
•	The constructor initializes a new Employee object from the keyboard, for simplicity.
•	The getId() method returns the employee's ID.
•	The toString() method returns a textual representation of an Employee object.
•	The equals() method determines whether an Employee object "is equal to" another object. This will be useful later, when you need to ascertain whether an Employee object is already in the TreeMap.

Now switch back to UsingCollections.java and locate the manageEmployees() method. Add code where indicated by the TODO comments, to manipulate a TreeMap of employees. In the TreeMap, the keys should be the employee IDs, and the values should be the Employee objects themselves.

In main(), uncomment the call to manageEmployees(), and then run the application. Make sure all the options work as expected.
*/
        // Done: Declare a TreeMap to hold Employees (keyed by employee id).
        TreeMap<String,Employee> myTreeMap = new TreeMap<String,Employee>();



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

                        // Done: Put employee into map.
                        //       Display a success/failure message.
                        try {
                            myTreeMap.put(emp.getId(), emp);
                            System.out.println("Succesfull put"); //will only reach this if exception is not casted
                        }catch(Exception e){

                            System.out.println("Failure in put");//can output exception if wanted
                        }
                        break;

                    case 2:
                        id  = Helper.getString("Enter id: ");
                        // Done: Remove employee with specified id.
                        //       Display a success/failure message.
                        try {
                            myTreeMap.remove(id);
                            System.out.println("sucess : Object removed");
                        }
                        catch(Exception e){

                            System.out.println("Fail: Object not removed");
                        }
                        break;

                    case 3:
                        id = Helper.getString("Enter id: ");
                        // Done: Display message indicating whether the map contains the specified id.
                        if (myTreeMap.containsKey(id))
                            System.out.println("Map contains key");
                        else
                            System.out.println("Map does not contain key");
                        break;

                    case 4:
                        emp = Employee.createEmployee();
                        // Done: Display message indicating whether the map contains an employee with the specified values.

                        if (myTreeMap.containsValue(emp))
                            System.out.println("Map contains employee");
                        else
                            System.out.println("Map does not contain employee");
                        break;

                    case 5:
                        // Done: If map isn't empty, display the key/value for the first entry and for the last entry.
                        //       If map IS empty, display a suitable message.
                        if(!myTreeMap.isEmpty()) {
                            System.out.println("First entry: " + myTreeMap.firstEntry());
                            System.out.println("Last entry: " + myTreeMap.lastEntry());
                        }
                        else
                            System.out.println("Map is empty");
                        break;

                    case 6:
                        // Done: Display all employee objects (i.e. values) in map.
                        System.out.println("List of Employees: " + myTreeMap.toString());
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
