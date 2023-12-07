package polymorphism04;

import inheritance_qa.Dog;

public class TestOverride04 {
    public static void main(String[] args) {
        Animal04 animal = new Animal04();
        animal.feetSize();
        System.out.println(animal.size);

        System.out.println("dogAnimal");
        Animal04 dogAnimal04 = new Dog04();
        dogAnimal04.feetSize();
        System.out.println(dogAnimal04.size);
        System.out.println(dogAnimal04.name);

        Dog04 dog = new Dog04();
        dog.feetSize();
        System.out.println(dog.size);
        dog.gender();


        Dog04 terrierDog = new Terrier04();
        terrierDog.feetSize();
        System.out.println(terrierDog.size);
        terrierDog.gender();
    }
}
