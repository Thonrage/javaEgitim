package inheritance_homework02;

public class Motorcycle extends Vehicle{
    boolean hasSidecar;

    public Motorcycle(boolean hasSidecar, String brand, String model, int year) {
        super(brand, model, year);
    }


    @Override
    public void start() {
        System.out.println("Motorcycle is starting");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping");
    }
}

