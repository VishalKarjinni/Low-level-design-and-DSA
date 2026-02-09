package creational_design_pattern.builder;

public class Car {
    private String engine;
    private int wheels;
    private int seats;
    private String color;
    private boolean sunRoof;
    private boolean navigationSystem;

    private Car(CarBuilder carBuilder) {
        this.engine = carBuilder.engine;
        this.wheels = carBuilder.wheels;
        this.seats = carBuilder.seats;
        this.color = carBuilder.color;
        this.sunRoof = carBuilder.sunRoof;
        this.navigationSystem = carBuilder.navigationSystem;
    }

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public String getColor() {
        return color;
    }

    public boolean isSunRoof() {
        return sunRoof;
    }

    public boolean isNavigationSystem() {
        return navigationSystem;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", seats=" + seats +
                ", color='" + color + '\'' +
                ", sunRoof=" + sunRoof +
                ", navigationSystem=" + navigationSystem +
                '}';
    }


    public static class CarBuilder {

        private String engine;
        private int wheels = 4;
        private int seats = 5;
        private String color = "Black";
        private boolean sunRoof = false;
        private boolean navigationSystem = false;

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public CarBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setSunRoof(boolean sunRoof) {
            this.sunRoof = sunRoof;
            return this;
        }

        public CarBuilder setNavigationSystem(boolean navigationSystem) {
            this.navigationSystem = navigationSystem;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

}
