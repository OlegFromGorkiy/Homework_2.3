public class Train extends Transport {
    double ticketCost;
    int minutesInTrip;
    String firstStation;
    String lastStation;
    int numbersOfWagons;

    public Train(String brand, String model, int yearOfManufacture, String country,
                 String bodyColor, int maxSpeed, double ticketCost, String firstStation,
                 String lastStation, int numbersOfWagons) {
        super(brand, model, yearOfManufacture, country, bodyColor, maxSpeed);
        setTicketCost(ticketCost);
        setMinutesInTrip(1234);
        setFirstStation(firstStation);
        setLastStation(lastStation);
        setNumbersOfWagons(numbersOfWagons);
        setFuel(Fuel.Disel);
    }

    public Train(String brand, String model, int yearOfManufacture, String country,
                 String bodyColor, int maxSpeed, double ticketCost, int minutesInTrip,
                 String firstStation, String lastStation, int numbersOfWagons) {
        super(brand, model, yearOfManufacture, country, bodyColor, maxSpeed);
        setTicketCost(ticketCost);
        setMinutesInTrip(minutesInTrip);
        setFirstStation(firstStation);
        setLastStation(lastStation);
        setNumbersOfWagons(numbersOfWagons);
    }

    public double getTicketCost() {
        return ticketCost;
    }

    public int getMinutesInTrip() {
        return minutesInTrip;
    }

    public String getFirstStation() {
        return firstStation;
    }

    public String getLastStation() {
        return lastStation;
    }

    public int getNumbersOfWagons() {
        return numbersOfWagons;
    }

    public void setTicketCost(double ticketCost) {
        this.ticketCost = Math.abs(ticketCost);
    }

    public void setMinutesInTrip(int minutesInTrip) {
        this.minutesInTrip = Math.abs(minutesInTrip);
    }

    public void setMinutesInTrip(int minutes, int hours) {
        this.minutesInTrip = Math.abs(minutes) + 60 * Math.abs(hours);
    }

    public void setNumbersOfWagons(int numbersOfWagons) {
        this.numbersOfWagons = Math.max(1, numbersOfWagons);
    }

    public void setFirstStation(String firstStation) {
        if (firstStation == null) firstStation = "";
        try {
            if (firstStation.matches("^\\s+$") || firstStation.length() == 0) {
                throw new IllegalArgumentException();
            } else this.firstStation = firstStation;
        } catch (IllegalArgumentException e) {
            System.out.println("Brand name is incorrect!");
            this.firstStation = "unknown";
        }
    }

    public void setLastStation(String lastStation) {
        if (lastStation == null) lastStation = "";
        try {
            if (lastStation.matches("^\\s+$") || lastStation.length() == 0) {
                throw new IllegalArgumentException();
            } else this.lastStation = lastStation;
        } catch (IllegalArgumentException e) {
            System.out.println("Brand name is incorrect!");
            this.lastStation = "unknown";
        }
    }

    @Override
    public String toString() {
        String template = "Поезд %s, модель %s, %d год выпуска в %s, скорость передвижения – %d км/ч, отходит от %s и следует до %s. Цена поездки - %.0f %s, в поезде %d %s";
        String wagon;
        switch (getNumbersOfWagons()) {
            case 1:
                wagon = "вагон";
                break;
            case 2:
            case 3:
            case 4:
                wagon = "вагона";
                break;
            default:
                wagon = "вагонов";
        }
        String ruble;
        int tmp = (int) Math.floor(getTicketCost());
        if (tmp % 100 > 10 && tmp % 100 < 20) ruble = "рублей";
        else switch (tmp % 10) {
            case 1:
                ruble = "рубль";
                break;
            case 2:
            case 3:
            case 4:
                ruble = "рубля";
                break;
            default:
                ruble = "рублей";
        }
        return String.format(template, getBrand(), getModel(), getYearOfManufacture(), getCountry(),
                getMaxSpeed(), getFirstStation(), getLastStation(), getTicketCost(), ruble, getNumbersOfWagons(), wagon);
    }
    @Override
    public void refill(Fuel fuel) {
        if (getFuel() != fuel) System.out.println("Неверный тип топлива!");
        else setEmpty(false);
    }

    @Override
    public void setFuel(Fuel fuel) {
        super.setFuel(Fuel.Disel);
    }
}
