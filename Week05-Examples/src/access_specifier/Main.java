package access_specifier;


import access_specifier_example.ArithmeticOperation;

public class Main {
    public static void main(String[] args) {

        ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
        arithmeticOperation.sum(20,5);
        System.out.println(arithmeticOperation.sum(20,5));
        divide(20,5);
        helloWorld();
    }

    private static void divide(int number1, int number2) {
        System.out.println((double) number1/number2);
    }

    public static void helloWorld() {
        System.out.println("hello world!");
    }
}
