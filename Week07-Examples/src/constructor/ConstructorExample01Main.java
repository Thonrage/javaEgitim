package constructor;

public class ConstructorExample01Main {
    String name;
    ConstructorExample01Main() {
        System.out.println("Constructor ConstructorExample01Main");
    }
    public static void main(String[] args) {
        ConstructorExample01 tuce = new ConstructorExample01("TR");
        System.out.println(tuce.language);
        tuce.language = "ESP";
        System.out.println(tuce.language);

        ConstructorExample01 onur = new ConstructorExample01("ENG");
        System.out.println(onur.language);

        System.out.println(tuce.language);
        ConstructorExample01Main bedo = new ConstructorExample01Main();

    }

    public void test() {
        // constructorExample01Object.
    }
}