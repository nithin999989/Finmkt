package collections;

import java.util.HashMap;

public class HashMapLibrary {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap2 = new HashMap<>();
        hashMap2.put("maths", 1);
        hashMap2.put("science", 2);
        hashMap2.put("social", 3);
        hashMap2.put(null,4);
        hashMap2.put(null,5);
        hashMap2.put("telugu",null);
        hashMap2.put("hindi",null);
        System.out.println("HashMap:");
        hashMap2.forEach((key, value) -> System.out.println(key + ": " + value));

    }
}
