package arrays;

public class ArrayExamples03 {
    public static void main(String[] args) {
       int[] tuc = {12,4,5,2,5};

        // access each array elements
        System.out.println("Accessing Elements of array");
        System.out.println("First element: " + tuc[0]);
        System.out.println("Second element: " + tuc[1]);
        System.out.println("Third element: " + tuc[2]);
        System.out.println("Fourth element: " + tuc[3]);
        System.out.println("Fifth element: " + tuc[4]);

        System.out.println("with for loop printing");
        int arrayLength = tuc.length;
        for (int i=0; i < arrayLength; i++) {
            System.out.println(tuc[i]);
        }
        //age[5] = 29; //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:5

        System.out.println("with foreach loop printing");
        //for(dataType variableName:array)
        for (int diziSayisi:tuc) {
            System.out.println(diziSayisi);
        }

    }
}
