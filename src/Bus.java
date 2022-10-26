public class Bus extends Transport {

    private int numberOfPassengers;

    public Bus(String brand, String model, int yearOfManufacture, String country,
               String bodyColor, int maxSpeed, int numberOfPassengers) {
        super(brand, model, yearOfManufacture, country, bodyColor, maxSpeed);
        setNumberOfPassengers(numberOfPassengers);
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = Math.abs(numberOfPassengers);
    }

    @Override
    public void refill(Fuel fuel) {
        if (getFuel() != fuel) System.out.println("Неверный тип топлива!");
        else setEmpty(false);
    }

    @Override
    public void setFuel(Fuel fuel) {
        if (fuel == Fuel.Electrisity) super.setFuel(Fuel.Gasolin);
        else super.setFuel(fuel);
    }
}
