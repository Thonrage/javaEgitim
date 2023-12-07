package access_specifier2;

public class AccessSpecifier2 {

    public int sum(int number1, int number2) {
        return number1 + number2;
    }

    public static int sum2(int number1, int number2){
        return number1 + number2;
    }

    protected int sum3 (int number1, int number2){      // BBuna kalıtım yapılmadan erişilemiyor!! << İleride göreceğiz!!
        return number1+number2;
    }
}
