package algoritm;

public class MukemmelSayi {
    public static void main(String[] args) {

        //  Kendisi hariç bütün bölenlerinin ttoplamı kendisini veren sayılara mükemmel sayılar denir. Örneğin 6 ve 28 gibi. 1 ile 1000 arasındaki tüm müğkemmel sayıları bulma örneği!!

         int toplam;
         for (int j = 1; j <= 1000;j++){
             toplam = 0;
             for (int i = 1; i<j; i++){
                 if (j % i == 0){
                     toplam = toplam+i;
                 }
             }
             if (toplam == j) {
                 System.out.println(j + "  Mükemmel bir sayıdır.");
             }
         }


    }
}
