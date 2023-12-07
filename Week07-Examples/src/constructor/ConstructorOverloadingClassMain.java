package constructor;


public class ConstructorOverloadingClassMain {

    public static void main(String[] args) {
      //  ConstructorOverloadingClass object1 = new ConstructorOverloadingClass();

        ConstructorOverloadingClass object2 = new ConstructorOverloadingClass(20,"gmail");
        System.out.println(object2.email);
        System.out.println(object2.address);
        System.out.println(object2.weight);
        System.out.println();
        object2.sayHello();
        ConstructorOverloadingClass object3= new ConstructorOverloadingClass();
        System.out.println(object3.email);
        ConstructorOverloadingClass object4 = new ConstructorOverloadingClass("Tucum","Bal","Cikolata");
        ConstructorOverloadingClass object5 = new ConstructorOverloadingClass(6,7,999999999);
        System.out.println(object5.weight);
        System.out.println(object5.age);
        System.out.println(object5.askolcer);
    }

}

