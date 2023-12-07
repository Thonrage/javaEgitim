package inheritance02;

public class Animal {


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String name;
    int age;
    public void eat() {
        System.out.println("I can eat");
    }
}
