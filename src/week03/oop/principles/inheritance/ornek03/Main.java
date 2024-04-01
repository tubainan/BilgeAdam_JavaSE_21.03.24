package week03.oop.principles.inheritance.ornek03;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle= new Vehicle("BMW" ,"X8",2024);
        vehicle.start();
        System.out.println(vehicle.brand+ "\n"
                +vehicle.model+"\n"
                +vehicle.year);
        vehicle.stop();

        Car car = new Car(4);
        car.start();
        System.out.println(car.numDoors);
        car.stop();

        Motorcycle motorcycle = new Motorcycle(true);
        motorcycle.start();
        System.out.println(motorcycle.hasSidecar);
        motorcycle.stop();

        Truck truck =new Truck(500);
        truck.start();
        System.out.println(truck.cargoCapacity);
        truck.stop();


    }
}
