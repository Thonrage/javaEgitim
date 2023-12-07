package overriding;

public class OgrenciKrediManagerOverriding extends BaseKrediManagerOverriding {
    public double hesaplama(double tutar) {
        return tutar * 1.10;
    }
}
