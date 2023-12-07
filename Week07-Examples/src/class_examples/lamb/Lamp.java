package class_examples.lamb;

public class Lamp {

    boolean isOn;

//    public void turnOn() {
//        isOn = true;
//    }
//
//    public void turnOff() {
//        isOn = false;
//    }

    public void changeStatus() {
        isOn = !isOn;
    }
    public void soutLambStatus() {
        System.out.println("lamp status is : " + isOn);
    }
}
