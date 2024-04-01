package week03.oop.principles.inheritance.ornek03;

public class Car extends Vehicle{
    int numDoors;

    public Car(String brand, String model, int year, int numDoors) {
        super(brand, model, year);
        this.numDoors = numDoors;
    }

    public Car(int numDoors) {
        this.numDoors = numDoors;
    }

    @Override
    void start() {
        System.out.println("Car is starting");
    }

    @Override
    void stop() {
        System.out.println("Car is stopping");
    }
}
