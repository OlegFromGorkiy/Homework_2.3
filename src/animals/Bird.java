package animals;

public class Bird extends Animal{
    private String habitat;

    public Bird(String name, int years, String habitat) {
        super(name, years);
        this.habitat = check(habitat);
    }
    public void hunt(){
        System.out.println("Оно охотится.");
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
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
