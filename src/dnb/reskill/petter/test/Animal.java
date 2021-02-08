package src.dnb.reskill.petter.test;

public class Animal {
    private int id;
    private String name;
    private String color;
    private String animalType;
    private int age;

    public Animal(int id, String name, String color, String animalType, int age) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.animalType = animalType;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Id='" + id + '\'' + //This is added manually. IntelliJ didn't manage to automatically add id. Think it's because of static in line 4
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", animalType='" + animalType + '\'' +
                ", age=" + age +
                '}';
    }
}
