package dsalearn.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(0, 20);
        list.set(0, 30);
        list.remove(1);

        System.out.println(list.get(0));
        list.clear();
        System.out.println(list);
    }
}
