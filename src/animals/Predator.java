package animals;

public class Predator extends Mammal{
    private String food;

    public Predator(String name, int years, String habbital, double speed, String food) {
        super(name, years, habbital, speed);
        this.food = food;
    }
    public void hunt(){
        System.out.println("Оно охотится");
    }
}
