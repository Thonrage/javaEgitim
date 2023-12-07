package arrays;

public class ArrayExamples05 {
    public static void main(String[] args) {

        int [] arr = {2,-9,0,5,12,-25,22,9,8,12};
        // double sum = 0; BU ŞEKİLDE TANIMLARSAK VİRGÜLDEN SONRASINI VERECEK!!
        int sum = 0;
        double ortalama = 0;

        for (int sayiToplami:arr) {
            sum =sum+sayiToplami;
        }
        System.out.println("Dizinin elemanlarının toplamı : " + sum);
        ortalama = (double)sum / arr.length;  // İKİNCİ YÖNTEM BU. DOUBLE PARANTEZİYLE VERİ TİPİNİN SONUCUNU DOUBLE'A ÇEVİREBİLİRİZ!!
        System.out.println("dizinin ortalaması : " + ortalama);

        /*
        for(int i = 0; i < arr.length; i++){   // Aynı problemin for döngüsü ile çözümü!!

            sum += arr[i];
        }
        System.out.println(sum); */

    }

}

