import animals.*;

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

        System.out.println("Animals");
        Herbivorous gazelle = new Herbivorous("Газель",2,"саванна",50.0,"grass");
        Herbivorous giraffe = new Herbivorous("Жираф",3,"саванна",29.0,"leaves");
        Herbivorous horse = new Herbivorous("Лошадь",4,"конюшня",30.0,"grass");
        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);

        Predator tiger = new Predator("Тигр",5,"джунгли",35,"meat");
        Predator bear = new Predator("Медведь",5,"лес",40,"meat");
        Predator hyena = new Predator("Гиена",5,"саванна",25,"meat");
        System.out.println(tiger);
        System.out.println(bear);
        System.out.println(hyena);

        Amphibian frog = new Amphibian("Жаба",1,"болото");
        Amphibian snake = new Amphibian("Уж",1,"болото");
        Amphibian newSnake = new Amphibian("Уж",1,"болото");
        System.out.println(frog);
        System.out.println(snake);
        System.out.println(newSnake);
        System.out.println("сравнение двух ужей вернет "+ snake.equals(newSnake));

        NonFlyingBird peacock = new NonFlyingBird("Павлин",2,"","ходит");
        NonFlyingBird penguin = new NonFlyingBird("Пингвин",2,"крайний юг","ходит и плавает");
        NonFlyingBird dodoBird = new NonFlyingBird("птица Додо",2,"","ходит");
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodoBird);

        FlyingBird gull = new FlyingBird("Чайка",3,"везде","летает и плавает");
        FlyingBird falcon = new FlyingBird("Сокол",3,"","летает");
        FlyingBird albatross = new FlyingBird("Альбатрос",3,"море","летает и плавает");
        System.out.println(gull);
        System.out.println(falcon);
        System.out.println(albatross);
        System.out.println("****");
    }

}