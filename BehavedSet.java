package Udemy.Arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class BehavedSet {

    public static void main(String[] args) {

        //Set <String> list = new HashSet<>(); // Fica fora de ordem.
        SortedSet <String> list = new TreeSet<>(); // Fica na ordem alfabetica.
        list.add("Ana");
        list.add("Carlos");
        list.add("Luca");
        list.add("Pedro");

        for(String candidates: list){
            System.out.println(candidates);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for (int n:nums){
            System.out.println(n);
        }
    }
}
