package collections;

import java.util.ArrayList;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(2, 10);
        arr.remove(1);
        int index = arr.indexOf(10);
        ArrayList<Integer> subList = new ArrayList<>(arr.subList(0, 2));
        System.out.println(subList);
        System.out.println("index of 10 is "+index);
        System.out.println("ArrayList:");
        for (Integer x : arr) {
            System.out.println(x);
        }
        arr.clear();
        System.out.println("ArrayList after clearing: " + arr);


        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.remove(1);
        linkedList.remove(Integer.valueOf(10));

        System.out.println("LinkedList:");
        for (Integer number : linkedList) {
            System.out.println(number);
        }


        }
    }

