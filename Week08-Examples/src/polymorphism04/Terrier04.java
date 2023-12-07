package polymorphism04;

public class Terrier04 extends Dog04 {

    int size = 2;

    @Override
    public void feetSize() {
        System.out.println("Terrier feetSize");
    }

    @Override
    public void gender() {
        System.out.println("Female");
    }
}
