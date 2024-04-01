package week03.oop.principles.inheritance.ornek03;

public class Truck extends Vehicle{
    double  cargoCapacity;

    public Truck(String brand, String model, int year, double cargoCapacity) {
        super(brand, model, year);
        this.cargoCapacity = cargoCapacity;
    }

    public Truck(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    void start() {
        System.out.println(" cargoCapacity is starting");
    }

    @Override
    void stop() {
        System.out.println("cargoCapacity is stopping");
    }
}
