package overriding;

public class BaseKrediManagerOverriding {
    public double hesaplama (double tutar) {    // override edilmesin diyorak final ekleyeceğiz!! ekliycez
        return tutar * 1.18;
    }
}
