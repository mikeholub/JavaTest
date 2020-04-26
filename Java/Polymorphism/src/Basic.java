class Car {
    String model;
    private int year;
    private int mileage;
    private boolean engine;
    private int wheels;

    public Car (int year, int mileage, String model) {
        this.year = year;
        this.mileage = mileage;
        this.model = model;
        this.wheels =4;
        this.engine = true;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine () {
        System.out.println("Engine was started!");
    }

    public void accelerate() {
        System.out.println("Accelerating!");
    }

    public void brake() {
        System.out.println("STOP!");
    }
}

class Mazda extends Car {
    public Mazda(int year, int miles) {
        super(year, miles, "323");
    }

    @Override
    public void brake() {
        System.out.println(super.model + "was just stopped");
    }
}

class Toyota extends Car {
    public Toyota(int year, int mileage, String model) {
        super(year, mileage, model);
    }

    @Override
    public void startEngine() {
        System.out.println("Start engine of Toyota" + super.model);
    }
}

class bmw extends Car {
    public bmw() {
        super(2015, 1000, "X5");
    }

    @Override
    public void accelerate() {
        System.out.println("Increasing speed of" + super.model);
    }
}

public class Basic {
        public static void main(String[] args) {
            Hamburger simpleBurger = new Hamburger("white", "ham", 2.9f, "Simple");
            simpleBurger.setCheese(true);
            simpleBurger.setLettuce(true);
            simpleBurger.PriceCalc(simpleBurger.getPrice());

            HealthyBurger healthyBurger = new HealthyBurger("beef", 2.1f, true, false);
            healthyBurger.setCheese(true);
            healthyBurger.PriceCalc(healthyBurger.getPrice());

            DeluxeHamburger deluxeHamburger = new DeluxeHamburger(true, true, 4.5f);
            deluxeHamburger.meat="true";
            deluxeHamburger.setCheese(true);
            deluxeHamburger.PriceCalc(deluxeHamburger.getPrice());

//            Car newCar = new Car(2000, 23000, "Test");
//            newCar.startEngine();
//            newCar.accelerate();
//            newCar.brake();
//
//            Mazda newM = new Mazda(1999, 201111);
//            newM.startEngine();
//            newM.accelerate();
//            newM.brake();

        }
}