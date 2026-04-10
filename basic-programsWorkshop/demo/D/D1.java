package D;

import java.util.*;

public class D1 {
    public static void main(String[]args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        List<Integer> l2 = new Vector<>();
        l2.add(null);
        list2.add(3);
        list2.add(null);
        list3.add(null);
        list2.add(30);
        list.add(1);
        list.addAll(list2);
        System.out.println(list);

    }
}
