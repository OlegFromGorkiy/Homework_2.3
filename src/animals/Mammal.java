package animals;

public class Mammal extends Animal {
    private String habitat;
    private double speed;

    public Mammal(String name, int years, String habitat, double speed) {
        super(name, years);
        this.habitat = check(habitat);
        this.speed = Math.abs(speed);
    }

    public void walk() {
        System.out.println("Oно гуляет.");
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = check(habitat);
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = Math.abs(speed);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public String toString() {
        return super.toString() + " живет в " + getHabitat() + ";";
    }
}
