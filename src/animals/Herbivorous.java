package animals;

public class Herbivorous extends Mammal{
    private String food;

    public Herbivorous(String name, int years, String habbital, double speed, String food) {
        super(name, years, habbital, speed);
        this.food = food;
    }
    public void graze(){
        System.out.println("Оно пасется.");
    }
}
