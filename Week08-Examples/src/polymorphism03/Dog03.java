package polymorphism03;

public class Dog03 extends Animal03 {

    @Override
    void sound() {                            // OVERRİDE ETTİĞİMİZ METHODUN PARAMETRESİ, PARAMETRE SAYISI, PARAMETRENİN VERİ TİPİ ve METHODUN DÖNÜŞL TİPİ DEĞİŞTİRİLEMEZ
        super.sound();                        // <- HEM ANİMALDAKİ HEM DE DOGDAKİ METHOD ÇALIŞIR!! EĞER SÜPER YAZARSAK BUNU !
        System.out.println("Dog barks");
    }

    @Override
    public void feetSize() {

    }

}

