package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class GenericMethod {
    public static <T extends Collection<Integer>> void sampleMethod(T ele) {
        for (Integer integer : ele) {
            System.out.println(integer);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(24);
        list.add(56);
        list.add(89);
        list.add(75);
        list.add(36);
        sampleMethod(list);

        List<String> names = new ArrayList<>();
        names.add("aa");
        names.add("bb");
        // sampleMethod(names); // << Integer tanımlandığı için String yollayamayız !!
    }
}
