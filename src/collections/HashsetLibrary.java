package collections;

import javafx.beans.binding.StringExpression;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetLibrary {
    public static void main(String[] args) {
        HashSet<String> hashSet3 = new HashSet<>();
        hashSet3.add("maths");
        hashSet3.add("physics");
        hashSet3.add("chemistry");
        hashSet3.add("maths");
        hashSet3.remove("physics");
        System.out.println("Contains 'physics': ? Ans: " + hashSet3.contains("physics"));
        replaceElement(hashSet3, "maths", "telugu");
        for (String s : hashSet3) {
            System.out.println(s);
        }

    }

    private static void replaceElement(HashSet<String> hashSet3, String old, String  new1) {
        if (hashSet3.contains(old)) {
            hashSet3.remove(old);
            hashSet3.add(new1);
        }
    }
}
