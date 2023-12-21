package generics;

public class BoundedClass01 <T extends Number> {

    private T data;
    private T data2;

    public BoundedClass01(T data) {
        this.data = data;
    }
    public void display() {
        System.out.println("this is a bounded type generic class");
    }
    public T getData() {
        return data;
    }

    public void calculate() {
        System.out.println(data.doubleValue() + data2.doubleValue());
    }
}
