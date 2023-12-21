package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericClassExample01 {
    public static void main(String[] args) {
        GenericClass<Integer> intObject = new GenericClass<>(5,10);
        System.out.println(intObject.getData());
        System.out.println(intObject.getData2());

        GenericClass<String> stringObj = new GenericClass<>("Java Programming","java");
        System.out.println(stringObj.getData());
        System.out.println(stringObj.getData2());

        List<Object> list = new ArrayList<>();
        User user = new User("name1",23);
        list.add("sdsad");
        list.add(1);
        list.add(10.5);
        list.add(user);
        System.out.println(list);

    }
}
