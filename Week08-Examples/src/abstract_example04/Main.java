package abstract_example04;

import abstract_example03.Animal;

public class Main {
    public static void main(String[] args) {
        MountainBike m1 = new MountainBike();
        m1.brake();
        SportBike s1 = new SportBike();
        s1.brake();

        Animal.sayHello();
    }
}
