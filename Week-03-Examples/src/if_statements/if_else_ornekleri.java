package if_statements;

import java.util.Scanner;

public class if_else_ornekleri {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Cinsiyetinizi Giriniz: ");
        String cinsiyet = scan.nextLine();
        System.out.println("Lütfen yaşınızı giriniz: ");
        double yas = scan.nextDouble();


        if (yas < 0 || yas > 90) {
            System.out.println("Girilen yas gecersizdir!");
        }else if (!(cinsiyet.equalsIgnoreCase("Kadin") ||
            cinsiyet.equalsIgnoreCase("Erkek"))){
            System.out.println("Girilen cinsiyet gecersiz!");



        }
        }



    }

