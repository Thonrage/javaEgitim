package inheritance_homework02;

public class Truck extends Vehicle{

    double cargoCapacity;

    public Truck(double cargoCapacity, String brand, String model, int year) {
        super(brand, model, year);
    }


    @Override
    public void start() {
        System.out.println("Truck is starting");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopping");
    }

    public double setCargoCapacity() {
        return 10.0;
    }
}
