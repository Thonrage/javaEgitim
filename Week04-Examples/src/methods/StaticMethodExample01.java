package methods;

import algoritm.AccessSpecifierExample;

import java.util.Random;

public class StaticMethodExample01 {
    public static void main(String[] args) {


        int resultDivide = AccessSpecifierExample.divide(10,2);                // Farklı package'lar içerisindeyse, import ederek kullanabiliriz!! << Bu Method aslında AccessSpecifierExample, agloritm package'ı içerisinde içinde!!
        System.out.println(resultDivide);
        int resultDivide2 = StaticMethodExample02.divide(10,2);                // farklı classlar içindeyse ve staticse, class adı + nokta koyarak çağğırabiliriz!! << Bu method aslında StaticMethodExample02 içerisinde içinde!!
        System.out.println(resultDivide2);
        int toplam = sum(5,10);
        System.out.println(toplam);


        /* Random random = new Random();
        random.nextInt(10); */

        StaticMethodExample01 staticMethodExample01 = new StaticMethodExample01();
        int resultMultipy = staticMethodExample01.multipy(2,3);



        StaticMethodExample02 staticMethodExample02 = new StaticMethodExample02();
        staticMethodExample02.multipy(2, 3);



    }

    public static int sum(int number1, int number2){
        return number1 + number2;
    }

      public int multipy(int number1, int number2) {
        return number1 * number2;
      }

}
