import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        //int number = 6;
        int sayac = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sayac += i;
            }
        }
        if (number == sayac) {
            System.out.println(number + " bir mükemmel sayıdır!");
        } else {
            System.out.println(number + " mükemmel bir sayı değildir");

        }

    }

}
