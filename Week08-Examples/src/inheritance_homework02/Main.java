package inheritance_homework02;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(4,"WW","Polo",2013);
        Motorcycle motorcycle = new Motorcycle(false,"kawasaki","m4",2015);
        Truck truck = new Truck(10.0,"Mercedes","a2340",2023);


      car.start();
        System.out.println("Araba özellikleri");
        System.out.println("Kapı sayısı : " + car.setNumDoors(4));
        System.out.println("Marka : " + car.brand);
        System.out.println("Model : " + car.model);
        System.out.println("Çıkış yılı + " + car.year);
        car.stop();

      motorcycle.start();
        System.out.println("Motorsiklet özellikleri");
        System.out.println("Kapısı var mı ? " + motorcycle.hasSidecar);
        System.out.println("Marka : " + motorcycle.brand);
        System.out.println("Model : " + motorcycle.model);
        System.out.println("Çıkış yılı + " + motorcycle.year);
      motorcycle.stop();

      truck.start();
        System.out.println("Kamyon özellikleri");
        System.out.println("Yük taşıma kapasitesi ise : " + truck.setCargoCapacity());
        System.out.println("Marka : " + truck.brand);
        System.out.println("Model : " + truck.model);
        System.out.println("Çıkış yılı + " + truck.year);
      truck.stop();

    }
}

