package animals;

import java.util.HashMap;

public class Animal {
    private String name;
    private int years;

    private static long count = 0;
    private final long ID;

    public Animal(String name, int years) {
        ID = count;
        count++;
        this.name = check(name);
        this.years = check(years);
    }

    public void eat() {
        System.out.println("It eating");
    }

    public void sleep() {
        System.out.println("It sleeping");
    }

    public void move() {
        System.out.println("It moving");
    }

    public String check(String str) {
        if (str == null) str = "";
        if (str.matches("^\\s+$") || str.length() == 0) return "unknown";
        else return str;
    }

    public int check(int i) {
        return Math.max(0, i);
    }

    public long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = check(name);
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = check(years);
    }
    @Override
    public boolean equals(Object obj) {
        Animal a = (Animal) obj;
        return this.ID == a.ID;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder(getName()).append(" класс - ").append(this.getClass().getSimpleName());
        sb.append("; прожито лет -").append(getYears()).append(";");
        return sb.toString();
    }
}
