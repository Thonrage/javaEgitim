package polymorphism04;


public class Dog04 extends Animal04 {

    int size = 4;

    String name = "hava";

    @Override
    public  void feetSize() {
        System.out.println("Dog feetSize");
    }

    public void gender() {
        System.out.println("Male");
    }

}
