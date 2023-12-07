package arrays;

import com.sun.org.apache.xpath.internal.objects.XNumber;

public class ReverseArrayAlgorithm {
    public static void main(String[] args) {

        int[] age = {12,4,5,2,5,};
        for (int number :age){
            System.out.println("Dizinin ilk Hali: " + number);
        }
        /*
          for (int i = 0; i<age.length;i++){                // <<Diziyi sondan başa sıralamanın ilk yöntemi
            int ilk = age[i];
            int son = age[age.length-1-i];
            age[i] = son;
            age[age.length-1-i] = ilk;
        }*/

         int temp;
        for(int i =  0 ; i < age.length/2; i++) {
            temp=age[i];
            age[i] = age[age.length-1-i];
            age[age.length-1-i] = temp;
        }
        System.out.println("Dizinin son Hali");
        for (int number:age) {
            System.out.println(number);
        }


    }
}
