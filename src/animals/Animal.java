package animals;

public class Animal {
    private String name;
    private int years;

    public Animal(String name, int years) {
        this.name = name;
        this.years = years;
    }
    public void eat(){
        System.out.println("It eating");
    }
    public void sleep(){
        System.out.println("It sleeping");
    }
    public void move(){
        System.out.println("It sleeping");
    }
}
