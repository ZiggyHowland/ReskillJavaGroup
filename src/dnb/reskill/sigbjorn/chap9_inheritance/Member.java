package dnb.reskill.sigbjorn.chap9_inheritance;

public class Member {

	// Instance variables.
	private String name;
	private int age;
	private int numberItemsBorrowed = 0;

	public static final int CHILD_UPPER_AGE_LIMIT = 16;
	public static final int YOUTH_LOWER_AGE_LIMIT = 12;
	public static final int ADULT_LOWER_AGE_LIMIT = 18;


	
	// Constructor.
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	// Getters and setters, as needed.
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	// String representation.
	@Override
	public String toString() {
		return String.format("%s, aged %d, has %d items(s) on loan.", name, age, numberItemsBorrowed);
	}
	
	
	// Business methods.

	public boolean isChild() {
		return this.age <= CHILD_UPPER_AGE_LIMIT;
	}

	public boolean isYouth() {
		return this.age >= YOUTH_LOWER_AGE_LIMIT;
	}

	public boolean isAdult() {
		return this.age >= ADULT_LOWER_AGE_LIMIT;
	}

	public void borrowedItem() {
		numberItemsBorrowed++;
	}

	public void returnedItem() {
		numberItemsBorrowed--;
	}
}
