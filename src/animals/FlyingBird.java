package animals;

public class FlyingBird extends Bird{
    private String moveType;

    public FlyingBird(String name, int years, String habitat, String moveType) {
        super(name, years, habitat);
        this.moveType = check(moveType);
    }
    public void fly(){
        System.out.println("Оно летает.");
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
