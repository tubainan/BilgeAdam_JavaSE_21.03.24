package week03.oop.principles.inheritance.ornek03;

public class Motorcycle extends Vehicle{
    boolean hasSidecar;

    public Motorcycle(String brand, String model, int year, boolean hasSidecar) {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
    }

    public Motorcycle(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    void start() {
        System.out.println(" Motorcycle is starting");
    }

    @Override
    void stop() {
        System.out.println(" Motorcycle is stopping");
    }
}
