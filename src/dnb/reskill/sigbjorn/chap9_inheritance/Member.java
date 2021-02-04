package src.dnb.reskill.sigbjorn.chap9_inheritance;

public class Member {
	
	// Instance variables.
	private String name;
	private int age;
	private int numberItemsBorrowed = 0;
	
	
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
	public void borrowedItem() {
		numberItemsBorrowed++;
	}

	public void returnedItem() {
		numberItemsBorrowed--;
	}
}
