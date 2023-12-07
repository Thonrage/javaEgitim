package inheritance_homework02;

public class Car extends Vehicle{

    int numDoors;

    public Car(int numDoors, String brand, String model, int year) {
        super(brand, model, year);
    }


    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }


    public void brand(String polo) {
    }

    public void model(int i) {
    }

    public void year(int i) {
    }

    public int setNumDoors(int i) {
        return 4;
    }
}
