import access_specifier2.AccessSpecifier2;

public class ObjectMutableExample01 {
    public static void main(String[] args) {


        int[] numbers = new int[5];
        for (int number : numbers) {
            System.out.println(number);
        }

        changeArray(numbers);
        int age = 5;
        System.out.println("before changeAge method " + age);
        int newAge = changeAge(age);
        System.out.println("after changeAge method " +  newAge);

    }


    public static int [] changeArray(int[] numbers) {
        numbers[0] = 5;

        return numbers;
    }
    public static int changeAge(int age) {
       age = 10;
       return age;
    }
}