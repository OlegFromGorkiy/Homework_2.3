import org.w3c.dom.ls.LSOutput;

public abstract class Transport {
    private String brand;
    private String model;
    private int yearOfManufacture;
    private String country;
    private String bodyColor;
    private int maxSpeed;
    private Fuel fuel;


    private boolean isEmpty;

    public Transport(String brand, String model, int yearOfManufacture,
                     String country, String bodyColor, int maxSpeed) {
        setBrand(brand);
        setModel(model);
        setYearOfManufacture(yearOfManufacture);
        setCountry(country);
        setBodyColor(bodyColor);
        setMaxSpeed(maxSpeed);
        fuel = Fuel.Gasolin;
        isEmpty = true;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setBrand(String brand) {
        if (brand == null) brand = "";
        try {
            if (brand.matches("^\\s+$") || brand.length() == 0) {
                throw new IllegalArgumentException();
            } else this.brand = brand;
        } catch (IllegalArgumentException e) {
            System.out.println("Brand name is incorrect!");
            this.brand = "unknown";
        }
    }

    public void setModel(String model) {
        if (model == null) model = "";
        try {
            if (model.matches("^\\s+$") || model.length() == 0) {
                throw new IllegalArgumentException();
            } else this.model = model;
        } catch (IllegalArgumentException e) {
            System.out.println("Model name is incorrect!");
            this.model = "unknown";
        }
    }

    private void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = Math.abs(yearOfManufacture);
    }

    private void setCountry(String country) {
        if (country == null) country = "";
        try {
            if (country.matches("^\\s+$") || country.length() == 0) {
                throw new IllegalArgumentException();
            } else this.country = country;
        } catch (IllegalArgumentException e) {
            System.out.println("Country is incorrect!");
            this.country = "unknown";
        }
    }

    public void setBodyColor(String bodyColor) {
        if (bodyColor == null) bodyColor = "";
        try {
            if (bodyColor.matches("^\\s+$") || bodyColor.length() == 0) {
                throw new IllegalArgumentException();
            } else this.bodyColor = bodyColor;
        } catch (IllegalArgumentException e) {
            System.out.println("Color is incorrect!");
            this.bodyColor = "unknown";
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = Math.abs(maxSpeed);
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public void hasFuel() {
        if (isEmpty) System.out.println("Нужно заправить!");
        else System.out.println("Топливо имеется.");
    }
    public void fuelType(){
        switch (fuel){
            case Electrisity:
                System.out.println("Нужно заряжать электричеством.");
                break;
            case Disel:System.out.println("Нужно заправлять дизелем.");
                break;
            case Gasolin:System.out.println("Нужно заправлять бензином.");
                break;
        }
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfManufacture=" + yearOfManufacture +
                ", country='" + country + '\'' +
                ", bodyColor='" + bodyColor + '\'' +
                '}';
    }

    public abstract void refill(Fuel fuel);
}

