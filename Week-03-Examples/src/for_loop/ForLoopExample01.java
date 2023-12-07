package for_loop;

public class ForLoopExample01 {
    public static void main(String[] args) {


        System.out.println("While döngüsü başlıyor bebek tuc");
        int startValue = 0;
        while(startValue <= 10) {
            System.out.println(startValue);
            startValue++;
        }
        System.out.println("While döngüsü bitti bebek tuc");


        System.out.println("For döngüsü başlıyor çocuk tuc");

        for (int i=0; i<=10; i++){
            System.out.println("tucenin tatlılık seviyesi " + i);
        }
        System.out.println("For döngüsü bitii çocuk tuc");

    }
}
