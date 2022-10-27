package animals;

public class Predator extends Mammal {
    private String food;


    public Predator(String name, int years, String habitat, double speed, String food) {
        super(name, years, habitat, speed);
        this.food = check(food);
    }

    public void hunt() {
        System.out.println("Оно охотится.");
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return super.toString() + " максимальная скорость: " + getSpeed() + "км/ч; " + "ест " + getFood() + ".";
    }
}
