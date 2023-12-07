package constructor;

public class ConstructorOverloadingClass {
    String name;
    String address;
    String email;
    int age;
    int weight;
    int askolcer;


    ConstructorOverloadingClass() {
        System.out.println("no-arg constructor");
    }

    public ConstructorOverloadingClass(int age) {
        this.age = age;
    }

    public ConstructorOverloadingClass(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    ConstructorOverloadingClass(int age, String email) {
        System.out.println("age and email constructor ");
        this.age = age;
        this.email = email;
    }
    public ConstructorOverloadingClass(int age, int weight, int askolcer) {
        System.out.println("Cilgin onur");
        this.age = age;
        this.weight = weight;
        this.askolcer = askolcer;
    }

    public void sayHello() {
        System.out.println("hellooo");
    }
}
