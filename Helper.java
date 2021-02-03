package student.collectionsgenerics;

import java.util.Scanner;

// This class comprises static helper methods.
public class Helper {

	// Create a Scanner object, to get keyboard input.
	private static Scanner scanner = new Scanner(System.in);

	// Get a String from the user.
	public static String getString(String promptMsg) {
		System.out.printf("%s", promptMsg);
		return scanner.next();
	}
	
	// Get a double from the user.
	public static double getDouble(String promptMsg) {
		System.out.printf("%s", promptMsg);
		return scanner.nextDouble();
	}
	
	// Get an int from the user.
	public static int getInt(String promptMsg) {
		System.out.printf("%s", promptMsg);
		return scanner.nextInt();
	}
	
	// TODO: Define a generic method here, to display all the items in a Collection<T>.



}
