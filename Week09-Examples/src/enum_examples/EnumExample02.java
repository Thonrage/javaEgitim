package enum_examples;

public class EnumExample02 {
    public static void main(String[] args) {
        Size pizzaSize = Size.EXTRALARGE;
        Size pizzaSize2 = Size.SMALL;
        EnumExample02 enumExample02 = new EnumExample02();
        enumExample02.orderPizza(pizzaSize);
        enumExample02.orderPizza(pizzaSize2);

        System.out.println("----ordinal----");
        //ordinal() methodu indexlerini yazart.
        System.out.println(Size.MEDIUM.ordinal());
        System.out.println(Size.EXTRALARGE.ordinal());
        System.out.println(Size.SMALL.ordinal());

        System.out.println("----compareTo----");
        System.out.println(Size.SMALL.compareTo(Size.MEDIUM));
        System.out.println(Size.MEDIUM.compareTo(Size.SMALL));
        System.out.println(Size.EXTRALARGE.compareTo(Size.LARGE));

        //
        System.out.println("----toString----");
        System.out.println(Size.EXTRALARGE.toString());
        String extraLarge = "EXTRALARGE";
        if (Size.EXTRALARGE.toString().equals(extraLarge)) {
            System.out.println("equals");
        }

        System.out.println("----name method----");
        if (Size.EXTRALARGE.name().equals(extraLarge)) {
            System.out.println("equals name methood");
        }

        System.out.println("----valueOf method----");
        if (Size.EXTRALARGE == Size.valueOf(extraLarge)) {       // <<<<<<< == 'de kullanılır equals'de kullanılır
            System.out.println("equals valueOf methood");
        }

        System.out.println("----values method----");
        for (Size size : Size.values()) {
            System.out.println(size);
        }
    }

    public void orderPizza(Size pizzaSize) {
        switch (pizzaSize) {
            case SMALL:
                System.out.println("ordered small coffee");
                break;
            case MEDIUM:
                System.out.println("ordered medium coffee");
                break;
            case LARGE:
                System.out.println("ordered large coffee");
                break;
            case EXTRALARGE:
                System.out.println("ordered extralarge coffee");
                break;
            default:
                System.out.println("we don't have your choice");
        }
    }
}
