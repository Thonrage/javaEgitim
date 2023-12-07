package overriding;

public class Main {
    public static void main(String[] args) {

        BaseKrediManagerOverriding[] krediManagers = new BaseKrediManagerOverriding[]
                {new OgretmenKrediManagerOverriding(), new TarimKrediManagerOverriding(), new OgrenciKrediManagerOverriding()};
        for (BaseKrediManagerOverriding krediManager : krediManagers) {
            System.out.println(krediManager.hesaplama(1000));

        }
    }
}
