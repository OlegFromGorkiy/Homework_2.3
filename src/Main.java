import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cars");
        Car car = new Car("VW", "Tiguan", 2.0f, "silver",
                2020, "Germany", false, "SUV",
                "A123BC199", 200, 5);

        System.out.println(car);
        car.hasFuel();
        car.refill(Fuel.Electrisity);
        car.fuelType();
        car.setFuel(Fuel.Electrisity);
        car.refill(Fuel.Electrisity);
        car.hasFuel();
        System.out.println("****");

        System.out.println("Trains");
        Train lastochka = new Train("Ласточка", "B-901", 2011, "России",
                null, 301, 3500, "Белорусского вокзала",
                "Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "России",
                null, 270, 1700, "Ленинградского вокзала",
                "Ленинград-Пассажирский", 8);

        System.out.println(lastochka);
        System.out.println(leningrad);
        System.out.println("****");

        System.out.println("Buses");
        Bus gazel = new Bus("ГАЗ", "32217-408", 2005, "Россия", "белый", 150, 13);
        Bus bigBus = new Bus("MAN", "Lion’s City LE", 2012, "Германия", "оранжевый", 180, 120);
        bigBus.setFuel(Fuel.Disel);


        System.out.println("****");
    }

}