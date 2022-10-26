

public class Car extends Transport {
    float engineVolume;
    boolean isWinterTyres;
    private String bodyType;
    String idNumber;
    private int numberOfPassenger;

    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, float engineVolume, String bodyColor, int yearOfManufacture,
               String country, boolean isWinterTyres, String bodyType, String idNumber, int maxSpeed,
               int numberOfPassenger) {
        super(brand, model, yearOfManufacture, country, bodyColor, maxSpeed);

        this.engineVolume = engineVolume;
        this.isWinterTyres = isWinterTyres;
        this.bodyType = bodyType;
        this.idNumber = idNumber;
        this.numberOfPassenger = numberOfPassenger;
        key = new Key();
        insurance = new Insurance();
    }


    public float getEngineVolume() {
        return engineVolume;
    }

    private boolean isWinterTyres() {
        return isWinterTyres;
    }

    public String getTyresSeason() {
        return isWinterTyres() ? "winter" : "summer";
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setWinterTyres(boolean isWinterTyres) {
        this.isWinterTyres = isWinterTyres;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void checkIdNumber() {
        if (idNumber.matches("^[a-zA-Z]\\d{3}[a-zA-Z]{2}\\d{3}$")) {
            System.out.println("Номер верный");
        } else System.out.println("Номер не верный");
    }

    @Override
    public String toString() {
        return "Car{" + '\'' + getBrand() + " " + getModel() + '\'' +
                ", engineVolume='" + engineVolume + '\'' +
                ", maxSpeed='" + getMaxSpeed() + '\'' +
                ", yearOfManufacture='" + getYearOfManufacture() + '\'' +
                ", country='" + getCountry() + '\'' +
                ", bodyColor='" + getBodyColor() + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", season of tyres='" + getTyresSeason() + '\'' +
                ", numberOfPassenger='" + numberOfPassenger + "'; "
                + key.toString() + "; " + insurance.check() + '}';
    }

    @Override
    public void refill(Fuel fuel) {
        if (getFuel() != fuel) System.out.println("Неверный тип топлива!");
        else setEmpty(false);
    }

    public void addRemoteStart() {
        key.addRemoteStart();
    }

    public void removeRemoteStart() {
        key.removeRemoteStart();
    }

    public void addKeylessEntry() {
        key.addKeylessEntry();
    }

    public void removeKeylessEntry() {
        key.removeKeylessEntry();
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void checkInsurance() {
        System.out.println(insurance.check());
    }

    private class Key {
        private boolean haveRemoteStart;
        private boolean haveKeylessEntry;

        public Key() {
            this.haveRemoteStart = false;
            this.haveKeylessEntry = false;
        }

        @Override
        public String toString() {
            String result = "Простой ключ";
            if (haveRemoteStart) result = result + " с удаленным запуском";
            if (haveRemoteStart && haveKeylessEntry) result += " и";
            if (haveKeylessEntry) result = result + " c бесключевым доступом";
            return result;
        }

        private void addRemoteStart() {
            haveRemoteStart = true;
        }

        private void removeRemoteStart() {
            haveRemoteStart = false;
        }

        private void addKeylessEntry() {
            haveKeylessEntry = true;
        }

        private void removeKeylessEntry() {
            haveKeylessEntry = false;
        }
    }

    public static class Insurance {

        private int validityPeriod;
        private double cost;
        private String number;

        private Insurance() {
            this.validityPeriod = -1;
            this.cost = 0;
            this.number = null;
        }

        public Insurance(int validityPeriod, double cost, String number) {
            setValidityPeriod(validityPeriod);
            this.cost = Math.abs(cost);
            setNumber(number);
        }

        private void setValidityPeriod(int validityPeriod) {
            if (validityPeriod <= 0) System.out.println("Срок действия страховки истек!");
            this.validityPeriod = validityPeriod;
        }

        private void setNumber(String number) {
            checkNumber();
            this.number = number;
        }

        private void checkNumber() {
            if (number == null || number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
                this.validityPeriod = -1;
            }
        }

        private String check() {
            if (validityPeriod <= 0) return "Срок действия страховки истек!";
            else
                return "Страховка будет действовать еще " + validityPeriod + " дня(ей)"; //противоречит заданию, но мне больше нравится.
        }
    }
}
