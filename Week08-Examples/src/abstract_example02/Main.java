package abstract_example02;

public class Main {
    public static void main(String[] args) {
        // Shape shape = new Shape(); // <<<<<< <<<<<şekil sınıfından nesne oluşturulamaz abstract yani soyut olduğüu içnünm

        Rectangle rectangle = new Rectangle(5,3);
        System.out.println(rectangle.calculateArea());
        rectangle.draw();

        Circle circle = new Circle(4);
        System.out.println(circle.calculateArea());
        circle.draw();

        Triangle triangle = new Triangle(4,8);
        System.out.println(triangle.calculateArea());
        triangle.draw();
    }
}
