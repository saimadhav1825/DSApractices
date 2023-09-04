package dsalearn;

import java.util.ArrayList;

public class ArrayListConcept {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(10);
        list.add(20);
        list.add(0);
        list.add(40);
        list.add(50);
        list.add(0, 1);
        list.add(6, 60);
        list.set(6, 61);
        System.out.println(list.indexOf(20));
        System.out.println(list.contains(50));
        System.out.println(list);
        System.out.println(list.get(6));
        list.remove(0);
        list.removeAll(list);

        System.out.println(list);
    }
}
