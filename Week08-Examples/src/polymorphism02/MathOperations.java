package polymorphism02;

public class MathOperations {
    public double multipy(double number1, double number2) {
        System.out.println("multipy -> double, double");
        return number1 * number2;
    }

    public double multipy (int number1, double number2) {
        System.out.println("multipy -> int , double");
        return number1 * number2;
    }

    public double multipy(double number1, int number2) {
        System.out.println("multipy -> double,int");
        return number1 * number2;
    }

    public int multipy(int number1, int number2) {
        System.out.println("multipy -> int, int");
        return number1 * number2;
    }

    public int multipy(int number1, int number2, int number3) {
        return number1 * number2 * number3;
    }
    public double multipy2 (int number1, double number2) {         // BU OVERLOADING DEĞİL ÇÜNKÜ METHOD İSMİ FARKLI (multipy2) <<<<<<<<<<<<<<---------------
        return number1 * number2;
    }
}