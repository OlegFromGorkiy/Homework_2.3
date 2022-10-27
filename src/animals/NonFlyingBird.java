package animals;

public class NonFlyingBird extends Bird{
    private String moveType;

    public NonFlyingBird(String name, int years, String habitat, String moveType) {
        super(name, years, habitat);
        this.moveType = check(moveType);
    }
    public void walk(){
        System.out.println("Oно ходит.");
    }

    public String getMoveType() {
        return moveType;
    }

    public void setMoveType(String moveType) {
        this.moveType = moveType;
    }
    @Override
    public String toString() {
        return super.toString() + " тип передвижения - " + getMoveType() + ".";
    }
}
