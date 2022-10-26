package animals;

public class Mammal extends Animal{
    private String habbital;
    private double speed;

    public Mammal(String name, int years, String habbital, double speed) {
        super(name, years);
        this.habbital = habbital;
        this.speed = speed;
    }
    public void walk(){
        System.out.println("Oно гуляет.");
    }
}
