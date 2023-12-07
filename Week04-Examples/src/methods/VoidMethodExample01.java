package methods;

import java.util.Scanner;

public class VoidMethodExample01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String isim = scanner.next();
        sayHello(isim);
        System.out.println("Lütfen isminizi giriniz: ");
        findMyNote(60);


       // System.out.println("hello: " + isim);

    }
    static void sayHello(String isim){
        System.out.println("hello : " + isim);                   //Method Çaağırmakk!!
    }

    static void findMyNote(int note) {
        if (note > 50) {
            System.out.println("Notunuz: " + note + "," + " Sınavı Başarıyla geçtiniz!");
        }else{
            System.out.println("Sınavdan Kaldınız hemşehrim!");
        }
    }


}

