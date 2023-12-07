package class_examples.lamb;

public class Main {
    public static void main(String[] args) {
        Lamp lampObject = new Lamp();
        lampObject.isOn = false;
        lampObject.soutLambStatus();

        //lampObject.turnOn();

        lampObject.changeStatus();
        lampObject.soutLambStatus();
    }
}
