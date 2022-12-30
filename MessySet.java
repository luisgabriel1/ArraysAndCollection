package Udemy.Arrays;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"rawtypes", "unchecked"})

public class MessySet {

    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(1.2);
        set.add(true);
        set.add("Test");
        set.add(1);
        set.add('x');


        System.out.println("Size is: " + set.size());

        set.add("Test");
        System.out.println("Size is: " + set.size());

        System.out.println(set.remove("test"));
        System.out.println(set.remove("Test"));
        System.out.println(set.remove('x'));

        System.out.println("Size is: " + set.size());

        System.out.println(set.contains('x'));
        System.out.println(set.contains(1));
        System.out.println(set.contains(false));
        System.out.println(set.contains(true));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(set);

        set.addAll(nums); // União entre dois conjuntos
        set.retainAll(nums); // Valor em comum
        System.out.println(set);

        set.clear();
        System.out.println(set);
    }
}
