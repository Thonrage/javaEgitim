package linked_list_example;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample02 {
    public static void main(String[] args) {
        Queue<String> languages = new LinkedList<>();

        languages.add("Python");
        languages.add("Java");
        languages.add("C");
        System.out.println(languages);

        String firstElement = languages.peek();  // ilk elemanı getirir
        System.out.println(firstElement);

        String deletedElement = languages.poll();

    }
}
