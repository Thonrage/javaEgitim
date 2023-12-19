package hash_map_examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HashMapExample02 {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCties
        HashMap<String, List<String>> capitalCities = new HashMap<>();

        List<String> citiesofEngland = Arrays.asList("London","Cambgridge","Newcastle","Aston Villa");

        // Add keys and values (Country,City)
        capitalCities.put("England",citiesofEngland);

        System.out.println(capitalCities);
    }
}
