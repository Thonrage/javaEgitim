package inheritance02;

public class Dog extends Animal {
    boolean isBite;

    public Dog(String name, int age, boolean isBite) {
        super(name, age);
        this.isBite = isBite;
    }

    @Override
    public void eat() {
        super.eat();  // super classtakini çalıştırır bu <<
        System.out.println("I'm Dog. I can eat pizza");
    }

    public void sayMyName() {
        System.out.println("My name is : " + name);
    }

    public void bark() {
        System.out.println("I can bark");
    }
}