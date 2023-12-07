package inheritance02;

public class Main {

    public static void main(String[] args) {
        Dog labrador = new Dog("karabaş", 20, false);

        labrador.sayMyName();
        labrador.eat();

        Dog kangal = new Dog("benekli", 5, true);

        labrador.sayMyName();
        kangal.sayMyName();
        labrador.bark();

        Cat cat = new Cat("mirnav",3);
        System.out.println("cat");
        cat.eat();
    }
}







