package dnb.reskill.sigbjorn.day14_course;

import java.util.ArrayList;

public class Employee {
    private long id;
    private String  name;
    private double salary;
    private ArrayList<String> skills = new ArrayList<>();

    public static final int HIGH_SKILL_THRESHOLD = 10;

    public Employee(long id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
