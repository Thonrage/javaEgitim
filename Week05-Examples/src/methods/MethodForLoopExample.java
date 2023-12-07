package methods;

public class MethodForLoopExample {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        for (int number: numbers) {
            System.out.println(square(number));
        }

    }
    private static int square(int number)  {
        return number*number;
    }
}
